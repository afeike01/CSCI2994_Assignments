package com.company;
import java.util.ArrayList;
/**
 * Created by alexfeike on 4/18/16.
 */
class QueueFullException extends Exception{}
class QueueEmptyException extends Exception{}
public class Queue<E>
{
    private ArrayList<E> elements = new ArrayList<E>();
    private int size=0;
    Queue(int size){this.size=size;}
    public void enqueue(E element)throws QueueFullException
    {
        if(elements.size()==size)
            throw new QueueFullException();
        elements.add(element);
    }
    public E dequeue() throws QueueEmptyException
    {
        if(elements.size()<1)
            throw new QueueEmptyException();
        return elements.remove(0);
    }
}
