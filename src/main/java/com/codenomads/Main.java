package com.codenomads;

public class Main {
    public static void main(String[] args) {
        new OutputAggregator(new AppLogger(), new TextFormatter(new DateTimeService())).printInput("Hello World");
    }
}