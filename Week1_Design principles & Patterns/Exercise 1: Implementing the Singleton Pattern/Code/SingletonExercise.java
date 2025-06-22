package com.example.singleton;

public class SingletonExercise {
	
	private static SingletonExercise instance;

    // Private constructor to prevent instantiation
    private SingletonExercise() {
        System.out.println("Database Connection Created.");
    }

    // Public method to provide access to the instance
    public static SingletonExercise getInstance() {
        if (instance == null) {
            synchronized (SingletonExercise.class) {
                if (instance == null) {
                    instance = new SingletonExercise();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from the database...");
    }

}
