package com.company.logging;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.*;

public class LoggingHierarchy {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger("");
        Logger logger2 = Logger.getLogger("com");
        Logger logger3 = Logger.getLogger("com.gruntik");
        Logger logger4 = Logger.getLogger("com.gruntik.igor");

        logger.setLevel(Level.WARNING);
        logger2.setLevel(Level.WARNING);
        logger3.setLevel(Level.INFO);
        logger4.setLevel(Level.INFO);

        Logger logger5 = Logger.getLogger("m");
        Handler handler5 = new ConsoleHandler();
        handler5.setFormatter(new IgorFormatter());
        logger5.setLevel(Level.INFO);

        logger5.info("hello igor");

//        logger.addHandler(new ConsoleHandler());
//        logger2.addHandler(new ConsoleHandler());
//        logger3.addHandler(new ConsoleHandler());

//        logger.info("logger_1\t" + logger.getName());
//        logger2.info("logger_2\t" + logger2.getName());
//        logger3.info("logger_3\t" + logger3.getName());
//        logger4.info("logger_4\t" + logger4.getName());

        Logger logger0 = Logger.getLogger("");
        Logger logger1 = Logger.getLogger("1");
        Logger logger1_2 = Logger.getLogger("1.2");

        logger0.setLevel(Level.INFO);
        logger1.setLevel(Level.INFO);
        logger1_2.setLevel(Level.INFO);
//
//        logger0.info("msg:");
//        logger1.info("msg: 1");
//        logger1_2.info("msg: 1.2");

    }

}