package com.company;


public class Main {

    public static void main(String[] args)
    {
        ContactInformation ci = new ContactInformation("Bob","Bob@gmail.com");
        ci.Display();
        BuisnessContactInformation bci = new BuisnessContactInformation("Bob","Bob@gmail.com","614-333-4444");
        bci.Display();
    }
}
