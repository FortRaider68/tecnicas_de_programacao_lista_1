package questao9;

public class Triangulo extends Forma{
	
	public Triangulo(String nome) {
		super(nome);
	}
	public float calcularArea(float lado) {
		return (float)(lado * Math.sqrt(Math.pow(0.5,2)+Math.pow(lado, 2))/2);
	}
	
	public float calcularArea(float base, float lado) {
		return (float)(base * Math.sqrt(Math.pow((base/2),2) + Math.pow(lado, 2))/2);
	}
	
}
