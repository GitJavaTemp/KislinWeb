package resume;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Admin
 * 06.04.2021
 */
class DataStorageTest {

    DataStorage storage;
    Resume oleg;
    Resume maks;
    Resume chngFlds;

    @BeforeEach
    public void beforeEach() {
        storage = new DataStorage();
        oleg = new Resume("12345","Oleg");
        maks = new Resume("Maks");
        chngFlds =  new Resume("12345","Oleg Kudrevich");

        storage.create(oleg);
        storage.create(maks);
//        storage.create(chgnFlds);
        storage.create(new Resume("Sasha"));
    }

    @Test
    void create() {

    }

    @Test
    void createException() {
        storage.create(oleg);
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
        storage.delete(oleg.getUuid());
        storage.delete(maks.getUuid());
        storage.delete(chngFlds.getUuid());
    }

    @Test
    void clear() {
        storage.clear();
    }

    @Test
    void size() {
        assertEquals(3, storage.size());
    }
}