/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                break;
            }
            storage[i] = null;
        }
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                break;
            }
        }
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
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                storage[i] = null;
                break;
            }
        }
        for (int i = 1; i < storage.length; i++) {
            if (storage[i - 1] == null){
                storage[i - 1] = storage[i];
                storage[i] = null;
            }
        }
    }

    Resume[] getAll() {
        Resume[] r = new Resume[size()];
        for (int i = 0; i < r.length; i++) {
            if (storage[i] == null) {
                break;
            }
            r[i] = storage[i];
        }
        return r;
    }

    int size() {
        int size = 0;
        for (Resume resume : storage) {
            if (resume == null) {
                break;
            }
            size += 1;
        }
        return size;
    }
}
