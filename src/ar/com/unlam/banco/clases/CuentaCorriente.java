package ar.com.unlam.banco.clases;

public class CuentaCorriente extends Cuenta{
	
	Double descubierto=0.0;
	
	public CuentaCorriente() {
		super();
	}
	public CuentaCorriente(Double descubierto) {
		super();
		this.descubierto = descubierto;
	}
	
	@Override
	public Double extraer(Double monto) {
		if(monto > this.saldo) {
			setDescubierto(this.saldo-monto);
		}
		return monto;
	}
	@Override
	public void depositar(Double monto) {
		if(getDescubierto() != 0.0) {
			descubierto= this.saldo -(monto+(monto*0.05));
		}else {
			this.saldo= saldo+monto;
		}
	}
	public Double getDescubierto() {
		return descubierto;
	}
	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	};
	
	
}
