package com.company;

/**
 * Created by alexfeike on 4/5/16.
 */
public class HomeContact extends Contact
{
    private String phoneNumber;
    HomeContact(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber =phoneNumber;
    }
    @Override
    public void contact()
    {
        System.out.println("Contacting "+name+" at "+phoneNumber);
    }
}
