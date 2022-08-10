package resume;

import java.util.*;

/**
 * Admin
 * 17.02.2021
 */
public class Resume implements Comparable<Resume> {

    private String firstName;
    private String lastName;
    private String uuid;
    List<Contact> contactList = new ArrayList<>();
    List<Section> sectionList = new ArrayList<>();

    public Resume(String uuid, String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uuid = uuid;
    }

    public Resume(String lastName, String firstName) {
        this((UUID.randomUUID()).toString(), lastName, firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUuid() {
        return uuid;
    }

    public void setFirstName(Resume r) {
        this.firstName = r.firstName;
    }

    public void addContacts(Contact c) {
        contactList.add(c);
    }

    public void addSkills(Section s) {
        sectionList.add(s);
    }

    public void viewData() {
        System.out.println("ФИО: " + firstName);

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

    @Override
    public String toString() {
        return "Resume{" +
                "lastName = '" + lastName + ", firstName = '" + firstName +
                ", uuid = '" + uuid + '}';
    }

    @Override
    public int compareTo(Resume res) {
        int result = this.getLastName().compareTo(res.getLastName());
        if (result == 0) {
            return this.getFirstName().compareTo(res.getFirstName());
        }
        return result;
    }
}

