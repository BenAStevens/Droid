package org.example;

public class Droid {

    public String name;

    public int batteryLevel;

    public Droid(String nameIn) {
        this.name = nameIn;
        this.batteryLevel = 100;
    }


    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void doTask(String task) {
        System.out.println(this.name + " is doing task " + task);
    }

    public String toString() {
        return "Hello, I’m the droid: " + this.name;
    }
}
