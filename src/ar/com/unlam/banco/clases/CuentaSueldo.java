package ar.com.unlam.banco.clases;

public class CuentaSueldo extends Cuenta{

	public CuentaSueldo() {
		super();
	}
	@Override
	public Double extraer(Double monto) {
		if(this.saldo < monto) {
			return 0.0;
		}else {
			this.saldo = saldo-monto;
		}
		return monto;
	}
}
