package tesso;

import java.util.Scanner;

public class Aldder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	private void getstuff()
	{
		int day, month, year, bday, bmonth, byear;
		Scanner incro = new Scanner(System.in);
		System.out.println("Day Today");
		day = incro.nextInt();
		System.out.println("Month Now");
		month = incro.nextInt();
		System.out.println("Year");
		year = incro.nextInt();
		System.out.println("------------\nBDay day?");
		bday = incro.nextInt();
		System.out.println("BMonth?");
		bmonth = incro.nextInt();
		System.out.println("BYear?");
		byear = incro.nextInt();
		
		System.out.println("\n\nYou are ");
		incro.close();
	}
	private int calc(int day,int month,int year,int bday,int bmonth,int byear){
		int age = 0;
		
		return age;
		
		
	}

}
