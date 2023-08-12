package cn.tlscstudios.easiertravelcraft.util.exception;

public class AccessDeniedError extends Error {
    public AccessDeniedError(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessDeniedError(String message) {
        super(message);
    }

    public AccessDeniedError(Throwable cause) {
        super(cause);
    }
}
