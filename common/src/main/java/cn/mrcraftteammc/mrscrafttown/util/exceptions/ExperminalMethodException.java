package cn.mrcraftteammc.mrscrafttown.util.exceptions;

public class ExperminalMethodException extends RuntimeException {
    public ExperminalMethodException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExperminalMethodException(String message) {
        super(message);
    }

    public ExperminalMethodException(Throwable cause) {
        super(cause);
    }
}
