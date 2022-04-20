package com.company.logging;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

public class Log4JEx {
    public static void main(String[] args) {
//        Configurator.setLevel(logger, Level.INFO);

        LoggerContext context = (LoggerContext) LogManager.getContext();
        context.setConfigLocation(new File("log4j2.xml").toURI());

        Logger logger = context.getRootLogger();
        Logger fileLogger = context.getLogger("files");

        logger.info("hello console logger");
        fileLogger.info("hello file logger");



    }
}
