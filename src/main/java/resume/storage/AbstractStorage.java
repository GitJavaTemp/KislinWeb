package resume.storage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import resume.Resume;

/**
 * Admin
 * 16.07.2022
 */
public abstract class AbstractStorage implements IStorage {
    protected Logger log = LogManager.getLogger(getClass().getName());

    public void create(Resume resume) throws NullPointerException {
        if (resume != null) {
            doCreate(resume);
        } else throw new NullPointerException("Argument is null");
    }

    public abstract void doCreate(Resume resume);
}
