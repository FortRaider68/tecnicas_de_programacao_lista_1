package questao8;

public class ContaEspecial extends ContaCorrente {
	public double limite;
	
	public ContaEspecial(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}
	
	public void sacar(double aRetirar) {
		if(saldo - aRetirar < -limite) {
			System.out.println("Essa quantia excede seu limite.");
			return;
		}
		saldo-=aRetirar;
		System.out.println("Retirado - R$:"+aRetirar+"\nSaldo - R$:"+saldo);
	} 
}
