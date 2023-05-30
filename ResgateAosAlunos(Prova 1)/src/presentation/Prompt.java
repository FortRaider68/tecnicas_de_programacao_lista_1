package presentation;

public class Prompt extends Tela {
	
	public void imprimir() {
		limparTela();
		System.out.println(this.getMessage());
		Tela.message = "";
	}
	
	public String promptNome() {
		setMessage("Insira seu nome");
		imprimir();
		return promptString();
	}
	
	public String[] promptPlanoParametros() {
		setMessage("Digite as dimensões do plano (minimo 7x7):");
		imprimir();
		return promptToken("x");
	}
	public int promptQuantidadeBugs(int maximo ) {
		setMessage("Insira o número de Bugs que deseja ter no jogo (MAX:"+ maximo+")");
		imprimir();
		return promptInt();
	}
	public int promptQuantidadeAlunos(int maximo) {
		setMessage("Insira o número de Alunos que deseja ter no jogo (MAX:"+ maximo+")");
		imprimir();
		return promptInt();
	}
	
	public void setMessage(String message) {
		Tela.message = message;
	}
}
