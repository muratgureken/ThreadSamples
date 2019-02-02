package thread.runnable.sinif;

import java.util.concurrent.TimeUnit;

public class Calistir extends Thread /*run metodunu ezmek geerk, yoksa start deyince bir islem yapmaz*/{
	
	public Calistir(String isim) {
		this.setName(isim);
	}
	
	@Override
	public void run() {
		while(true)
		{
		for(int i=0;i<10;i++)
		{
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName()+" "+i);
		}
		}
	}
}
