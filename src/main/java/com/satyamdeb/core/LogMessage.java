package com.satyamdeb.core;

import java.time.Instant;

public class LogMessage {
    private final Instant timestamp;
    private final LogLevel logLevel;
    private final String message;
    private final String source;

    public LogMessage(Instant timestamp, LogLevel logLevel, String message, String source) {
        this.timestamp = timestamp;
        this.logLevel = logLevel;
        this.message = message;
        this.source = source;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getMessage() {
        return message;
    }

    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return timestamp + " [" + logLevel + "] : " + message + " at " + source;
    }
}
