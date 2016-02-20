package com.company;
import java.util.Scanner;
import java.util.*;

public class Exercise4
{
    private ArrayList<CityData> cityDataList = new ArrayList<>();

    public void Run()
    {
        GetInput();
        PrintResults();
    }
    private void GetInput()
    {
        Scanner stringReader = new Scanner(System.in);
        Scanner floatReader = new Scanner(System.in);
        String input = "";
        String terminatorString = "END";
        while(true)
        {
            System.out.println("Enter the City Name: ");
            input = stringReader.nextLine();
            if(input.equals(terminatorString))
                break;
            else
                cityDataList.add(new CityData(input));
        }
        for(int i=0;i<cityDataList.size();i++)
        {
            for(int j=0;j<CityData.numDays;j++)
            {
                System.out.println("Enter temp in "+ cityDataList.get(i).name + " on day "+(j+1));
                float temp = floatReader.nextFloat();
                cityDataList.get(i).AddTemp(temp);
            }
        }
    }
    private void PrintResults()
    {
        for(int i=0;i<cityDataList.size();i++)
        {
            float average = cityDataList.get(i).GetAverageTemperature();
            System.out.println("Average Temp in "+cityDataList.get(i).name+" is "+average);
        }
    }
}
