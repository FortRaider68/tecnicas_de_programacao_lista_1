package questao18;

public class Main {
	public static void main(String[] args) {
		Malha malha = new Malha(10);
		Robo robo = new Robo(malha);
		Caminhos caminhos = new Caminhos(robo, malha);
		//caminhos.a();
		caminhos.b();
		//caminhos.c();
		malha.mostrarMalha();
	}
}
