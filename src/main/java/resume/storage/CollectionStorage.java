package resume.storage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import resume.Contact;
import resume.ContactsType;
import resume.Resume;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.stream.Collectors;

/**
 * Admin
 * 25.03.2021
 */
public class CollectionStorage extends AbstractStorage {
    protected Logger log = LogManager.getLogger(getClass().getName());
    Resume resumeout;
    private static final int LIMIT = 100;
    private List<Resume> arrayResume = new ArrayList<>(LIMIT);
    Iterator<Resume> arrIterator;

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

    public void update(Resume r) {
        for (Resume res : arrayResume) {
            if ((res.getUuid()).equals(r.getUuid()))
                res.setFullName(r);
        }
//        arrayResume.stream()
//                .filter(arres -> !uuid.equals(arres.getUuid()))
//                .collect(Collectors.toList());
    }

    public int delete(String uuid) {
/*        arrIterator = arrayResume.iterator();
        int count = 0;
        while (arrIterator.hasNext()) {
            Resume arRes = arrIterator.next();
            if (arRes.getUuid().equals(uuid)) {
                count++;
                log.debug("contains before " + arrayResume.toString());
                arrIterator.remove();
                log.info("Resume with ID = " + uuid + " is succesfully deleted");
                log.debug("contains after " + arrayResume.toString());
            }
        }
        if (count == 0) {
            log.info("Resume with this ID is't placing in database or ID is incorrect");
        }
        return count;*/
        Resume arRes = new Resume( uuid, "delete");
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

    @Override
    public String toString() {
        return "DataStorage{" +
                "arrayResume=" + arrayResume +
                '}';
    }
}