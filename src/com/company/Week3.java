package com.company;
import java.util.Scanner;
/**
 * Created by alexfeike on 2/4/16.
 */
public class Week3
{
    public static void Run()
    {
        float temp = 0;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            temp = GetTemp(s);
            if(temp<-460)
                break;
            temp = ConvertToCelcius(temp);
            PrintTemp(temp);
        }

    }
    public static float GetTemp(Scanner s)
    {
        System.out.println("Enter the temperature in Fahrenheit");
        return s.nextFloat();
    }
    public static float ConvertToCelcius(float val)
    {
        return (val-32f)/1.8f;
    }
    public static void PrintTemp(float val)
    {
        System.out.println("The temperature in Celcius is: ");
        System.out.println(val);
    }
}
