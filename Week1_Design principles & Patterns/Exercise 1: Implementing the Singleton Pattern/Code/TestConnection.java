package com.example.singleton;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonExercise connection1 = SingletonExercise.getInstance();
		SingletonExercise connection2 = SingletonExercise.getInstance();

        System.out.println();

        // Validate both instances are the same
        if (connection1 == connection2) {
            System.out.println("Both are the same database connection instance.");
        } else {
            System.out.println("Different instances detected!");
        }

        // Use the connection
        connection1.connect();
        connection2.disconnect();

	}

}
