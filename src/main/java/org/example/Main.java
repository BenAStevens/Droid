package org.example;

public class Main {
    public static void main(String[] args) {
        Droid droid = new Droid("Jimbob");

        System.out.println(droid);
        System.out.println(droid.toString());

        droid.setBatteryLevel(100);
        droid.doTask("dancing");
        droid.setBatteryLevel(droid.batteryLevel - 10);
        System.out.println(droid.batteryLevel);
    }
}