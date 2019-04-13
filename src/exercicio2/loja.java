package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class loja {
	public static void main(String[] args) {
		cd cd1 = new cd("justinBieber", 20, "1");
		livro livro1 = new livro("Apocalipse", 500, "EduardoSmith");
		dvd dvd1 = new dvd("brasileirinhas", 2, "1hora");
		cd cd2 = new cd("planetHemp", 50, "4");
		livro livroFoda = new livro("eragon", 1000, "seila");
		
		List<produto> produtos = new ArrayList<produto>();
		produtos.add(livro1);
		produtos.add(cd1);
		produtos.add(cd2);
		produtos.add(dvd1);
		produtos.add(livroFoda);
		
		System.out.println(produtos.toString());
	}
}
