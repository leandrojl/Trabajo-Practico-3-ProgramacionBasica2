package ar.com.unlam.banco.clases;

import java.util.HashSet;

public class Banco {
	
	
	String nombreBanco;
	HashSet<Cuenta> cuentas = new HashSet<>();
	HashSet<Cliente> clientes = new HashSet<>();
	
	public Banco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public HashSet getCuentas() {
		return cuentas;
	}

	public void setCuentas(HashSet cuentas) {
		this.cuentas = cuentas;
	}

	public void agregarCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
		
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
		
	}

	public HashSet<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(HashSet<Cliente> clientes) {
		this.clientes = clientes;
	}

	
	
	
	
	

}
