package com.company;

/**
 * Created by alexfeike on 3/25/16.
 */
public class BuisnessContactInformation extends ContactInformation
{
    private String phoneNumber;
    public BuisnessContactInformation(String n, String e, String p)
    {
        super(n,e);
        phoneNumber = p;
    }
    @Override
    public void Display()
    {
        super.Display();
        System.out.println("Phone Number: "+phoneNumber);
    }
}
