package questao9;

public class Circulo extends Forma {

	public Circulo(String nome) {
		super(nome);
	}
	
	public float calcularArea(float raio) {
		return (float)(Math.pow(raio, 2) * Math.PI);
	}

}
