package resume.storage;

import resume.Resume;

/**
 * Admin
 * 25.03.2021
 */
public interface IStorage {
    void create (Resume r);
    Resume read (String uuid);
    void update (Resume r);
    int delete (String uuid);
    void clear ();
}
