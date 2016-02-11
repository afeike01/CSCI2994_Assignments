package com.company;
import java.util.*;
import java.util.Scanner;
/**
 * Created by alexfeike on 2/11/16.
 */
public class Assignment1
{
    private ArrayList<String> taskList = new ArrayList<String>();
    private Scanner s = new Scanner(System.in);
    private Scanner stringReader = new Scanner(System.in);
    public void Run()
    {
        while(true)
        {
            PrintMenu();
            int n = GetInput();
            if(n==0)
                break;
            else if(n==1)
            {
                System.out.println("Enter new Task");
                String task = GetTaskInput();
                AddTask(task);
            }
            else if(n==2)
            {
                System.out.println("Enter Task Index");
                RemoveTask(GetInput());
            }
            else if(n==3)
            {
                System.out.println("Enter Task index");
                int index = GetInput();
                System.out.println("Enter new Task");
                String task = GetTaskInput();
                UpdateTask(index,task);
            }
            else if(n==4)
                PrintTaskList();
        }


    }
    private void PrintMenu()
    {
        System.out.println("Please choose an option:\n" +
                "(1) Add a task.\n" +
                "(2) Remove a task.\n" +
                "(3) Update a task.\n" +
                "(4) List all tasks.\n" +
                "(0) Exit.");
    }
    private void PrintTaskList()
    {
        String toPrint = taskList.size()>0 ? taskList.toString() : "No Tasks";
        System.out.println(toPrint);
    }
    private int GetInput()
    {
        return s.nextInt();
    }
    private String GetTaskInput()
    {
        return stringReader.nextLine();
    }
    private void AddTask(String task)
    {
        taskList.add(task);
    }
    private void RemoveTask(int n)
    {
        if(taskList.size()>n&&n>=0)
            taskList.remove(n);
    }
    private void UpdateTask(int n, String task)
    {
        if(n>=0&&n<taskList.size())
        {
            taskList.set(n,task);
        }
        else
        {
            System.out.println("Task to update does not exist");
        }
    }
}
