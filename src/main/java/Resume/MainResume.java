package Resume;

/**
 * Admin
 * 17.02.2021
 */
public class MainResume {
    public static void main(String[] args) {
        Resume programer = new Resume(
                "Oleg Kudrevich", "Krasina 23",
                "7539843", "Benz-classik@yandex.ru");

        programer.achievement.setAttributes("Разработака десктопных приложений, основы WEB");
        programer.education.setAttributes("BSUIR 2000-2005");
        programer.experience.setAttributes("Два года");
        programer.qalifications.setAttributes("Java SE, Java EE");
        programer.qalifications.setAttributes("Spring, MVC, Maven, Git");
        programer.objective.setAttributes("Freelancer");

        System.out.println("-----------------------------");
        programer.viewData();
        System.out.println("-----------------------------");

        programer.achievement.viewAttributes();
        programer.education.viewAttributes();
        programer.experience.viewAttributes();
        programer.qalifications.viewAttributes();
        programer.objective.viewAttributes();
    }

}
