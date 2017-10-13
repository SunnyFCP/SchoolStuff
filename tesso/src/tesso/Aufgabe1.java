package tesso;

public class Aufgabe1
{
	static int meineZahl = 10;
	static int maxab(int a, int b)
	{ /* 3 n0=x0=a1, b1,meineZahl=1, args1 */
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	static int berechneZahl(int x)
	{ /* 2 n0=x1, y1, meineZahl=1, args1 */
		int y;
		y = meineZahl * maxab(x,0);
		return y;
	}
	public static void main (String[] args)
	{ /* 1 n=1,   // 0 Nicht sichtbar // 1 Sichtbar // nichts da*/
		int n;
		n = 10;
		System.out.println(berechneZahl(n));
	}
}