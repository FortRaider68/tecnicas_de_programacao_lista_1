package questao6;

import java.util.ArrayList;

public class Evento {
	public ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
	
	void comprarIngresso(Ingresso ingresso) {
		ingressos.add(ingresso);
	}
	
	public double totalArrecadado() {
		double total = 0.0;
		for (int i = 0; i < ingressos.size(); i++) {
			total+=ingressos.get(i).valor;
		}
		
		return total;
	}
}
