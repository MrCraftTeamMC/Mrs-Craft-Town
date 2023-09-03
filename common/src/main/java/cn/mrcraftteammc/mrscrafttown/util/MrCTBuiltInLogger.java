package cn.mrcraftteammc.mrscrafttown.util;

import cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod;
import org.slf4j.Logger;


public class MrCTBuiltInLogger {
    private static Logger LOGGER = MrsCraftTownMod.LOGGER;

    public MrCTBuiltInLogger(Logger logger) {
        this.LOGGER = logger;
    }

    public static void info(String message) throws IllegalArgumentException, NullPointerException {
        if (message.isEmpty()) {
            throw new IllegalArgumentException("The Info String is invalid");
        } else if (message == null) {
            throw new NullPointerException("The Info String is Null");
        }
        LOGGER.info("[" +  LOGGER.getName().toString() + "] " + message);
    }

    public static void warn(String message) throws IllegalArgumentException, NullPointerException {
        if (message.isEmpty()) {
            throw new IllegalArgumentException("The Info String is invalid");
        } else if (message == null) {
            throw new NullPointerException("The Info String is Null");
        }
        LOGGER.warn("[" +  LOGGER.getName().toString() + "] " + message);
    }

    public static void error(String message) throws IllegalArgumentException, NullPointerException {
        if (message.isEmpty()) {
            throw new IllegalArgumentException("The Info String is invalid");
        } else if (message == null) {
            throw new NullPointerException("The Info String is Null");
        }
        LOGGER.error("[" +  LOGGER.getName().toString() + "] " + message);
    }

    public static void trace(String message) throws IllegalArgumentException, NullPointerException {
        if (message.isEmpty()) {
            throw new IllegalArgumentException("The Info String is invalid");
        } else if (message == null) {
            throw new NullPointerException("The Info String is Null");
        }
        LOGGER.trace("[" +  LOGGER.getName().toString() + "] " + message);
    }

    public static void debug(String message) throws IllegalArgumentException, NullPointerException {
        if (message.isEmpty()) {
            throw new IllegalArgumentException("The Info String is invalid");
        } else if (message == null) {
            throw new NullPointerException("The Info String is Null");
        }
        LOGGER.debug("[" + LOGGER.getName().toString() + "] " + message);
    }
}
