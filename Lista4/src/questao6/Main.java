package questao6;

public class Main {

	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso(52.8);
		IngressoVIP vip = new IngressoVIP(52.8, 70.0);
		
		Evento show = new Evento();
		
		System.out.println("Preços:\nIngresso comum:"+ingresso.toString()+"\nIngresso VIP:"+vip.toString());
		
		show.comprarIngresso(vip);
		show.comprarIngresso(ingresso);
		show.comprarIngresso(vip);
		show.comprarIngresso(vip);
		show.comprarIngresso(vip);
		show.comprarIngresso(vip);
		show.comprarIngresso(vip);
		show.comprarIngresso(ingresso);
		show.comprarIngresso(ingresso);
		show.comprarIngresso(ingresso);
		show.comprarIngresso(ingresso);
		show.comprarIngresso(ingresso);
		show.comprarIngresso(ingresso);
		show.comprarIngresso(ingresso);
		show.comprarIngresso(ingresso);
		show.comprarIngresso(ingresso);
		show.comprarIngresso(ingresso);

		System.out.printf("Total arrecadado: R$%.2f\n",show.totalArrecadado());
	}

}
