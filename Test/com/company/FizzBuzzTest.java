package com.company;

import org.jcp.xml.dsig.internal.dom.Utils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dcarbajal on 12/09/2016.
 */
public class FizzBuzzTest {
    @Test
    public void TestContructor() {
        int FizzMultiplesDivisor = com.Utils.Random.randomIntBetween(1,5);
        int BuzzMultiplesDivisor = com.Utils.Random.randomIntBetween(6,10);
        int ListSize = com.Utils.Random.randomIntBetween(10,100);
        FizzBuzzList fizzBuzz = new FizzBuzzList(FizzMultiplesDivisor,BuzzMultiplesDivisor,ListSize);
    }
    @Test
    public void TestCountSize() {
        int FizzMultiplesDivisor = com.Utils.Random.randomIntBetween(1,5);
        int BuzzMultiplesDivisor = com.Utils.Random.randomIntBetween(6,10);
        int ListSize = com.Utils.Random.randomIntBetween(10,100);
        FizzBuzzList fizzBuzz = new FizzBuzzList(FizzMultiplesDivisor,BuzzMultiplesDivisor,ListSize);
        List<String> countList = fizzBuzz.makeCountList();
        assertEquals(countList.size(),ListSize);
    }
    @Test
    public void TestCountContent() {
        List<String> ControlList = new ArrayList<>(Arrays.asList("1", "2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"));
        FizzBuzzList fizzBuzz = new FizzBuzzList(3,5,15);
        List<String> countList = fizzBuzz.makeCountList();
        assertEquals(countList,ControlList);
    }

}