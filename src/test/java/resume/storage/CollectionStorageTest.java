package resume.storage;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import resume.CompareResumeById;
import resume.Resume;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Admin
 * 06.04.2021
 */
class CollectionStorageTest {
    CollectionStorage storage;
    Resume oleg, maks, chngFlds;

    @BeforeEach
    public void beforeEach() {
        storage = new CollectionStorage();
        oleg = new Resume("12345", "Kudrevich", "Oleg");
        maks = new Resume("Kudrevich", "Maks");
        chngFlds = new Resume("12345", "Kudrevich", "Oleg Yurievich");

        storage.create(oleg);
        storage.create(maks);
    }

    @Test
    void create() {
        storage.create(chngFlds);
        storage.create(new Resume("12345", "inner", "inner"));
        Exception thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            storage.create(null);
        });
        assertEquals("Argument is null", thrown.getMessage());
    }

    @Test
    void read() {
        assertEquals(oleg, storage.read("12345"));
        assertEquals(maks, storage.read(maks.getUuid()));
    }

    @Test
    void update() {
        assertEquals("Oleg", oleg.getFirstName());
        storage.update(chngFlds);
        assertEquals("Oleg Yurievich", oleg.getFirstName());
    }

    @Test
    void sort() {
        storage.create(new Resume("123","Petrov", "Ivan"));
        storage.create(new Resume("1234","Petrova", "Sveta"));
        storage.create(new Resume("1236","Ivanova", "Katja"));
        System.out.println("before sort");
        for (int i = 0; i < storage.size(); i++) {
            System.out.println(storage.readAll().get(i));
        }
//        Collections.sort(storage.readAll(), new CompareResumeById());
        storage.sort();
        System.out.println("after sort");
        for (int i = 0; i < storage.size(); i++) {
            System.out.println(storage.readAll().get(i));
        }
    }

    @Test
    void delete() {
        assertEquals(storage.delete(maks.getUuid()), 1);
        assertEquals(storage.delete(chngFlds.getUuid()), 1);
    }

    @Test
    void clear() {
        storage.clear();
    }

    @Test
    void size() {
        assertEquals(2, storage.size());
    }
}