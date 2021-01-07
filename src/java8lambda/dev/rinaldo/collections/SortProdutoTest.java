package java8lambda.dev.rinaldo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProdutoNomeComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto produto1, Produto produto2) {
		return produto1.getNome().compareTo(produto2.getNome());
	}

}

public class SortProdutoTest {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();

		Produto produto1 = new Produto(123l, "D - Laptop", 200.9);
		Produto produto2 = new Produto(321l, "A - Picanha", 26.4);
		Produto produto3 = new Produto(879l, "G - Teclado Razer", 1000.0);
		Produto produto4 = new Produto(012l, "W - Celular Sansung galaxy s7 64gb", 3250.0);

		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);

		Collections.sort(produtos, new ProdutoNomeComparator());

		produtos.forEach(System.out::println);

	}

}
