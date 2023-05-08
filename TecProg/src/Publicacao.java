
public class Publicacao {
	public String titulo;
	public int ano;
	public String autor;
	int quantidade;
	
	public Publicacao(String titulo, int ano, String autor,int quantidade) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.autor = autor;
		this.quantidade = quantidade;
	}
	
	void emprestarLivro() {
		if(quantidade <= 0) {
			System.out.println("Não há mais copias para serem emprestadas.");
			return;
		}
		quantidade--;
	}
	
	void livroDevolvido() {
		quantidade++;
	}
	
	float getDescontoAluno() {
		return 0;
	}
}
