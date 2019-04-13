package exercicio2;

public class dvd extends produto{
	private String duracao;
	
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	dvd(String name, float price, String duracao){
		super(name, price);
		this.duracao = duracao;
	}
	public String toString() {
		return this.getName() + this.getPrice() + this.getDuracao();
	}
}
