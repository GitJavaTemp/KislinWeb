package Resume.Skills;

import java.util.ArrayList;

/**
 * Admin
 * 17.02.2021
 */
public class EDUCATION implements Skills {

    ArrayList<String> eduList = new ArrayList<String>();

    public void viewAttributes() {
        System.out.print("Образование: ");
        for (String s : eduList) {
            System.out.println(s);
        }
        System.out.println("\n");
    }

    public void setAttributes(String achievement) {
        eduList.add(achievement);
    }
}
