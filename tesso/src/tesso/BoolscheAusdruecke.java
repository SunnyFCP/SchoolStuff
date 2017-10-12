package tesso;
//import java.util.*;
/*
public class BoolscheAusdruecke
{
   public static void main (String[] args)
   {
    // Deklaration Variablen
	int i;
	
	// Deklaration Referenzvariablen
	Scanner meinScan;
	String meinString;
	
	// Konstruktion Scanner-Objekt
	meinScan = new Scanner(System.in);
		
	// Prüfung & Ausgabe
	System.out.print("\nZum Start bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (1 + 2 == 3)
	   System.out.println("\n 1 + 2 == 3 ergibt true\n");
	else
	   System.out.println("\n 1 + 2 == 3 ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (25 < 5 * 5)
	   System.out.println("\n 25 < 5 * 5 ergibt true\n");
	else
	   System.out.println("\n 25 < 5 * 5 ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (8 + 1 >= 3 + 3)
	   System.out.println("\n 8 + 1 >= 3 + 3 ergibt true\n");
	else
	   System.out.println("\n 8 + 1 >= 3 + 35 ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (5 > 2 || 12 <= 7)
	   System.out.println("\n 5 > 2 || 12 <= 7 ergibt true\n");
	else
	   System.out.println("\n 5 > 2 || 12 <= 7 ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (5 > 2 && 12 <= 7)
	   System.out.println("\n 5 > 2 && 12 <= 7 ergibt true\n");
	else
	   System.out.println("\n 5 > 2 && 12 <= 7 ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (3 == 8 && 6 != 6)
	   System.out.println("\n 3 == 8 && 6 != 6 ergibt true\n");
	else
	   System.out.println("\n 3 == 8 && 6 != 6 ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (3 == 8 || 6 != 6)
	   System.out.println("\n 3 == 8 || 6 != 6 ergibt true\n");
	else
	   System.out.println("\n 3 == 8 || 6 != 65 ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (1 + 2 > 4 - 2 && 12 < 23)
	   System.out.println("\n 1 + 2 > 4 - 2 && 12 < 23 ergibt true\n");
	else
	   System.out.println("\n 1 + 2 > 4 - 2 && 12 < 23 ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (1 + 2 > 4 - 2 || 12 < 23)
	   System.out.println("\n 1 + 2 > 4 - 2 || 12 < 23 ergibt true\n");
	else
	   System.out.println("\n 1 + 2 > 4 - 2 || 12 < 23 ergibt false\n");	
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (1 + 2 > 4 - 2 && 12 > 23)
	   System.out.println("\n 1 + 2 > 4 - 2 && 12 > 23 ergibt true\n");
	else
	   System.out.println("\n 1 + 2 > 4 - 2 && 12 > 23 ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (1 + 2 > 4 - 2 || 12 > 23)
	   System.out.println("\n 1 + 2 > 4 - 2 || 12 > 23 ergibt true\n");
	else
	   System.out.println("\n 1 + 2 > 4 - 2 || 12 > 23 ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (!((23+17) == 40))
	   System.out.println("\n !((23+17) == 40) ergibt true\n");
	else
	   System.out.println("\n !((23+17) == 40) ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (((23.0 + 17) != 40.0) && true)
	   System.out.println("\n ((23.0 + 17) != 40.0) && true ergibt true\n");
	else
	   System.out.println("\n ((23.0 + 17) != 40.0) && true ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (true || (2 > 3))
	   System.out.println("\n true || (2 > 3) ergibt true\n");
	else
	   System.out.println("\n true || (2 > 3) ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if ((!('a' == 'b')) || (!(!(2 == 2))))
	   System.out.println("\n (!(\'a\' == \'b\')) || (!(!(2 == 2))) ergibt true\n");
	else
	   System.out.println("\n (!(\'a\' == \'b\')) || (!(!(2 == 2))) ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (('a' == 'a') && ( 2 < 3))
	   System.out.println("\n (\'a\' == \'a\') && ( 2 < 3) ergibt true\n");
	else
	   System.out.println("\n (\'a\' == \'a\') && ( 2 < 3) ergibt false\n");
	   
    System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if ((true && ('x' == 'x')) || false)
	   System.out.println("\n (true && (\'x\' == \'x\')) || false ergibt true\n");
	else
	   System.out.println("\n (true && (\'x\' == \'x\')) || false ergibt false\n");	
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (("ab" + "cd") == "ab cd")
	   System.out.println("\n (\"ab\" + \"cd\") == \"ab cd\" ergibt true\n");
	else
	   System.out.println("\n (\"ab\" + \"cd\") == \"ab cd\" ergibt false\n");
 
    System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if ((6.6 / 3.3) == 2)
	   System.out.println("\n (6.6 / 3.3) == 2 ergibt true\n");
	else
	   System.out.println("\n (6.6 / 3.3) == 2 ergibt false\n");

    System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if ((10 / 4 == 2) || ('a' != 'b'))
	   System.out.println("\n (10 / 4 == 2) || ('a' != 'b') ergibt true\n");
	else
	   System.out.println("\n (10 / 4 == 2) || ('a' != 'b') ergibt false\n");

    System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (((10 / 3) - 3) * 123456789 > 0)
	   System.out.println("\n (10 / 3) - 3) * 123456789 > 0 ergibt true\n");
	else
	   System.out.println("\n (10 / 3) - 3) * 123456789 > 0 ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if ('Q' == 'q')
	   System.out.println("\n \'Q\' == \'q\' ergibt true\n");
	else
	   System.out.println("\n \'Q\' == \'q\' ergibt false\n");

    System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (!("Hallo" != "Hallo"))
	   System.out.println("\n !(\"Hallo\" != \"Hallo\") ergibt true\n");
	else
	   System.out.println("\n !(\"Hallo\" != \"Hallo\") ergibt false\n");

    System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if ((!('A' == 'a')) == true)
	   System.out.println("\n (!(\'A\' == \'a\')) == true ergibt true\n");
	else
	   System.out.println("\n (!(\'A\' == \'a\')) == true ergibt false\n");
	   
	System.out.print("\nZum Fortsetzen bitte Enter druecken!");
	meinString = meinScan.nextLine(); 
	if (!((23 + 17) == 40))
	   System.out.println("\n !((23 + 17) == 40) ergibt true\n");
	else
	   System.out.println("\n !((23 + 17) == 40) ergibt false\n");	   
	
	System.out.print("\nZum Beenden bitte Enter druecken!");   
	meinString = meinScan.nextLine();
   }
}
*/