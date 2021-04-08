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

    {

    }

    @BeforeEach
    public void beforeEach() {
        storage = new DataStorage();
        storage.create(new Resume("Oleg"));
        storage.create(new Resume("Maks"));
        storage.create(new Resume("Sasha"));
    }

    @Test
    void create() {

    }

    @Test
    void createException() {
        storage.create(new Resume("Oleg"));
        System.out.println(storage.size());
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
//        System.out.println(storage.toString());
    }
}