package java8lambda.dev.rinaldo.java8lambda;

public class Jara8LambdaRunnable {

	public static void main(String[] args) {
		
		new Thread(() -> System.out.println("Olá mundo!")).run();
		
		
		
	}

}
