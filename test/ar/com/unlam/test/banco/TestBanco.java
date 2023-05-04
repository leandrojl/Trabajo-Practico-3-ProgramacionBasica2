package ar.com.unlam.test.banco;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ar.com.unlam.banco.clases.Banco;
import ar.com.unlam.banco.clases.CajaDeAhorros;
import ar.com.unlam.banco.clases.Cliente;
import ar.com.unlam.banco.clases.Cuenta;
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
	
	public void queSeCobreCincoPorcientoDeComisionAlDepositarDineroLuegoDeHaberRealizadoUnaExtraccionMayorAlSaldo() {
		
	}

}
