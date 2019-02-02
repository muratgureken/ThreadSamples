package thread.runnable.sinif;

import java.util.concurrent.TimeUnit;

public class KareHesapla extends Thread{
	static int deger;
	boolean durum=true;

	public KareHesapla() {
		deger = 0;	
		System.out.println("Karesi:"+(deger*deger));		
	}

	@Override
	public void run() {
		while(durum)
		{
			System.out.println("Karesi:"+(deger*deger));
			try {
				TimeUnit.SECONDS.sleep(1);
				//Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
