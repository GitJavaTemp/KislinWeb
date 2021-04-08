package resume;

import java.util.ArrayList;
import java.util.List;

/**
 * Admin
 * 25.03.2021
 */
public class DataStorage implements IBase {

    private static final int LIMIT = 100;
    private List<Resume> arrayResume = new ArrayList<Resume>(LIMIT);

    public void create(Resume r) {
        if (arrayResume.size() == 0) arrayResume.add(r);
        else {
            for (Resume arres : arrayResume) {
                if (arres.getFullName() != r.getFullName())
                    arrayResume.add(r);
                else
                    System.out.println("Your resume is already placing in database");
            }
        }
    }

    public Resume read(String uuid) {
        return null;
    }

    public void update(Resume r) {

    }

    public void delete(String uuid) {

    }

    public void clear() {

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
