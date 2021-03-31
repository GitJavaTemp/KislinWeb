package resume;

/**
 * Admin
 * 20.03.2021
 */
public class Contact {
    private final ContactsType type;
    private final String value;

    public Contact(ContactsType type, String value) {
        this.type = type;
        this.value = value;
    }

    public ContactsType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public Contact getContact(){
        return this;
    }

    @Override
    public String toString() { return type + " - " + value;}
}
