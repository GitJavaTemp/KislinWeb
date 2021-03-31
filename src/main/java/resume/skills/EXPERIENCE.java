package resume.skills;

import java.util.ArrayList;

/**
 * Admin
 * 17.02.2021
 */
public class EXPERIENCE implements Skills{

    ArrayList<String> experList = new ArrayList<String>();

    public void viewAttributes() {
        System.out.print("Опыт: ");
        for (String s : experList) {
            System.out.println(s);
        }
        System.out.println("\n");
    }

    public void setAttributes(String achievement) {
        experList.add(achievement);
    }
}
