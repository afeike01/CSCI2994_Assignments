package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new WorkContact("Melissa","melissa@gmail.com"));
        contacts.add(new HomeContact("Bruce","614-222-5555"));

        for(Contact c : contacts)
        {
            c.contact();
        }

    }
}
