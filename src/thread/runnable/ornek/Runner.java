package thread.runnable.ornek;

public class Runner {

	public static void main(String[] args) {
		Thread t = new Thread(()->{System.out.println("Geldi");});
		t.start();
		
		Thread t1 = new Thread(new Sayac());
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("3. yontem");			
			}
		});
		t2.start();
	}
}
