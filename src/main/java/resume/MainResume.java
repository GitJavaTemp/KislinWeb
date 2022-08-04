package resume;

import java.util.Arrays;
import java.util.UUID;

/**
 * Admin
 * 17.02.2021
 */
public class MainResume {
//test git
    public static void main(String[] args) {
        Resume programer = new Resume("Oleg");
        Resume programer2 = new Resume("Oleg2");
        Resume programer3 = new Resume("Oleg3");
        Link l = new Link("nameReflection", "urlReflection");
        System.out.println(l);
        programer.addContacts(new Contact(ContactsType.ADRESS, "Minsk city"));
        programer.addContacts(new Contact(ContactsType.MOBILENUMBER, "12345678"));
        programer.addContacts(new Contact(ContactsType.EMAIL, "mail@mail.ru"));

/*      programer.achievement.setAttributes("Разработака десктопных приложений, основы WEB");
        programer.education.setAttributes("BSUIR 2000-2005");
        programer.experience.setAttributes("Два года");
        programer.qalifications.setAttributes("Java SE, Java EE");
        programer.qalifications.setAttributes("Spring, MVC, Maven, Git");
        programer.objective.setAttributes("Freelancer");
        */

        System.out.println("-----------------");
        programer.viewData();
        System.out.println("------------------------------");

/*        programer.achievement.viewAttributes();
        programer.education.viewAttributes();
        programer.experience.viewAttributes();
        programer.qalifications.viewAttributes();
        programer.objective.viewAttributes();
        System.out.println(programer.toString()+" "+ programer.hashCode());
        */
        System.out.println(UUID.randomUUID());


    }

}
