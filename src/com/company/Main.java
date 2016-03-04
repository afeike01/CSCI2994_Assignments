package com.company;


public class Main {

    public static void main(String[] args)
    {
        AddressBook ab = new AddressBook();
        ab.Add(new PersonInfo("Robin","robin@gmail.com"));
        ab.Add(new PersonInfo("Luther","luther@gmail.com"));
        ab.Add(new PersonInfo("Rachel","rachel@gmail.com"));

        System.out.println(ab.GetEmail("Robin"));
    }
}
