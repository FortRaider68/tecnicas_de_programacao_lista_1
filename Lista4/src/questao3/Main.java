package questao3;

public class Main {

	public static void main(String[] args) {
		Fatura fatura = new Fatura(2, "Placa de vídeo", 100, 2333.0);
		
		System.out.print(
				"ID:"+fatura.getIdItem()+"\n"+
				"Descrição: "+fatura.getDescricao()+"\n"+
				"Quantidade:"+fatura.getQuantidade()+"\n"+
				"Preço Unitário: "+fatura.getPrecoUnitario()+" Reais"+"\n"+
				"================================================="+"\n"+
				"PREÇO TOTAL: "+fatura.getValorFatura()+" Reais\n\n\n");

		fatura.descontoPorItem(50); //50%
		
		System.out.print(
				"ID:"+fatura.getIdItem()+"\n"+
				"Descrição: "+fatura.getDescricao()+"\n"+
				"Quantidade:"+fatura.getQuantidade()+"\n"+
				"Preço Unitário: "+fatura.getPrecoUnitario()+" Reais"+"\n"+
				"================================================="+"\n"+
				"PREÇO TOTAL: "+fatura.getValorFatura()+" Reais");
		
	}
}
