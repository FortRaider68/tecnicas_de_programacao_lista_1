
public class Livro extends Publicacao{
	
	public Livro(String titulo, int ano, String autor, int quantidade) {
		super(titulo, ano, autor, quantidade);
		// TODO Auto-generated constructor stub
	}

	float getDescontoAluno() {
		return 0.1f;
	}
}
