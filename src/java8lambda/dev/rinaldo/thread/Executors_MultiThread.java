package java8lambda.dev.rinaldo.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executors_MultiThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = null;
		try {
//			executor = Executors.newFixedThreadPool(4);
			executor = Executors.newCachedThreadPool();
			Future<String> f1 = executor.submit(new Tarefa());
			Future<String> f2 = executor.submit(new Tarefa());
			Future<String> f3 = executor.submit(new Tarefa());
			System.out.println(f1.get());
			System.out.println(f2.get());
			System.out.println(f3.get());
			executor.shutdown();
		} catch (Exception e) {
			throw e;
		} finally {
			if (executor != null) {
				executor.shutdownNow();
			}
		}

	}

	public static class Tarefa implements Callable<String> {

		@Override
		public String call() throws Exception {
			Thread.sleep(1000);
			String name = Thread.currentThread().getName();
			int nextInt = new Random().nextInt(1000);
			return name + ": Inscreva-se no canal! " + nextInt;
		}

	}
}
