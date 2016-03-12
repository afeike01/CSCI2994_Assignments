package com.company;


public class Main {

    public static void main(String[] args)
    {
        UserInput ui = new UserInput();
        ui.promptString("Enter a valid String");
        ui.promptInt("Enter a valid Int");
        ui.promptDouble("Enter a valid Double");
    }
}
