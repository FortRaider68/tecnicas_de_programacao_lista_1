import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientesCadastrados = new ArrayList<Cliente>();
	private ArrayList<Publicacao> publicacoesCadastradas = new ArrayList<Publicacao>();
	private ArrayList<Emprestismo> emprestimosCadastrados = new ArrayList<Emprestismo>();
	
	void cadastrarCliente(Cliente cliente) {
		if(temCliente(cliente)) {
			System.out.println(cliente.nome + " já está cadastrado em nosso sistema.");
			return;
		}	
		clientesCadastrados.add(cliente);
		System.out.println(cliente.nome + " foi cadastrado com sucesso em nosso sistema.");
	}
	
	boolean temCliente(Cliente cliente) {
		boolean temCliente = false;
		for(Cliente i : clientesCadastrados) {
			if(i == cliente)
				temCliente = true;
		}
		return temCliente;
	}
	
	void cadastrarPublicacoes(Publicacao publicacao) {
		if(temPublicacao(publicacao)) {
			System.out.println("Essa publicação já existe em nosso banco.");
			return;
		}
		publicacoesCadastradas.add(publicacao);
		System.out.println("("+publicacao.titulo + ") foi adicionado com sucesso no banco de dados.");
	}
	
	public boolean temPublicacao(Publicacao publicacao) {
		boolean temPublicacao = false;
		for(Publicacao i : publicacoesCadastradas) {
			if(i == publicacao)
				temPublicacao = true;
		}
		return temPublicacao;
	}
	
	void cadastrarEmprestimo(Emprestismo emprestismo) {
		emprestimosCadastrados.add(emprestismo);
		System.out.println("Emprestimo Cadastrado com sucesso no banco de dados.");
	}
	
	void listarPublicacoes() {}
	
	void listarClientes() {}
	
	public ArrayList<Emprestismo> listarEmprestimos() {
		return emprestimosCadastrados;
	}
	
	public boolean RemoverEmprestimo(Emprestismo emprestimo) {
		if(!temEmprestimo(emprestimo)) {
			System.out.println("Não há registro desse emprestimo em nosso banco de dados.");
			return false;
		}
		emprestimosCadastrados.remove(emprestimo);
		return true;
	}
	
	public boolean temEmprestimo(Emprestismo emprestimo) {
		boolean emprestimoRegistrado = false;
		for(Emprestismo i : emprestimosCadastrados) {
			if(i.cliente == emprestimo.cliente && i.publicacao == emprestimo.publicacao)
				emprestimoRegistrado = true;
		}
		
		return emprestimoRegistrado;
		
	}
}
