package thread.clas.senkronize;

public class Runner {

	public static int sayac=0;
	public synchronized static void sayiArtir()
	{
		int i=sayac;
		bekle(1000);
		sayac = i+1;
	}
	
	public static class Sayac implements Runnable /*inner class*/
	{	
		private String isim;
		public Sayac(String isim) {
			this.isim = isim;
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				sayiArtir();
				System.out.println("Thread-"+isim+ " sayac degeri: " +sayac+" oldu.");
			}
		}
	}
	
	public static void bekle(int i)
	{
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Sayac("1")); //direk =new Sayac(); yazamazdik, cunku Sayac class'i thread degil, sadece Runnable
		Thread t2 = new Thread(new Sayac("2"));
		//2 thread senkronize calisacak. treadler icerisinde bekle() oldugu icin, 1 tread calisiyor, o beklerken diger thread calisiyor.
		t1.start();
		t2.start();
	}

}
