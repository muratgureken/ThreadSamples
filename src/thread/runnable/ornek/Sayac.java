package thread.runnable.ornek;

public class Sayac implements Runnable
{
	public Sayac() {
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}