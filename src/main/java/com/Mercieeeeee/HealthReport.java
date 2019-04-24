package com.Mercieeeeee;

public class HealthReport implements Report {
    @Override
    public void load() {
        System.out.println("Health loadind data");
    }

    @Override
    public void print() {
        System.out.println("Health printing data");
    }
}
