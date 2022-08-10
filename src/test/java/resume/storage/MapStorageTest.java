package resume.storage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
        oleg = new Resume("12345", "Kudrevich", "Oleg");
        maks = new Resume("Kudrevich", "Maks");
        chngFlds = new Resume("12345", "Kudrevich", "Oleg Yurievich");

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
        assertEquals("Oleg", oleg.getFirstName());
        storage.update(chngFlds);
        assertEquals("Oleg Kudrevich", storage.read(chngFlds.getUuid()).getFirstName());
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
