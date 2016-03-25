package com.company;

/**
 * Created by alexfeike on 3/24/16.
 */
public class House extends Building
{
    private int numResidents=0;
    House(String address, int residents)
    {
        super(address);
        this.numResidents = residents;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Number of Residents:" + numResidents);
    }
}
