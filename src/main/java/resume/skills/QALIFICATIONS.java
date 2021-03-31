package resume.skills;

import java.util.ArrayList;

/**
 * Admin
 * 17.02.2021
 */
public class QALIFICATIONS implements Skills{
    ArrayList<String> qualList = new ArrayList<String>();

    public void viewAttributes() {
        System.out.print("Квалификация: ");
        for (String s : qualList) {
            System.out.println(s + " " + s.hashCode());
        }
        System.out.println("\n");
    }

    public void setAttributes(String achievement) {
        qualList.add(achievement);
    }
}
