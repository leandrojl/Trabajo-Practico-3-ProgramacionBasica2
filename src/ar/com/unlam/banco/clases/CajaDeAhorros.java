package ar.com.unlam.banco.clases;

public class CajaDeAhorros extends Cuenta{
	
	Integer numeroDeExtracciones;

	public CajaDeAhorros() {
		super();
		numeroDeExtracciones=0;
	}
	
	@Override
	public Double extraer(Double monto) {
		
		numeroDeExtracciones=numeroDeExtracciones+1;
		
		if(numeroDeExtracciones <6){
			
			this.saldo= saldo-monto;
			return saldo;
		}else {
			this.saldo= (saldo-monto)-6;
			return saldo;
		}
		
	};
}
