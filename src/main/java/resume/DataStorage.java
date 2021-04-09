package resume;

import java.util.ArrayList;
import java.util.List;

/**
 * Admin
 * 25.03.2021
 */
public class DataStorage implements IBase {
    Resume resumeout;
    private static final int LIMIT = 100;
    private List<Resume> arrayResume = new ArrayList<Resume>(LIMIT);

    public void create(Resume r) {
        if (r != null & !arrayResume.contains(r))
            arrayResume.add(r);
        else
            System.out.println("Your resume is already placing in database");
    }

    public Resume read(String uuid) {

        for (Resume res : arrayResume) {
            if (res.getUuid() == uuid)
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
        for (int i = 0; i < arrayResume.size(); i++) {
            while (arrayResume.iterator().hasNext()) {
                Resume iterRes = arrayResume.iterator().next();
                if (iterRes.getUuid() == uuid) {
                    arrayResume.iterator().remove();
                    System.out.println("Your resume is succesfully deleted");
                } else System.out.println("Resume with this ID is't placing in database");

            }

        }
    }
        public void clear () {

        }

        public int size () {
            return arrayResume.size();

        }

        @Override
        public String toString () {
            return "DataStorage{" +
                    "arrayResume=" + arrayResume +
                    '}';
        }
    }