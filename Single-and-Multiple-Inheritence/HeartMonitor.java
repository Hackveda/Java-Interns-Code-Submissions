package com.vivek.javacodes7;

public class HeartMonitor 
{
    public static void main(String[] args)
    {
        System.out.println(getMaxHeartRate(30));
    }

    public static int getMaxHeartRate(int age) 
    {
        int result;
        result = 220-age;
        System.out.println("___Method executed from Base-class___");
        return result;
    }
}
