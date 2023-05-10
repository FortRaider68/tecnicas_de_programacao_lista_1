package questao6;

public class IngressoVIP extends Ingresso {
	double valorAdicional;

	public IngressoVIP(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
		
		if(valorAdicional < 0.0)
			this.valorAdicional = 0.0;
		
		this.valor+=valorAdicional;
	}
	
	public String toString() {
		return "R$:" + valor;  
	}
	
}
