package com.company;

/**
 * Created by alexfeike on 3/25/16.
 */
public class ContactInformation
{
    private String name;
    private String email;
    public ContactInformation(String n, String e)
    {
        name = n;
        email=e;
    }
    public void Display()
    {
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
    }
}
