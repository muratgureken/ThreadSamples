package senkronize.thread.ornek;

import java.util.concurrent.Semaphore;

public class Runner {
	Object obj;
	static Semaphore sem = new Semaphore(1);
	public static Integer a=0;
	public static void main(String[] args) {

		//senkronize edilmis tread'ler birbirlerinin islemleri arasina girmez.
		Thread t1 = new Thread(()->{sayacAzalt("1");});
		t1.start();
		Thread t2 = new Thread(()->{sayacAzalt("2");});
		t2.start();		
		Thread t3 = new Thread(()->{sayacArtir("3");});
		t3.start();	
	}

	public /*synchronized*/ static void sayacAzalt(String isim)
	{
		try {
			sem.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i=0;i<10;i++)
		{
			System.out.println(isim+" calisti : "+a--);
		}
		//sem.release();
	}
	
	public /*synchronized*/ static void sayacArtir(String isim)
	{
		for (int i=0;i<10;i++)
		{
			System.out.println(isim+" artir "+a++);
		}
		sem.release();
	}
}
