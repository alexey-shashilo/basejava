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
        countResume += 1;
    }

    Resume get(String uuid) {
        for (Resume resume : storage) {
            if (resume != null && resume.getUuid().equals(uuid)) {
                return resume;
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < countResume; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                storage[i] = storage[countResume - 1];
                storage[countResume - 1] = null;
                countResume -= 1;
            }
        }
    }

    Resume[] getAll() {
        Resume[] r = new Resume[size()];
        for (int i = 0; i < countResume; i++) {
            r[i] = storage[i];
        }
        return r;
    }

    int size() {
        return countResume;
    }
}
