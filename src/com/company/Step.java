package com.company;

public class Step implements Runnable{
    protected Robot robot;
    protected String which_leg;
    public Step(Robot robot, String w)
    {
        this.robot = robot;
        this.which_leg = w;
    }

    public void run()
    {
        for(int i=0; i<20; i++)
        {
            synchronized (robot) {
                System.out.println(which_leg);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}