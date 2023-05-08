
public class Cliente {
	public long matricula;
	public String nome;
	public int tps;
	int limiteEmprestimos;
	int diasDeEmprestimo;
	public boolean emprestimoBloqueado;
	
	public Cliente(long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.tps = 0;
		this.emprestimoBloqueado = false;
	}

	public void bloquearEmprestimo() {
		if(tps % 50 == 0)
			emprestimoBloqueado = true;
	}
	
	public void desbloquearEmprestimo() {
		if(emprestimoBloqueado) {
			emprestimoBloqueado = false;
			System.out.println("Emprestimo desbloqueado :)");
		}
	}
	
	public void processarTps(Publicacao publicacao) {
		System.out.println("Apenas para chamar da classe pai.");
	}
}
