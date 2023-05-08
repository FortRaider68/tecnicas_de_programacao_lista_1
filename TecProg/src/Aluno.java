
public class Aluno extends Cliente implements ClienteI {
	
	public Aluno(long matricula, String nome) {
		super(matricula, nome);
		this.limiteEmprestimos = 5;
		this.diasDeEmprestimo = 10;
		// TODO Auto-generated constructor stub
	}

	public void processarTps(Publicacao publicacao) {
		tps+=10 - 10 * publicacao.getDescontoAluno();
		bloquearEmprestimo();
	}
}
