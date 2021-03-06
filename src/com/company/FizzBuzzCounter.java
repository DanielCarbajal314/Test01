package com.company;

/**
 * Created by dcarbajal on 12/09/2016.
 */
public class FizzBuzzCounter {
    private int fizzMultipleDivisor;
    private int buzzMultipleDivisor;

    public FizzBuzzCounter(int fizzMultipleDivisor, int buzzMultipleDivisor)
    {
        if (fizzMultipleDivisor==0) {throw new IllegalArgumentException("Fizz's divisor must be different from number 0");}
        if (buzzMultipleDivisor==0) {throw new IllegalArgumentException("Bazz's divisor must be different from number 0");}
        this.fizzMultipleDivisor=fizzMultipleDivisor;
        this.buzzMultipleDivisor=buzzMultipleDivisor;
    }

    private Boolean IsFizzMultiple(int number)
    {
        return  isMultipleOf(number, this.fizzMultipleDivisor);
    }

    private Boolean IsBuzzMultiple(int number)
    {
        return  isMultipleOf(number, this.buzzMultipleDivisor);
    }

    private Boolean isMultipleOf(int number, int divisor)
    {
        return number%divisor==0;
    }

    public String GetCount(int number)
    {
        String countString = "";
        countString += IsFizzMultiple(number)? "Fizz":"";
        countString += IsBuzzMultiple(number)? "Buzz":"";
        countString += countString.indexOf("zz")==-1? number:"";
        return  countString;
    }
}
