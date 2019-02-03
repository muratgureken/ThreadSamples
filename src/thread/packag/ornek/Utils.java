package thread.packag.ornek;

public class Utils {
	//diger class'larin kullanabilmesi icin static metot tanimlandi.
	public static void bekle(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
