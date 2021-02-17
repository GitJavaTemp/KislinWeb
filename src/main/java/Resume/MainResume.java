package Resume;

/**
 * Admin
 * 17.02.2021
 */
public class MainResume {
    public static void main(String[] args) {
        Resume programer = new Resume(
                "Oleg Kudrevich", "Krasina 23", "7539843", "Benz-classik@yandex.ru");
        programer.setAchievement("Java SE");
        programer.setAchievement("Java EE");
        programer.setAchievement("Spring");
        programer.setAchievement("MVC");
        programer.setAchievement("Maven");
        programer.setAchievement("Git");

        programer.viewData();
        programer.viewAchievement();
    }

}
