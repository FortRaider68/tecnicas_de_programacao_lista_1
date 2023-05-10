package questao5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente clienteRod = new Cliente("Rodrigo", "Meus Contatos");
		Contato contatoJonas = new Contato("33387767");
		clienteRod.agenda.adicionarContato(contatoJonas);
		System.out.println(clienteRod.agenda.contatos.get(0).telefone);
	}

}
