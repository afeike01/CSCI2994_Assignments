package com.company;
import java.util.*;
/**
 * Created by alexfeike on 4/12/16.
 */
public class IterableContactCollection implements Iterable<Contact>
{
    private List<Contact> contacts = new ArrayList<Contact>();

    @Override
    public Iterator<Contact> iterator()
    {
        return contacts.iterator();
    }
    public void add(Contact c){contacts.add(c);}
}
