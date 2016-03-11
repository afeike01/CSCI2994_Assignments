package com.company;

/**
 * Created by alexfeike on 3/10/16.
 */
public class ToDoItem
{
    public String name;
    public String description;
    public int priority;
    ToDoItem(String n, String d, int p)
    {
        name = n;
        description = d;
        priority = p>=0&&p<6 ? p : p<0 ? 0 : 5;
    }
}
