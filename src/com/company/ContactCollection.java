package com.company;
import java.util.*;
/**
 * Created by alexfeike on 4/1/16.
 */
public class ContactCollection
{
    private ArrayList<ContactInformation> contacts = new ArrayList<>();
    public ContactCollection()
    {

    }
    public void AddContact(ContactInformation contactInfo)
    {
        contacts.add(contactInfo);
    }
    public void DisplayContacts()
    {
        for(int i=0;i<contacts.size();i++)
        {
            contacts.get(i).Display();
        }
    }
}
