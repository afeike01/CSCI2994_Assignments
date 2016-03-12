package com.company;
import java.util.Scanner;
/**
 * Created by alexfeike on 3/11/16.
 */
public class UserInput
{
    private Scanner s = new Scanner(System.in);

    public String promptString(String message)
    {
        System.out.println(message);
        if(s.hasNextLine())
            return s.nextLine();
        else
        {
            s.nextLine();
            return promptString(message);
        }
    }
    public int promptInt(String message)
    {
        System.out.println(message);
        if(s.hasNextInt())
            return s.nextInt();
        else
        {
            s.nextLine();
            return promptInt(message);
        }
    }
    public double promptDouble(String message)
    {
        System.out.println(message);
        if(s.hasNextDouble())
            return s.nextDouble();
        else
        {
            s.nextLine();
            return promptDouble(message);
        }
    }
}
