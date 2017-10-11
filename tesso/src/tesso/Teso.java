package tesso;

import java.util.*;

public class Teso {

	public static void main(String[]  args) {
		// TODO Auto-generated method stub
		System.out.println("Anzahl der Parameter: "+ args.length + "\n");
		
		System.out.println();
		System.out.println("Param1: "+ args[0]);
		System.out.println("Param2: "+ args[1]);
		System.out.println("Param3: "+ args[2]);
		System.out.println("Param4: "+ args[3]);
		System.out.println("Param5: "+ args[4]);
		System.out.println();
		
		Scanner locosa = new Scanner(System.in);
		//System.out.println("Ari or Harmo, then Gimme Numbers, toooo");
		//golum(locosa.nextLine(), locosa.nextInt(),locosa.nextInt());
		System.out.println("Gimme a Euro!");
		geldGolum(locosa.nextDouble());
	}
	private static void golum(String wahl,int Ring1, int Ring2) 
	{
		float hobo;
		double habo;
		
		if(wahl.equals("Ari"))
		{
		hobo = (float)(((Ring1+Ring2)/2));
		System.out.println("Ari: "+hobo);
		}
		else if (wahl.equals("Harmo"))
		{
			habo = 2/(1.0/Ring1 + 1.0/Ring2);
			System.out.println("Harmo: "+habo);
		} 
		else System.out.println("FAIL!");
				
	}
	private static void geldGolum(double geld){
		if(geld >= 1000)
		{
			System.out.println("Geld ist: "+geld+"€");
			System.out.println("Rabatt ist: "+(geld*0.20)+"€");
			System.out.println("Rabbatierte Preis ist: "+(geld*0.80)+"€");
		}
		else
		{
			System.out.println("Gibt's nix rabatt, bruddhaaa");
		}
	}
	

}
