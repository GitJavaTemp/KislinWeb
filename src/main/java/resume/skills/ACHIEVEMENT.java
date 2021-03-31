package resume.skills;

import java.util.ArrayList;

/**
 * Admin
 * 17.02.2021
 */
public class ACHIEVEMENT implements Skills {

    ArrayList<String> achievList = new ArrayList<String>();

    public void viewAttributes() {
        System.out.print("Достижения: ");
        for (String s : achievList) {
            System.out.println(s);
        }
        System.out.println("\n");
    }

    public void setAttributes(String achievement) {
        achievList.add(achievement);
    }
}