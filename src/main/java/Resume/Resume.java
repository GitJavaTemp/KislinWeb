package Resume;

/**
 * Admin
 * 17.02.2021
 */
public class Resume {

    private String fullName;
    private String adress;
    private String contactNumber;
    private String mail;

    ACHIEVEMENT achievement = new ACHIEVEMENT();
    EDUCATION education = new EDUCATION();
    EXPERIENCE experience = new EXPERIENCE();
    QALIFICATIONS qalifications = new QALIFICATIONS();
    OBJECTIVE objective = new OBJECTIVE();


    public Resume(String fullName, String adress, String contactNumber, String mail) {
        this.fullName = fullName;
        this.adress = adress;
        this.contactNumber = contactNumber;
        this.mail = mail;
    }

    public void viewData() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Адрес: " + adress);
        System.out.println("Контактный телефон: " + contactNumber);
        System.out.println("Электронная почта: " + mail);
    }
}
