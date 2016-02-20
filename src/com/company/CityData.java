package com.company;

public class CityData
{
    public static int numDays = 5;
    public String name;
    public float[] temps = new float[numDays];
    private int lastIndex =0;
    public CityData(String s)
    {
        name = s;
    }
    public void AddTemp(float n)
    {
        if(lastIndex<temps.length)
        {
            temps[lastIndex] = n;
            lastIndex++;
        }
    }
    public float GetAverageTemperature()
    {
        float average = 0;
        for(int i=0;i<temps.length;i++)
            average+=temps[i];
        average/=temps.length;
        return average;
    }
}
