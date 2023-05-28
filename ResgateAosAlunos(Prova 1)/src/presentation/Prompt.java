package presentation;

public class Prompt extends Tela {
	
	public void imprimi() {
		limparTela();
		System.out.println(this.getMessage());
	}
	
	public String promptNome() {
		setMessage("Insira seu nome");
		imprimi();
		return promptString();
	}
	
	public String[] promptPlanoParametros() {
		setMessage("Digite as dimensões do plano (minimo 7x7):");
		imprimi();
		return promptToken("x");
	}
	public int promptQuantidadeBugs(int maximo ) {
		setMessage("Insira o número de Bugs que deseja ter no jogo (MAX:"+ maximo+")");
		imprimi();
		return promptInt();
	}
	public int promptQuantidadeAlunos(int maximo) {
		setMessage("Insira o número de Alunos que deseja ter no jogo (MAX:"+ maximo+")");
		imprimi();
		return promptInt();
	}
}
