package com.company.logging;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Main.class.getName());
        LogManager.getLogManager().readConfiguration(Files.newInputStream(Paths.get("logging.properties")));

        LogRecord logRecord = new LogRecord(Level.INFO, "I'm log record");

        Handler handler = new ConsoleHandler();
        handler.setFormatter(new SimpleFormatter());

        logger.info(logger.getParent().toString());

//        logger.addHandler(fh);
        logger.warning("hello warn");
        logger.info("info log00-----------");
        logger.fine("test test test");

        try {
            int e = 2 / 0;
        } catch (Exception e) {
            logger.log(Level.WARNING, "trouble sneezing", e);
        }
    }
}

