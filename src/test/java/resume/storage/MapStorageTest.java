package resume.storage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.omg.CORBA.portable.ApplicationException;
import resume.Resume;

import static org.junit.jupiter.api.Assertions.*;

/**
 * KislinWeb
 * Admin
 * 04.08.2022
 */
class MapStorageTest {
    MapStorage storage;
    Resume oleg, maks, chngFlds;

    @BeforeEach
    public void beforeEach() {
        storage = new MapStorage();
        oleg = new Resume("12345", "Oleg");
        maks = new Resume("Maks");
        chngFlds = new Resume("12345", "Oleg Kudrevich");

        storage.create(oleg);
        storage.create(maks);
    }

    @Test
    void create() {

        Exception thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            storage.create(null);
        });
        assertEquals("Argument is null", thrown.getMessage());
        storage.create(chngFlds);
        storage.create(new Resume("12345", "inner"));
    }

    @Test
    void read() {
        assertEquals(oleg, storage.read("12345"));
        assertEquals(maks, storage.read(maks.getUuid()));
    }

    @Test
    void update() {
        assertEquals("Oleg", oleg.getFullName());
        storage.update(chngFlds);
        assertEquals("Oleg Kudrevich", oleg.getFullName());
    }

    @Test
    void delete() {
        assertEquals(storage.delete(maks.getUuid()),1);
        assertEquals(storage.delete(chngFlds.getUuid()),1);
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
