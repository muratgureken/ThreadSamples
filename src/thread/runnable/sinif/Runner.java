package thread.runnable.sinif;

import java.util.Scanner;

public class Runner extends Thread{

	public static void main(String[] args) {
		
		boolean durum=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Program basladi");
		Thread t = new Calistir("Thread1");
		Calistir c = new Calistir("Thread2");		
		KareHesapla k = new KareHesapla();	
			
		/*while(true)
		{
			System.out.println("Runner:"+scan.next());

			t.start();
			c.start();
		}*/
		
		k.start();
		
		while(durum)
		{
			k.deger = scan.nextInt();
			if(k.deger==-1)
			{
				durum=false;
				k.durum = false;
			}
			System.out.println("Deger:"+k.deger);
		}
		
		System.out.println("Program bitti");
	}

}
