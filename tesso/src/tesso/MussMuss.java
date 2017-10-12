package tesso;

import java.util.Scanner;

public class MussMuss {

	public static void main(String[] args) {
		// TODO Calc Aufgabe 17.
		Scanner ingeab = new Scanner(System.in);
		System.out.println("What to do?\n+ _ - _ * _ / ");
		
		switch(ingeab.nextLine()){
		case "+":
			System.out.println("Gimme Numbers: A and B");
			calcPosi(ingeab.nextDouble(), ingeab.nextDouble());
			break;
		}
		

	}
	private static double calcPosi(double a, double b)
	{
		
		return a+b;
	}
	private static double calcNega(double a, double b)
	{
		
		return a-b;
	}
	private static double calcMalu(double a, double b)
	{
		
		return a*b;
	}
	private static double calcDivi(double a, double b)
	{
		
		return a/b;
	}

}
