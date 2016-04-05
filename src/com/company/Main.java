package com.company;


public class Main {

    public static void main(String[] args)
    {
        WorkContact wc = new WorkContact("Melissa","melissa@gmail.com");
        HomeContact hc = new HomeContact("Bruce","614-222-5555");
        wc.contact();
        hc.contact();
    }
}
