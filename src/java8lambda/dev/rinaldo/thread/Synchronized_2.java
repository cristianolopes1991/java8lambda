package java8lambda.dev.rinaldo.thread;

public class Synchronized_2 {
	
	public static int i = 0;

	public static void main(String[] args) {
		MeuRunnable runnable = new MeuRunnable();
		
		Thread t0 = new Thread(runnable);
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		Thread t4 = new Thread(runnable);
		Thread t5 = new Thread(runnable);
		Thread t6 = new Thread(runnable);
		Thread t7 = new Thread(runnable);
		Thread t8 = new Thread(runnable);
		Thread t9 = new Thread(runnable);
		Thread t10 = new Thread(runnable);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
	}
	
	public static class MeuRunnable implements Runnable{

		@Override
		public void run() {
			int j;
			
			synchronized(this) {
				i++;
				j = i;
			}
			
			String name = Thread.currentThread().getName();
			System.out.println(name + " J: " +j);
		}
		
	}

}
