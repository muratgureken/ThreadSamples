package thread.packag.ornek;

public class Rapor implements Runnable{
	private String isim;
	public Rapor(String isim) {
		this.isim = isim;
	}
	
	@Override
	public void run() {
		System.out.println(isim+" Rapor hazirlaniyor...!");
		Utils.bekle(100);
		System.out.println(isim+" Rapor hazirlandi...!");
	}
}
