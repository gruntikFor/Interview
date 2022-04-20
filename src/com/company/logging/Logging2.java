package com.company.logging;

import lombok.extern.java.Log;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.*;

public class Logging2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Logging2.class.getName());

        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.WARNING);

        Handler fileHandler = new FileHandler("my-log%u.log");
        fileHandler.setFormatter(new IgorFormatter());

        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
        logger.addHandler(fileHandler);

        logger.info("info log");

    }
}

