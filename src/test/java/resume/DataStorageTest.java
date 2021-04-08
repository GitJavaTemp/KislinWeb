package resume;

import org.junit.jupiter.api.BeforeAll;
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

    {

    }

    @BeforeEach
    public void beforeEach() {
        storage = new DataStorage();
        oleg = new Resume("Oleg");
        storage.create(oleg);
        storage.create(new Resume("Maks"));
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
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void clear() {
    }

    @Test
    void size() {
        assertEquals(3, storage.size());
    }
}