package com.vivek.javacodes7;

public class BMIMachine extends HeartMonitor
{
    public static void main(String[] args)
    {
        System.out.println(getMaxHeartRate(30));
    }

    public static int getMaxHeartRate(int age) 
    {
        int result;
        result = 230-age;
        System.out.println("___Method executed from Sub-class___");
        return result;
    }
}
