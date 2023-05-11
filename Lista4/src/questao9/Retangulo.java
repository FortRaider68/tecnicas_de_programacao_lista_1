package questao9;

public class Retangulo extends Forma{
	
	public Retangulo(String nome) {
		super(nome);
	}
	
	public float calcularArea(float base, float altura) {
		return base * altura;
	}

}
