package com.company;


public class Robot extends Thread {
    public Step leg_left = new Step(this,"LEFT");
    public Step leg_right = new Step(this,"RIGHT");
    public Robot(){}

    public void stepping()
    {
        Thread step_left = new Thread(leg_left);
        Thread step_right = new Thread(leg_right);
        step_left.start();
        step_right.start();
    }


}