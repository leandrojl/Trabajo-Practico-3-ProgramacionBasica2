package ar.com.unlam.test.banco;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ar.com.unlam.banco.clases.Banco;
import ar.com.unlam.banco.clases.CajaDeAhorros;
import ar.com.unlam.banco.clases.Cliente;
import ar.com.unlam.banco.clases.Cuenta;
import ar.com.unlam.banco.clases.CuentaCorriente;
import ar.com.unlam.banco.clases.CuentaSueldo;

public class TestBanco {

	@Test
	public void dadoQueTengoUnBancoConUnaCuenta() {
		Banco banco = new Banco("Banco Provincia");
		Cuenta cuenta = new Cuenta();
		
		banco.agregarCuenta(cuenta);
		
		Assert.assertTrue(banco.getCuentas().contains(cuenta));
	}
	@Test
	public void dadoQueTengoUnBancoConUnCliente() {
		Banco banco = new Banco("Banco Provincia");
		Cliente cliente = new Cliente();
		
		banco.agregarCliente(cliente);
		
		Assert.assertTrue(banco.getClientes().contains(cliente));
	}
	
	@Test
	public void dadoQueTengoUnaCuentaSueldoYLeDepositoDinero() {
		CuentaSueldo cuentasueldo = new CuentaSueldo();
		
		Double montoADepositar= 1000.0;
		
		cuentasueldo.depositar(montoADepositar);
		
		Assert.assertTrue(cuentasueldo.getSaldo().equals(montoADepositar));
	}
	
	@Test
	public void queNoSePuedaExtraerDeLaCuentaSueldoMasDineroDelQueHay() {
		CuentaSueldo cuentasueldo = new CuentaSueldo();
		
		Double montoADepositar= 1000.0;
		
		cuentasueldo.depositar(montoADepositar);
		cuentasueldo.extraer(2000.0);
		
		Assert.assertTrue(cuentasueldo.getSaldo().equals(montoADepositar));
	}
	
	@Test
	public void cuandoUnaCajaDeAhorroHaceLaSextaExtraccionLeCobreUnExtraDe6() {
		CajaDeAhorros cajaDeAhorro = new CajaDeAhorros();
		
		Double montoADepositar= 10000.0;
		Double montoEsperado= 3994.0;
		
		cajaDeAhorro.depositar(montoADepositar);
		cajaDeAhorro.extraer(1000.0);
		cajaDeAhorro.extraer(1000.0);
		cajaDeAhorro.extraer(1000.0);
		cajaDeAhorro.extraer(1000.0);
		cajaDeAhorro.extraer(1000.0);
		cajaDeAhorro.extraer(1000.0);
		
		Assert.assertEquals(montoEsperado, cajaDeAhorro.getSaldo());
		
	}
	
	@Test
	public void queSeCobreCincoPorCientoDeComisionAlExtraerDineroMayorAlSado() {
		Double montoADepositar= 100.0;
		Double montoEsperado= -105.0;
		Double descubierto= 100.0;
		CuentaCorriente cuentacorriente = new CuentaCorriente(descubierto);
		
		
		cuentacorriente.depositar(montoADepositar);
		cuentacorriente.extraer(200.0);
		
		Assert.assertEquals(montoEsperado, cuentacorriente.getSaldo());
		
	}
	@Test
	public void queSeCobreCincoPorCientoDeComisionAlDepositarDineroLuegoDeHaberRealizadoUnaExtraccionMayorAlSaldo() {
	}
	@Test
	public void queSeCobreElCincoPorCientoDeComisionPorMasQueElProximoDepositoNoSeaSuficieteParaCubrirElDescubierto() {
		
	}
	@Test
	public void queUnaExtraccionCuandoYaSeTieneDeudaIncrementeLaDeuda(){
		
	}
	@Test
	public void queVariasOperacionesDeDepositoYExtraccionGenerenElSaldoYLaDeudaCorrecta() {
		
	}
	@Test
	public void queUnClientePuedaTenerVariasCuentas() {
		
	}
	@Test
	public void queUnClientePuedaSerVip() {
		
	}
	@Test
	public void queUnClienteConSaldoMayorA1MillonYSinSaldoNegativoEnOtrasCuentasSeaConsideradoVip() {
		
	}

}
