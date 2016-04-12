package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        /*
        //Exercise
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new WorkContact("Melissa","melissa@gmail.com"));
        contacts.add(new HomeContact("Bruce","614-222-5555"));

        for(Contact c : contacts)
        {
            c.contact();
        }*/
        //Example sorting + iterable
        ArrayList<ToDoItem> toDoList = new ArrayList<ToDoItem>();
        toDoList.add(new ToDoItem("a_equalPriority","",1));
        toDoList.add(new ToDoItem("lowestPriority","",0));
        toDoList.add(new ToDoItem("equalNameAndPriority1","",2));
        toDoList.add(new ToDoItem("b_equalPriority","",1));
        toDoList.add(new ToDoItem("highestPriority","",5));
        toDoList.add(new ToDoItem("equalNameAndPriority2","",2));

        for(ToDoItem t : toDoList)
            System.out.println(t.toString());

        System.out.println("");

        Collections.sort(toDoList);

        for(ToDoItem t : toDoList)
            System.out.println(t.toString());

        
        //Assignment 3
        Assignment3 assignment3 = new Assignment3();
        assignment3.Run();
    }
}
