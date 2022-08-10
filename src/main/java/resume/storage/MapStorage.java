package resume.storage;

import resume.Resume;
import java.util.HashMap;
import java.util.Map;

/**
 * KislinWeb
 * Admin
 * 18.07.2022
 */
public class MapStorage extends AbstractStorage {
    Map<String, Resume> map = new HashMap<>();

    @Override
    public void doCreate(Resume resume) {
        if (!map.containsKey(resume.getUuid())) {
            map.put(resume.getUuid(), resume);
            log.debug("Create resume " + resume.getUuid());
        } else
            log.info("Resume with this ID is already placing in database");
    }

    @Override
    public Resume read(String uuid) {
//        if (map.containsKey(uuid))
         return map.get(uuid);
//        else
//            log.info("Resume with this ID isn't placing in database");
    }

    @Override
    public void update(Resume resume) {
        if (map.containsKey(resume.getUuid())) {
            map.put(resume.getUuid(), resume);
            log.debug("Update resume " + resume.getUuid());
        } else
            log.info("Resume with this ID isn't placing in database");
    }

    @Override
    public int delete(String uuid) {
        if (map.containsKey(uuid)) {
            map.remove(uuid);
            return 1;
        } else return 0;
    }

    @Override
    public void clear() {
        map.clear();
    }
    public int size(){
        return map.size();
    }
}
