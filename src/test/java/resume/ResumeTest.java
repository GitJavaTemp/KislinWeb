package resume;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Admin
 * 16.03.2021
 */
class ResumeTest {

    @org.junit.jupiter.api.Test
    void addContacts() {
    }

    @org.junit.jupiter.api.Test
    void viewData() {
    }
    @org.junit.jupiter.api.Test
    void testContacts() {
        Contact contact = new Contact(ContactsType.EMAIL, "benz");
        assertNotNull(contact);
        assertEquals("benz",contact.getValue());
        assertEquals(ContactsType.EMAIL,contact.getType());
    }

}