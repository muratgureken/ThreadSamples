package thread.packag.ornek;

public class Runner {

	public static void main(String[] args) {
		//thread'ler senkronize degil. Rapor() icerisinde bekle var ama; ilk araya giren Rapor hazirlandi mesajini basar.
		Thread t1 = new Thread(new Rapor("Maas"));
		Thread t2 = new Thread(new Rapor("Personel"));
		Thread t3 = new Thread(new Rapor("Fazla Mesai"));
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Program Bitti...!");
	}

}
