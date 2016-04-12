package com.company;

/**
 * Created by alexfeike on 3/10/16.
 */
public class ToDoItem implements Comparable<ToDoItem>
{
    private String name;
    private String description;
    private int priority;
    ToDoItem(String n, String d, int p)
    {
        setName(n);
        setDescription(d);
        setPriority(p);
    }
    public String getName(){return this.name;}
    public void setName(String s){this.name=s;}
    public String getDescription(){return this.description;}
    public void setDescription(String s){this.description=s;}
    public int getPriority(){return this.priority;}
    public void setPriority(int n)
    {

        this.priority = n>=0&&n<6 ? n : n<0 ? 0 : 5;
    }
    @Override
    public String toString()
    {
        return this.getName()+" "+this.getDescription()+" "+getPriority();
    }
    public int compareTo(ToDoItem item)
    {
        if(Integer.compare(this.getPriority(),item.getPriority())!=0)
            return item.getPriority()-this.getPriority();
        else if(this.getName().compareTo(item.getName())<0)
            return 1;
        else
            return 0;
    }
}
