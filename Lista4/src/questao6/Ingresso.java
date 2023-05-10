package questao6;

public class Ingresso {
	double valor;
	
	public Ingresso(double valor) {
		super();
		this.valor = valor;
		
		if(valor < 0.0){
			this.valor = 0.0;
		}
	}
	
	public String toString() {
		return "R$:" + valor; 
	}
	
}
