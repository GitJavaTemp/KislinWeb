package resume.storage;

import resume.Resume;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Admin
 * 25.03.2021
 */
public class CollectionStorage extends AbstractStorage {
    Resume resumeout;
    private static final int LIMIT = 100;
    private List<Resume> arrayResume = new ArrayList<>(LIMIT);

    public void doCreate(Resume resume) {
        if (!arrayResume.contains(resume)) {
            arrayResume.add(resume);
            log.debug("Create resume " + resume.getUuid());
        } else
            log.info("Your resume is already placing in database");
    }

    public Resume read(String uuid) {

        for (Resume res : arrayResume) {
            if (res.getUuid().equals(uuid))
                resumeout = res;
        }
        return resumeout;
    }

    public List readAll(){
        return  arrayResume;
    }

    public void update(Resume r) {
        for (Resume res : arrayResume) {
            if ((res.getUuid()).equals(r.getUuid()))
                res.setFirstName(r);
        }
    }

    public int delete(String uuid) {
        Resume arRes = new Resume( uuid, "delete", "delete");
        int count = 0;
        if (arrayResume.contains(arRes)) {
            while (arrayResume.remove(arRes)) {
                count++;
            }
        }else
            log.info("Resume with this ID is't placing in database or ID is incorrect");
        return count;
    }

    public void clear() {
        log.debug("contains before " + arrayResume.toString());
        arrayResume.clear();
        log.info("clear database");
        log.debug("contains after " + arrayResume.toString());
    }

    public int size() {
        return arrayResume.size();

    }
    public List sort(){
        Collections.sort(arrayResume);
        return arrayResume;
    }

    @Override
    public String toString() {
        return "CollectionStorage{" +
                "arrayResume=" + arrayResume +
                '}';
    }
}
