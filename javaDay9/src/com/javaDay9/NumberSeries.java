package com.javaDay9;
import java.util.*;

interface PrintNumberSeries
{
	public void printSeries();
}

public class NumberSeries {
	public static void main(String args[])
	{
		PrintNumberSeries series=()->{
		for(int i = 11; i <= 20; i++)
        {
            System.out.println(i);
        }
        };
        series.printSeries();
	}

}
