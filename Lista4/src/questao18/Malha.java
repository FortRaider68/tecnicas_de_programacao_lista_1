package questao18;

public class Malha {
	private int lado;
	private char [][] malha;
	
	public Malha(int lado) {
		this.lado = lado;
		if(lado < 3) {
			System.out.println("O lado deve possuir ao menos 3 unidades.Usando o minimo");
			this.lado = 3;
		}
		malha = new char[lado][lado];
		
		for (int i = 0; i < lado*lado; i++) {
			int linha = i / lado;
			int coluna = i % lado;
			malha[coluna][linha] = '*';
		}
		spawnMoeda();
	}
	
	public boolean temMoeda(int x, int y) {
		if(malha[x][y] == '$')
			return true;
		return false;
	}
	
	public int getLado() {
		return lado;
	}
	
	private void spawnMoeda() {
		int x = (int)Math.round(Math.random() * (lado-1));
		int y = (int)Math.round(Math.random() * (lado-1));
		malha[x][y] = '$';
	}
	
	public void mostrarMalha() {
		for (int i = 0; i < lado*lado; i++) {
			int linha = i / lado;
			int coluna = i % lado;
			System.out.print(" "+malha[coluna][linha]+" ");
			if(coluna == lado-1)
				System.out.print("\n");
		}
	}
	
	public void moveRobo(int x, int y) {
		try {
			if(temMoeda(x, y)) {
				System.out.println("Você achou a moeda!!!");
			}
			
			malha[x][y] = '@';
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Essa posição (X:"+x+" Y:"+y+") não existe na malha");
		}
	}
	
	public int roboPassou() {
		int quantia = 0;
		for (int i = 0; i < lado*lado; i++) {
			int linha = i / lado;
			int coluna = i % lado;
			if(malha[coluna][linha] == '@')
				quantia++;
		}
		return quantia;
	}
	
	public int roboNaoPassou() {
		int quantia = 0;
		return lado * lado - roboPassou();
	}
}
