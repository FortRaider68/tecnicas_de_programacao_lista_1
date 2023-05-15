package questao18;

public class Caminhos {
	public Robo robo;
	public Malha malha;
	
	public Caminhos(Robo robo, Malha malha) {
		this.robo = robo;
		this.malha = malha;
	}
	public void a(){
		for (int i = 0; i < (int)Math.floor((malha.getLado() - 1) / 2); i++) {
			robo.noroeste();
		}
		robo.moveRobo();
		
		for (int j = 0; j < malha.getLado() - 1; j+=2) {
			for (int i = 0; i < malha.getLado()-1; i++) {
				robo.leste();
				robo.moveRobo();
			}
			robo.sul();
			robo.moveRobo();
			for (int i = 0; i < (malha.getLado()-1); i++) {
				robo.oeste();
				robo.moveRobo();
			}
			if(j < malha.getLado() - 2) {
				robo.sul();
				robo.moveRobo();
			}
		}
	}

	public void b() {
		for (int i = 0; i < (int)Math.floor((malha.getLado() - 1) / 2); i++) {
			robo.noroeste();
		}
		robo.moveRobo();
		for (int i = 0; i < malha.getLado() - 1; i++) {
			robo.suldeste();
			robo.moveRobo();
		}
		for (int i = 0; i < malha.getLado() - 1; i++) {
			robo.norte();
			robo.moveRobo();
		}
		for (int i = 0; i < malha.getLado() - 1; i++) {
			robo.suldoeste();
			robo.moveRobo();
		}
		for (int i = 0; i < malha.getLado() - 1; i++) {
			robo.norte();
			robo.moveRobo();
		}
	}

	public void c() {
		robo.leste();
		robo.moveRobo();
		robo.sul();
		robo.moveRobo();
		
		for (int j = 2; j < malha.getLado() - 1; j+=2) {
			for (int i = 0; i < j; i++) {
				robo.oeste();
				robo.moveRobo();
			}
			for (int i = 0; i < j; i++) {
				robo.norte();
				robo.moveRobo();
			}
			for (int i = 0; i < j + 1; i++) {
				robo.leste();
				robo.moveRobo();
			}
			for (int i = 0; i < j + 1; i++) {
				robo.sul();
				robo.moveRobo();
			}
			
		}
		for (int i = 0; i < malha.getLado()-1; i++) {
			robo.oeste();
			robo.moveRobo();
		}
	}
}
