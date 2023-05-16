package ar.com.unlam.banco.clases;

public class CuentaCorriente extends Cuenta{
	
	Double descubierto;
	
	public CuentaCorriente() {
		super();
	}
	public CuentaCorriente(Double descubierto) {
		super();
		this.descubierto = descubierto;
	}
	
	@Override
	public Double extraer(Double monto) {
		if(monto > getSaldo() && getDescubierto()>= Math.abs((getSaldo()-monto))) {
			Double descubiertoUtilizado=Math.abs((getSaldo()-monto));
			Double nuevoSaldo= getSaldo()-(monto+(descubiertoUtilizado*0.05));
			setSaldo(nuevoSaldo);
			return monto;
		}else {
			Double saldoARetirar=getSaldo()-monto;
			setSaldo(saldoARetirar);
			return getSaldo()-monto;
		}
		
	}
	@Override
	public void depositar(Double monto) {
		setSaldo(getSaldo()+monto);
	}
	public Double getDescubierto() {
		return descubierto;
	}
	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	};
	
	
}
