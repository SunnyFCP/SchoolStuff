package tesso;

import java.util.Scanner;

public class MussMuss 
{
	public static void main(String[] args) 
	{
		// TODO Calc Aufgabe 17.
		Scanner ingeab = new Scanner(System.in);
		System.out.println("What to do?\n+ _ - _ * _ / ");
		
		switch(ingeab.nextLine())
		{
		case "+":
			System.out.println("Gimme Numbers: A and B\n");
			System.out.println("\n"+rechn.calcPosi(ingeab.nextDouble(), ingeab.nextDouble())+"\n");
			break;
		case "-":
			System.out.println("Gimme Numbers: A and B\n");
			System.out.println("\n"+rechn.calcNega(ingeab.nextDouble(), ingeab.nextDouble())+"\n");
			break;
		case "*":
			System.out.println("Gimme Numbers: A and B\n");
			System.out.println("\n"+rechn.calcMalu(ingeab.nextDouble(), ingeab.nextDouble())+"\n");
			break;
		case "/":
			System.out.println("Gimme Numbers: A and B\n");
			
			System.out.println("\n"+rechn.calcDivi(ingeab.nextDouble(), ingeab.nextDouble())+"\n");
			break;
			default: System.out.print("Shit Happened"); break;
		}
		ingeab.close();
	}

}
class rechn{
	static double calcPosi(double a, double b)
	{
		return a+b;
	}
	static double calcNega(double a, double b)
	{
		return a-b;
	}
	static double calcMalu(double a, double b)
	{
		return a*b;
	}
	static double calcDivi(double a, double b)
	{
		return a/b;
	}
}
