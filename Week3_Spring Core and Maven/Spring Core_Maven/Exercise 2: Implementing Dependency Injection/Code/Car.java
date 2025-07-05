package com.example.springdi;

public class Car {
    private Engine engine;

    // Constructor-based Dependency Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void showEngineType() {
        System.out.println("🔧 Car is running with: " + engine.getType());
    }
}
