package com.codenomads;

public class TextFormatter {

    // inject DateTimeService dependency

    public String addDateTime(String input) {
        return input /*+ " - " + dateTimeService.getDateTimeNow()*/;
    }
}
