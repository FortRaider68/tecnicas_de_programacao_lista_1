package presentation;

public class Prompt extends Tela {
	
	public void imprimir() {
		limparTela();
		System.out.println(Tela.getMessage());
		Tela.setMessage("");
	}
	
	public String promptNome() {
		Tela.setMessage("Insira seu nome");
		imprimir();
		return promptString();
	}
	
	public String[] promptPlanoParametros() {
		Tela.setMessage("Digite as dimensões do plano (minimo 7x7):");
		imprimir();
		return promptToken("x");
	}
	public int promptQuantidadeBugs(int maximo ) {
		int i = 0; 
		Tela.setMessage("Insira o número de Bugs que deseja ter no jogo (MAX:"+ maximo+")");
		imprimir();
		try {
			i = Integer.parseInt(lerEntrada());
			return i;
		} catch (Exception e) {
			Tela.setMessage("Entrada Invalida");
			imprimir();
			return this.promptQuantidadeBugs(maximo);
		}
		
	}
	public int promptQuantidadeAlunos(int maximo) {
		int i = 0; 
		Tela.setMessage("Insira o número de Alunos que deseja ter no jogo (MAX:"+ maximo+")");
		imprimir();
		try {
			i = Integer.parseInt(lerEntrada());
			return i;
		} catch (Exception e) {
			Tela.setMessage("Entrada Invalida");
			imprimir();
			return this.promptQuantidadeBugs(maximo);
		}
	}
}
