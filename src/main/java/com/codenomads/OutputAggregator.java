package com.codenomads;

public class OutputAggregator {

    private final AppLogger appLogger;
    private final TextFormatter textFormatter;

    public OutputAggregator(AppLogger appLogger, TextFormatter textFormatter) {
        this.appLogger = appLogger;
        this.textFormatter = textFormatter;
    }

    public void printInput(String input) {
        appLogger.printLog(textFormatter.addDateTime(input));
    }
}
