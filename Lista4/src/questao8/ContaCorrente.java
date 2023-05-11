package questao8;

public class ContaCorrente {
	protected double saldo;
	
	public ContaCorrente(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public void sacar(double aRetirar) {
		if(saldo - aRetirar < 0.0) {
			System.out.println("Você não tem saldo suficiente para o saque.");
			return;
		}
		saldo-=aRetirar;
		System.out.println("Retirado - R$:"+aRetirar+"\nSaldo - R$:"+saldo);
	} 
}
