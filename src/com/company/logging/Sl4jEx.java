package com.company.logging;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.LoggerFactory;

public class Sl4jEx {

    public static void main(String[] args) {
        Logger logger0 = (Logger) LoggerFactory.getLogger("STDOUT");
        logger0.setLevel(Level.ALL);
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

        logger0.info("hello");

        Logger foobar =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.baeldung.foobar");
        Logger logger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.baeldung.logback");
        Logger testslogger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.baeldung.logback.tests");

        foobar.debug("This is logged from foobar");
        logger.debug("This is not logged from logger");
        logger.info("This is logged from logger");
        testslogger.info("This is not logged from tests");
        testslogger.warn("This is logged from tests");
    }
}
