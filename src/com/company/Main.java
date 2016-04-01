package com.company;


public class Main {

    public static void main(String[] args)
    {
        ContactInformation ci = new ContactInformation("Robert","Robert@gmail.com");
        BuisnessContactInformation bci = new BuisnessContactInformation("Bob","Bob@gmail.com","614-333-4444");

        ContactCollection contacts = new ContactCollection();
        contacts.AddContact(ci);
        contacts.AddContact(bci);
        contacts.DisplayContacts();
    }
}
