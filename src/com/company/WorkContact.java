package com.company;

/**
 * Created by alexfeike on 4/5/16.
 */
public class WorkContact extends Contact
{
    private String email;
    WorkContact(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
    @Override
    public void contact()
    {
        System.out.println("Contacting "+name+" at "+email);
    }
}
