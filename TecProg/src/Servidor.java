
public class Servidor extends Cliente implements ClienteI {
	
	public Servidor(long matricula, String nome) {
		super(matricula, nome);
		this.limiteEmprestimos = 7;
		// TODO Auto-generated constructor stub
	}

	public void processarTps(Publicacao publicacao) {
		tps+=15;
		bloquearEmprestimo();
	}
	
}
