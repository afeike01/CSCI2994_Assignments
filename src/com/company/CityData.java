package com.company;

public class CityData
{
    String cityName;
    int[] temperatures;

    CityData(String cityName, int[] temperatures) {
        this.cityName = cityName;
        this.temperatures = temperatures;
    }

    public void displayAverageTemp() {
        int numberOfDays = temperatures.length;

        int sum = 0;
        for (int temp: temperatures) {
            sum += temp;
        }

        try {
            int average = sum / numberOfDays;
            System.out.println("The average temperature in " + cityName + " will be: " + average+ ".");
        }
        catch (ArithmeticException e) {
            System.out.println("Not enough information for " + cityName + ".");
        }

    }

}
