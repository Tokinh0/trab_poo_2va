package exercicio2;

public class livro extends produto{
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public livro(String name,float price, String autor) {
		super(name, price);
		this.autor = autor;
	}
	
	public String toString() {
		return "{" + this.getName() + " " + this.getPrice() + " " + this.getAutor() + "}";
	}
}
