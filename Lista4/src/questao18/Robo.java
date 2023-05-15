package questao18;

public class Robo {
	
	private int x,y;
	private int n, no, ne, l, o, so, se, s;
	private Malha malha;
	public enum estados {NORTE, NOROESTE, NORDESTE, LESTE, OESTE, SULDOESTE, SULDESTE, SUL};
	private estados ultimoEstado;
	
	public Robo(Malha malha) {
		int meio = (int)Math.floor((malha.getLado() - 1) / 2);
		x = meio;
		y = meio;
		this.malha = malha;
	}

	public void moveRobo() {
		malha.moveRobo(x, y);
	}
	
	public void moveRobo(estados ultimoPasso) {
		if(ultimoEstado == ultimoPasso)
			return;
		malha.moveRobo(x, y);
	}
	
	
	public void norte() {
		n++;
		y--;
	}
	
	public void nordeste() {
		ne++;
		y--;
		x++;
	}
	
	public void noroeste() {
		no++;
		y--;
		x--;
	}
	
	public void leste() {
		l++;
		x++;
	}
	
	public void oeste() {
		o++;
		x--;
	}
	
	public void suldeste() {
		se++;
		y++;
		x++;
	}
	
	public void suldoeste() {
		so++;
		y++;
		x--;
	}
	
	public void sul() {
		s++;
		y++;
	}
}
