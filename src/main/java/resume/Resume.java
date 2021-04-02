package resume;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Admin
 * 17.02.2021
 */
public class Resume {

    private String fullName;
    private String uuid;
    List<Contact> contactList = new ArrayList();
    List<Section> sectionList = new ArrayList();

    public Resume(String uuid, String fullName) {
        this.fullName = fullName;
        this.uuid = uuid;
    }
    public Resume(String fullName){
        this((UUID.randomUUID()).toString(), fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public String getUuid() {
        return uuid;
    }


    public void addContacts(Contact c) {
        contactList.add(c);
    }

    public void addSkills(Section s){sectionList.add(s);}

    public void viewData() {
        System.out.println("ФИО: " + fullName);

        for (Contact c : contactList) {
            System.out.println(c);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resume resume = (Resume) o;

        return uuid.equals(resume.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }
}
