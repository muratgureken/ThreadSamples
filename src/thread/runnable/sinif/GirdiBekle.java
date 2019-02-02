package thread.runnable.sinif;

import java.util.Scanner;

public class GirdiBekle extends Thread{
	boolean durum=true;
	Scanner scan = new Scanner(System.in);
	@Override
	public void run() {
		while(durum)
		{
			int veri=scan.nextInt();
			if(veri==-1)
			{
				durum = false;
			}
			else
				System.out.println("Girdi"+veri);
		}
	}
}
