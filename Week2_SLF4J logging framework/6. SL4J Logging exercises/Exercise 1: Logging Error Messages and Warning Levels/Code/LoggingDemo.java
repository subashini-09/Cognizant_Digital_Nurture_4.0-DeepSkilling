package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    // Logger instance
    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {
        logger.info("✅ Application started successfully.");
        logger.warn("⚠️ This is a warning - be cautious!");
        logger.error("❌ An error occurred while processing the request.");
    }
}
