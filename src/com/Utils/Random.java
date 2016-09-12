package com.Utils;

/**
 * Created by dcarbajal on 12/09/2016.
 */
public class Random {

    public static int randomIntBetween(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
