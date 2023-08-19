package cn.mrcraftteammc.mrscrafttown.util.exception;

public class TranslateError extends Exception {
    public TranslateError(String message, Throwable cause) {
        super(message, cause);
    }

    public TranslateError(String message) {
        super(message);
    }

    public TranslateError(Throwable cause) {
        super(cause);
    }
}
