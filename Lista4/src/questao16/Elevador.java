package questao16;

public class Elevador {
	private int andar;
	private int andares;
	private int capacidade;
	private int passageiros;
	
	public Elevador(int andares, int capacidade) {
		andar = 0;
		this.andares = andares;
		setCapacidade(capacidade);
		setAndares(andares);
		
	}
	
	
	public int getAndar() {
		return andar;
	}

	public int getPassageiros() {
		return passageiros;
	}



	private void setAndares(int andares) {
		if(andares < 1) {
			this.andares = 1;
			System.err.println("O prédio deve ter ao menos um andar.");
			return;
		}
		this.andares = andares;
	}
	
	private void setCapacidade(int capacidade) {
		if(capacidade < 1) {
			this.capacidade = 1;
			System.err.println("A capacidade deve ser de ao menos uma pessoa.");
			return;
		}
		this.capacidade = capacidade;
	}
	
	public void entra() {
		if(passageiros < capacidade) {
			passageiros++;
			return;
		}
		System.out.println("Capacidade excedida");
	}
	
	public void sai(){
		if(passageiros > 0) {
			passageiros--;
			return;
		}
		System.out.println("Não tem ninguém aqui.");
	}
	
	public void sobe() {
		if(andar < andares)
			andar++;
	}
	
	public void desce() {
		if(andar > 0)
			andar--;
	}
	
}
