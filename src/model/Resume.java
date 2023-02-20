package model;

import java.util.Objects;

/**
 * Initial resume class
 */
public class Resume {

    // Unique identifier
    private final String uuid;
    public Resume(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return uuid.equals(resume.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
    public String getUuid() {
        return uuid;
    }
}