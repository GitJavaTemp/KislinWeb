package Resume;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Admin
 * 17.02.2021
 */
public class Resume {

    public String fullName;
    public String adress;
    public String contactNumber;
    public String mail;

    Collection<ACHIEVEMENT> achievement = new ArrayList<ACHIEVEMENT>();
    Collection<EDUCATION> education = new ArrayList<EDUCATION>();
    Collection<EXPERIENCE> experience = new ArrayList<EXPERIENCE>();
    Collection<OBJECTIVE> objective = new ArrayList<OBJECTIVE>();
    Collection<QALIFICATIONS> qalifications = new ArrayList<QALIFICATIONS>();

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

    public void setAchievement(String inputAchievement) {
        achievement.add(new ACHIEVEMENT(inputAchievement));
    }

    public void viewAchievement() {
        System.out.print("Достижения: ");
        for (ACHIEVEMENT s :
                achievement) {
            System.out.println(s.getAchievement());
        }
        System.out.println("\n");
    }

    public void setEducation(String inputEducation) {
        education.add(new EDUCATION(inputEducation));
    }

    public void viewEducation() {
        System.out.print("Образование: ");
        for (EDUCATION s :
                education) {
            System.out.println(s.getEducation());
        }
        System.out.println("\n");
    }

    public void setExperience(String inputExperience) {
        experience.add(new EXPERIENCE(inputExperience));
    }

    public void viewExperience() {
        System.out.print("Опыт: ");
        for (EXPERIENCE s :
                experience) {
            System.out.println(s.getExperience());
        }
        System.out.println("\n");
    }

    public void setObjective(String inputObjective) {
        objective.add(new OBJECTIVE(inputObjective));
    }

    public void viewObjective() {
        System.out.print("Позиция: ");
        for (OBJECTIVE s :
                objective) {
            System.out.println(s.getObjective());
        }
        System.out.println("\n");
    }

    public void setQalifications(String inputQalifications) {
        qalifications.add(new QALIFICATIONS(inputQalifications));
    }

    public void viewQalifications() {
        System.out.print("Квалификация: ");
        for (QALIFICATIONS s :
                qalifications) {
            System.out.println(s.getQualifications());
        }
        System.out.println("\n");
    }
}
