package main;

import chap07.CalculatorImpl1;
import chap07.CalculatorImpl2;
import chap07.ExeTimeCalculator;
import chap07.RecCalculator;

public class MainProxy {

	public static void main(String[] args){
		System.out.println("start");
		ExeTimeCalculator ttCalculator1 = new ExeTimeCalculator(new CalculatorImpl1());
		System.out.println(ttCalculator1.factorial(20));
		
		ExeTimeCalculator ttCalculator2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttCalculator2.factorial(20));
		System.out.println("end");
	}
	
}
