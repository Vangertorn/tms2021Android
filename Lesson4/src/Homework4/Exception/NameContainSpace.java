package Homework4.Exception;

public class NameContainSpace extends Exception {
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public NameContainSpace(String message) {
        super(message);
    }
}
