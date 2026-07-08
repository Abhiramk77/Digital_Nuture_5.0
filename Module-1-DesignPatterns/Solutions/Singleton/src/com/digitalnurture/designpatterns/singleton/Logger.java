package com.digitalnurture.designpatterns.singleton;

/**
 * Thread-safe Logger implementation using Double-Checked Locking Singleton Pattern.
 * Explains: Creational Design Pattern ensuring a class has only one instance 
 * and provides a global point of access.
 */
public class Logger {
    // Volatile instance to prevent cache inconsistency and instruction reordering issues
    private static volatile Logger instance;

    // Private constructor to prevent instantiation from outside the class
    private Logger() {
        System.out.println("Logger initialized successfully.");
    }

    /**
     * Public method to retrieve the single instance of Logger.
     * Implements double-checked locking for thread safety and high performance.
     */
    public static Logger getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (Logger.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    /**
     * Standard log method to log application events.
     */
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
