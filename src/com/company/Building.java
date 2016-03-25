package com.company;

/**
 * Created by alexfeike on 3/24/16.
 */
public class Building
{
    String address;

    Building(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Address:" + address);
    }
}

