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

    Collection<ACHIEVEMENT> achievement = new ArrayList();
    Collection<EDUCATION> education = new ArrayList();
    Collection<EXPERIENCE> experience = new ArrayList();
    Collection<OBJECTIVE> objective = new ArrayList();
    Collection<QALIFICATIONS> qalifications = new ArrayList();

    public Resume(String fullName, String adress, String contactNumber, String mail) {
        this.fullName = fullName;
        this.adress = adress;
        this.contactNumber = contactNumber;
        this.mail = mail;
    }

    public void setAchievement(String inputAchievement) {
        achievement.add(new ACHIEVEMENT(inputAchievement));
    }

    public void viewAchievement() {
        for (ACHIEVEMENT s:
             achievement) {
            System.out.println(s.getAchievement());
        }
    }
    public void viewData(){
        System.out.println("ФИО: " + fullName);
        System.out.println("Адрес: " + adress);
        System.out.println("Контактный телефон: " + contactNumber);
        System.out.println("Электронная почта: " + mail);
    }

//    public void setEducation(Collection<Resume.EDUCATION> education) {
//        this.education = education;
//    }
//
//    public void setExperience(Collection<Resume.EXPERIENCE> experience) {
//        this.experience = experience;
//    }
//
//    public void setObjective(Collection<Resume.OBJECTIVE> objective) {
//        this.objective = objective;
//    }
//
//    public void setQalifications(Collection<Resume.QALIFICATIONS> qalifications) {
//        this.qalifications = qalifications;
//    }
}
