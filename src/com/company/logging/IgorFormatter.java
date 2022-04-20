package com.company.logging;

import java.io.IOException;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class IgorFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return record.getMillis() + " " + record.getLevel() + " : " + record.getMessage();
    }
}