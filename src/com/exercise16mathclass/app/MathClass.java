package com.exercise16mathclass.app;
import java.lang.Math;
public class MathClass {
	
	public static void main(String[] args) {
		
		double n=3.76;
		double n2=3.5;
		double n3=5.5;
//Galeria de methodos usados regularmente de Math---------------------------------------------------------------
		
		System.out.println("e value;"+Math.E);
		System.out.println("pi value:"+Math.PI);
		System.out.println("absoluto:"+Math.abs(-2.15));
		System.out.println("Cube root:"+Math.cbrt(27));
		System.out.println("\nRound of 3.76  -> "+Math.round(n));
		System.out.println("Round Ceil of 3.76 -> "+Math.ceil(n));
		System.out.println("Round Floor of 3.76 ->  "+Math.floor(n));
		System.out.println("\nIncrement of 5  "+Math.incrementExact(5));
		System.out.println("Decrement of 5  "+Math.decrementExact(5));
		System.out.println("Power value of 3 Euler: "+Math.exp(3));
		System.out.println(String.format("\nWich is bigger? %.2f or %.3f : %.4f",n2,n3,Math.max(n2, n3)));
		System.out.println(String.format("Wich is bigger? %.2f or %.3f : %.4f",n2,n3,Math.min(n2, n3)));
		System.out.println("\nSin of 0° is: "+Math.sin(0));
		System.out.println("Sin of PI/2 is: "+Math.sin(Math.PI/2));
		System.out.println("\nCos of 0° is: "+Math.cos(0));
		System.out.println("Cos of PI/2 is: "+Math.cos(Math.PI/2));		
		
		
	}

}
