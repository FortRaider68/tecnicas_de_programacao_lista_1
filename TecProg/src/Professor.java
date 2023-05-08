
public class Professor extends Cliente implements ClienteI{
	
	public Professor(long matricula, String nome) {
		super(matricula, nome);
		this.limiteEmprestimos = 10;
		// TODO Auto-generated constructor stub
	}

	public void processarTps(Publicacao publicacao) {
		tps+=25;
		bloquearEmprestimo();
	}
}
