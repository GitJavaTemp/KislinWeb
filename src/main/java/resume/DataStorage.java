package resume;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.stream.Collectors;

/**
 * Admin
 * 25.03.2021
 */
public class DataStorage implements IBase {
    Resume resumeout;
    private static final int LIMIT = 100;
    private List<Resume> arrayResume = new ArrayList<Resume>(LIMIT);
    Iterator<Resume> arrIt;

    public void create(Resume r) {
        if (r != null & !arrayResume.contains(r))
            arrayResume.add(r);
        else
            System.out.println("Your resume is already placing in database");
    }

    public Resume read(String uuid) {

        for (Resume res : arrayResume) {
            if (res.getUuid().equals(uuid))
                resumeout = res;
        }
        return resumeout;
    }

    public void update(Resume r) {
        for (Resume res : arrayResume) {
            if ((res.getUuid()).equals(r.getUuid()))
                res.setFullName(r);
        }
    }

    public void delete(String uuid) {
        arrIt = arrayResume.iterator();
        int count = 0;
        while (arrIt.hasNext()) {
            Resume arRes = arrIt.next();
            if (arRes.getUuid().equals(uuid)) {
                count++;
                System.out.println("contains before " + arrayResume.toString());
                arrIt.remove();
                System.out.println("Resume with ID = " + uuid + " is succesfully deleted");
                System.out.println("contains after " + arrayResume.toString());
            }
        }
        if (count == 0) System.out.println("Resume with this ID is't placing in database or ID is incorrect");
    }

    public void clear() {
        System.out.println("contains before " + arrayResume.toString());
        arrayResume.clear();
        System.out.println("contains after " + arrayResume.toString());
    }

    public int size() {
        return arrayResume.size();

    }

    @Override
    public String toString() {
        return "DataStorage{" +
                "arrayResume=" + arrayResume +
                '}';
    }
}