package questao9;

public class Quadrado extends Forma {
	
	public Quadrado(String nome) {
		super(nome);
	}
	
	public float calcularArea(float lado) {
		return (float)Math.pow(lado, 2);
	}
}
