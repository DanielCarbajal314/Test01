package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dcarbajal on 12/09/2016.
 */
public class FizzBuzzList {
    private int listDimension;
    private FizzBuzzCounter fizzBuzzCounter;
    public FizzBuzzList(int fizzMultipleDivisor, int buzzMultipleDivisor, int listDimension)
    {
        this.fizzBuzzCounter = new FizzBuzzCounter(fizzMultipleDivisor,buzzMultipleDivisor);
        if (listDimension<0) {throw new IllegalArgumentException("The list length must be a non negative number");}
        this.listDimension=listDimension;
    }
    public List<String> makeCountList()
    {
        List<String> emptyStringList = new ArrayList<>();
        return recursiveListBuild(this.listDimension, emptyStringList);
    }
    private List<String> recursiveListBuild(int countDown,List<String> countList)
    {
        if (countDown==0) {
            return countList;
        }
        recursiveListBuild(countDown-1, countList);
        String iterationCount = fizzBuzzCounter.GetCount(countDown);
        countList.add(iterationCount);
        return  countList;
    }
}
