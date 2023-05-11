package questao9;

public abstract class Forma {
	public String nome;
	
	public Forma(String nome) {
		super();
		this.nome = nome;
	}
	
	public void imprimirNome() {
		System.out.println(nome);
	}
	
	public float calcularArea() {
		return 0.0f;
	}
}
