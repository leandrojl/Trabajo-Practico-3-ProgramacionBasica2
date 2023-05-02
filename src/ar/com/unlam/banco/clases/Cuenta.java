package ar.com.unlam.banco.clases;

public class Cuenta {
	
	Double saldo=0.0;
	
	public Cuenta() {
		
	}
	
	public Cuenta(Double saldo) {
		this.saldo=saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(Double monto) {
		this.saldo= saldo+monto;
	}
	
	public Double extraer(Double monto) {
		this.saldo= saldo-monto;
		return saldo;
	};

}
