package resume;

/**
 * Admin
 * 25.03.2021
 */
public interface IBase {
    void create (Resume r);
    Resume read (String uuid);
    void update (Resume r);
    void delete (String uuid);
    void clear ();
}
