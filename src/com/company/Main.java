package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {

        //Exercise #10
        /*IterableContactCollection contacts = new IterableContactCollection();
        contacts.add(new WorkContact("Melissa","melissa@gmail.com"));
        contacts.add(new HomeContact("Bruce","614-222-5555"));

        for(Contact c : contacts)
        {
            c.contact();
        }*/

        //Assignment 3
        //Assignment3 assignment3 = new Assignment3();
        //assignment3.Run();

        //Exercise #11
        /*
        System.out.println("Main:  Creating Objects");
        WeatherStation localWeatherStation = new WeatherStation();

        TemperatureSensor temperatureSensor = new TemperatureSensor();
        HumiditySensor humiditySensor = new HumiditySensor();
        PressureSensor pressureSensor = new PressureSensor();

        temperatureSensor.addListener(localWeatherStation);
        humiditySensor.addListener(localWeatherStation);
        pressureSensor.addListener(localWeatherStation);

        System.out.println("Main:  Simulating updates from sensors");
        temperatureSensor.update();
        humiditySensor.update();
        temperatureSensor.update();
        pressureSensor.update();

        System.out.println("Main:  displaying report and logs");
        localWeatherStation.displayCurrentWeather();
        localWeatherStation.displayLog();*/

        //Exercise #12
        Queue<String> stringQueue = new Queue<String>(3);
        try
        {
            stringQueue.enqueue("Hello");
            stringQueue.enqueue("World");
            stringQueue.enqueue("HelloWorld");
            System.out.println(stringQueue.dequeue());
            System.out.println(stringQueue.dequeue());
            System.out.println(stringQueue.dequeue());
        }
        catch(QueueFullException | QueueEmptyException e)
        {
            e.printStackTrace();
        }
    }
}
