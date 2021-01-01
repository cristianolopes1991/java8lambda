package java8lambda.dev.rinaldo.thread;

public class Threads_1 {

	public static void main(String[] args) {
		
		//Thread atual
		Thread meuRunnable = Thread.currentThread();
		System.out.println(meuRunnable.getName());
		
		//Nova thread
		Thread t1 = new Thread(new MeuRunnable());
		t1.run(); //apenas executando na mesma thread
		t1.start();//executando em uma nova thread
		
		//Runnable com lambda
		Thread t2 = new Thread(() -> System.out.println("Increva-se no canal!"));
		t2.start();
		
		Thread t3 = new Thread(meuRunnable);
		t3.start();

	}

}
