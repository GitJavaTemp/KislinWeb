package resume;

import java.util.Comparator;

public class CompareResumeById implements Comparator<Resume> {
    @Override
    public int compare(Resume resume1, Resume resume2) {
        return resume1.getUuid().compareTo(resume2.getUuid());
    }
}
