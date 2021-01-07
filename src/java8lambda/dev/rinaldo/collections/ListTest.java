package java8lambda.dev.rinaldo.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//Forma antiga até a versão 5
		List nome = new ArrayList();
		nome.add("William");
		nome.add("DevDojo");
		
		for(Object no: nome) {
			System.out.println(no);
			System.out.println("------------");
		}
		
		List<String> nomes1 = new ArrayList<>();
		nomes1.add("Goku");
		nomes1.add("DevDojo");
		
		nomes1.forEach(System.out::println);
	}

}
