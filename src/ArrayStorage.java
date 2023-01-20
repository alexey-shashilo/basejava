import static java.lang.System.arraycopy;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int countResume = 0;

    void clear() {
        for (int i = 0; i < countResume; i++) {
            storage[i] = null;
        }
        countResume = 0;
    }

    void save(Resume r) {
        storage[countResume] = r;
        countResume++;
    }

    Resume get(String uuid) {
        for (int i = 0; i < countResume; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < countResume; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                storage[i] = storage[countResume - 1];
                storage[countResume - 1] = null;
                countResume--;
            }
        }
    }

    Resume[] getAll() {
        Resume[] resumes = new Resume[countResume];
        arraycopy(storage, 0, resumes, 0, countResume);
        return resumes;
    }

    int size() {
        return countResume;
    }
}
