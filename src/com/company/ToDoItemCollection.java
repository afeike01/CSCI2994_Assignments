package com.company;
import java.util.*;
/**
 * Created by alexfeike on 4/12/16.
 */
public class ToDoItemCollection implements Iterable<ToDoItem>
{
    private List<ToDoItem> items = new ArrayList<ToDoItem>();

    public int size(){return items.size();}
    public boolean isEmpty(){return items.size()<1;}
    public void add(ToDoItem item){items.add(item);}
    public boolean remove(String name)
    {
        for(ToDoItem item : items)
        {
            if(item.getName().equals(name))
            {
                items.remove(item);
                return true;
            }
        }
        return false;
    }
    public boolean remove(int index)
    {
        if(index>=0&&index<items.size())
        {
            items.remove(index);
            return true;
        }
        return false;
    }
    public void clear()
    {
        while(items.size()>0)
            items.remove(0);
    }
    public ToDoItem get(int index)
    {
        if(index>=0&&index<items.size())
            return items.get(index);
        else
            return null;
    }
    public void sort()
    {
        Collections.sort(items);
    }
    @Override
    public Iterator<ToDoItem> iterator(){return items.iterator();}
}
