package resume.storage;

import resume.Resume;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * KislinWeb
 * Admin
 * 18.07.2022
 */
public class MapStorage extends AbstractStorage {
    protected Logger log = LogManager.getLogger(getClass().getName());
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
        return map.get(uuid);
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
