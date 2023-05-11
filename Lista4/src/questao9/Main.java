package questao9;

public class Main {

	public static void main(String[] args) {
		Triangulo tri = new Triangulo("Equilatero");
		System.out.println(tri.calcularArea(1.0f));
		Circulo cir = new Circulo("Circulo");
		System.out.println(cir.calcularArea(3.0f));
		Quadrado quad = new Quadrado("Quadrado");
		System.out.println(quad.calcularArea(4.0f));
		Retangulo ret = new Retangulo("Retângulo");
		System.out.println(ret.calcularArea(3.0f, 4.0f));
		ret.imprimirNome();
	}

}
