package Resume;

/**
 * Admin
 * 17.02.2021
 */
public class MainResume {
    public static void main(String[] args) {
        Resume programer = new Resume(
                "Oleg Kudrevich", "Krasina 23", "7539843", "Benz-classik@yandex.ru");

        programer.setAchievement("Разработака десктопных приложений, основы WEB");
        programer.setEducation("BSUIR 2000-2005");
        programer.setExperience("Два года");
        programer.setQalifications("Java SE, Java EE");
        programer.setQalifications("Spring, MVC, Maven, Git");
        programer.setObjective("Freelancer");

        System.out.println("-----------------------------");
        programer.viewData();
        System.out.println("-----------------------------");

        programer.viewEducation();
        programer.viewExperience();
        programer.viewAchievement();
        programer.viewQalifications();
        programer.viewObjective();
    }

}
