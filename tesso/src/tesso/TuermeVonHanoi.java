package tesso;
public class TuermeVonHanoi
{
	static void bewegeScheibe(int n, String startSaeule, String endSaeule, String zwischenSaeule)
	{ 
		if (n > 1)
		{
			bewegeScheibe(n-1, startSaeule, zwischenSaeule, endSaeule);
			System.out.printf("Bewege Scheibe %d von der %s zur %s.%n", n, startSaeule, endSaeule);
			bewegeScheibe(n-1, zwischenSaeule, endSaeule, startSaeule);
		}
		else
		{
			System.out.printf("Bewege Scheibe %d von der %s zur %s.%n", n, startSaeule, endSaeule);			
		}
	}

	public static void main (String[] args)
	{ 
		bewegeScheibe(50, "Kupfersaeule", "Goldsaeule", "Silbersaeule");
    }
}