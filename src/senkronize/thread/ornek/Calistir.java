package senkronize.thread.ornek;

public class Calistir extends Thread{
	Object o=new Object();
	
	public Calistir(String isim) {
		this.setName(isim);
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++)
		{
			synchronized (o) {
					System.out.println(this.getName() +" " +i);
			}
		}
	}
	
}
