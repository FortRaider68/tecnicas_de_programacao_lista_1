
public class Emprestismo {
	public Publicacao publicacao;
	public int dias;
	public Cliente cliente;
	
	public Emprestismo(Publicacao publicacao, int dias, Cliente cliente) {
		super();
		this.publicacao = publicacao;
		this.dias = dias;
		this.cliente = cliente;
		
		if(dias < 1) {
			System.out.println("Você precisa ficar com o material por pelo menos 1 dia.\nComo pretende estuda-lo em tão pouco tempo?");
			this.dias = 1;
		}
	}
	
	void concluirEmprestimo(Banco DB) {
		if(publicacao.quantidade == 0) {
			System.out.println("Não há mais copias para serem emprestadas.");
			return;
		}
		
		if(cliente.emprestimoBloqueado) {
			System.out.println("Seu emprestimo está temporariamente bloqueado. Devolva um material para continuar os emprestimos.");
			return;
		}
		
		if(DB.temEmprestimo(this)) {
			System.out.println("Você já pegou esse material emprestado. Por que quer mais de uma copia dele?");
			return;
		}
		
		//Limite de Emprestimos 
		int quantidade = 0;
		for(Emprestismo i : DB.listarEmprestimos()) {
			if(i.cliente == cliente)
				quantidade++;
		}
		if(quantidade >= cliente.limiteEmprestimos) {
			System.out.println("Você excedeu o Limite de Emprestimos de sua Conta. Devolva um livro para continuar com os emprestimos.");
			return;
		}
		
		publicacao.emprestarLivro();;
		cliente.processarTps(publicacao);
		DB.cadastrarEmprestimo(this);
		
	}
	
	void devolverEmprestimo(Banco DB) {
		if(DB.RemoverEmprestimo(this)) {
			publicacao.livroDevolvido();
			cliente.desbloquearEmprestimo();
		}
	}
	
}
