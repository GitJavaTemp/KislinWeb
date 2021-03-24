package Resume;

/**
 * Admin
 * 07.03.2021
 */
public enum ContactsType {
    EMAIL("Электронная почта"),
    ADRESS("Место жительства"),
    MOBILENUMBER("Моильный тел."),
    HOMENUMBER("Домашний тел."),
    VIBER("Вайбер"),
    SKYPE("Скайп");

    private String title;

    ContactsType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
