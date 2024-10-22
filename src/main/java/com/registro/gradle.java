package com.registro;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gradle {
    private static final Logger logger = LogManager.getLogger(gradle.class);

    public static void main(String[] args) {
        logger.trace("Este es un mensaje de traza.");
        logger.debug("Este es un mensaje de depuración.");
        logger.info("Este es un mensaje informativo.");
        logger.warn("Este es un mensaje de advertencia.");
        logger.error("Este es un mensaje de error.");
        logger.fatal("Este es un mensaje fatal.");
    }
}