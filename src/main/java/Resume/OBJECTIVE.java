package Resume;

import java.util.ArrayList;

/**
 * Admin
 * 17.02.2021
 */
public class OBJECTIVE {
    ArrayList<String> objList = new ArrayList<String>();

    public void viewAttributes() {
        System.out.print("Достижения: ");
        for (String s : objList) {
            System.out.println(s);
        }
        System.out.println("\n");
    }

    public void setAttributes(String achievement) {
        objList.add(achievement);
    }
}
