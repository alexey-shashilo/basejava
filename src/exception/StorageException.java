package exception;

public class StorageException extends RuntimeException {
    private final String uuid;

    public StorageException(String massage, String uuid) {
        super(massage);
        this.uuid = uuid;
    }
}
