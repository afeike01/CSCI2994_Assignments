package com.company;
import java.util.*;
import java.util.Scanner;

/**
 * Created by alexfeike on 4/12/16.
 */
public class Assignment3
{
    private ToDoItemCollection taskList = new ToDoItemCollection();
    private Scanner choiceReader = new Scanner(System.in);
    private Scanner priorityReader = new Scanner(System.in);
    private Scanner nameReader = new Scanner(System.in);
    private Scanner descriptionReader = new Scanner(System.in);
    public void Run()
    {
        while(true)
        {
            PrintMenu();
            int n = choiceReader.nextInt();
            if(n==0)
                break;
            else if(n==1)
            {

                AddTask();
            }
            else if(n==2)
            {
                RemoveTask();
            }
            else if(n==3)
            {
                PrintTasksOfPriority();
            }
            else if(n==4)
                PrintTaskList();
            else if(n==5)
                UpdateTask();
        }


    }
    private void PrintMenu()
    {
        System.out.println("Please choose an option:\n" +
                "(1) Add a task.\n" +
                "(2) Remove a task.\n" +
                "(3) List Tasks of Priority.\n" +
                "(4) List all tasks.\n" +
                "(5) Edit Task.\n"+
                "(0) Exit.");
    }
    private void PrintTasksOfPriority()
    {
        System.out.println("Enter priority to print");
        int priority = priorityReader.nextInt();
        priority = priority >=0 && priority <6 ? priority : priority<0 ? 0 : 5;
        for(ToDoItem item : taskList)
        {
            if(item.getPriority()!=priority)
                continue;
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println();
        }
    }
    private void PrintTaskList()
    {
        for(ToDoItem item : taskList)
        {
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println();
        }
    }

    private void AddTask()
    {
        System.out.println("Enter Name");
        String name = nameReader.nextLine();
        System.out.println("Enter Description");
        String description = descriptionReader.nextLine();
        System.out.println("Enter Priority");
        int priority=priorityReader.nextInt();
        ToDoItem task = new ToDoItem(name,description,priority);
        taskList.add(task);
    }
    private void RemoveTask()
    {
        System.out.println("Enter name of task to remove");
        String name = nameReader.nextLine();
        for(ToDoItem item : taskList)
        {
            if(item.getName().equals(name))
            {
                taskList.remove(name);
                System.out.println("Removed task "+name);
                return;
            }
        }
        System.out.println("Could not find Task");
    }
    private void UpdateTask()
    {
        System.out.println("Enter name of task to update");
        String name = nameReader.nextLine();
        for(ToDoItem item : taskList)
        {
            if(item.getName().equals(name))
            {
                System.out.println("Enter Name");
                String n = nameReader.nextLine();
                System.out.println("Enter Description");
                String description = descriptionReader.nextLine();
                System.out.println("Enter Priority");
                int priority=priorityReader.nextInt();

                item.setName(n);
                item.setDescription(description);
                item.setPriority(priority);

                System.out.println("Updated task "+n);
                return;
            }
        }
        System.out.println("Could not find Task");
    }
}
