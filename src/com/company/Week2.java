package com.company;

/**
 * Created by alexfeike on 2/4/16.
 */
public class Week2
{
    public static void Run()
    {
        int temp[] = {45,29,10,22,41,28};
        double precip[] = {.95,.60,.25,.05,.00,.75,.90};
        String days[] ={"Monday","Tuesday","Wednesday","Tuesday","Thursday","Friday","Saturday","Sunday"};
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]<=32&&precip[i]>.50)
            {
                System.out.println(days[i]);
            }
        }
    }
}
