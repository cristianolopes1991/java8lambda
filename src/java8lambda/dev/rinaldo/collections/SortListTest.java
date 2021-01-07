package java8lambda.dev.rinaldo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("William");
		nomes.add("Suane");
		nomes.add("DevDojo");
		nomes.add("Brenno");
		nomes.add("Bruno");
		nomes.add(0, "Anna");
		
		Collections.sort(nomes);
		
		nomes.forEach(System.out::println);
		System.out.println("---------------------");
		
		List<Double> numeros = new ArrayList<>();
		numeros.add(1.5);
		numeros.add(1.3);
		numeros.add(1.9);
		numeros.add(2d);
		
		Collections.sort(numeros);
		
		numeros.forEach(System.out::println);
	}

}
