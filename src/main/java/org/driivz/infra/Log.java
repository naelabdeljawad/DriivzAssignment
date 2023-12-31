package org.driivz.infra;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log {
    final static Logger logger = LogManager.getLogger(Log.class.getName());

    public static void debug(Object message) {
        logger.debug(message);
    }

    public static void error(Object message) {
        logger.error(message);
    }

    public static void fatal(Object message) {
        logger.fatal(message);
    }

    public static void info(Object message) {
        logger.info(message);
    }

    public static void trace(Object message) {
        logger.trace(message);
    }

    public static void warn(Object message) {
        logger.warn(message);
    }
}
