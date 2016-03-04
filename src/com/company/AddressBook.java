package com.company;
import java.util.*;
/**
 * Created by alexfeike on 3/4/16.
 */
public class AddressBook
{
    public HashMap<String,String> addressMap = new HashMap<String,String>();
    public void Add(PersonInfo pi)
    {
        addressMap.put(pi.name,pi.email);
    }
    public String GetEmail(String name)
    {
        if(addressMap.containsKey(name))
            return addressMap.get(name);
        else
            return "Name does not exist";
    }
}
