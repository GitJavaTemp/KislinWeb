package Resume;

import Resume.Skills.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Admin
 * 17.02.2021
 */
public class Resume {

    private String fullName;
    List<Contact> contactList = new ArrayList();
    List<Section> sectionList = new ArrayList();

    public Resume(String fullName) {
        this.fullName = fullName;
    }


    public void addContacts(Contact c) {
        contactList.add(c);
    }

    public void viewData() {
        System.out.println("ФИО: " + fullName);

        for (Contact c : contactList) {
            System.out.println(c);
        }
    }
}
