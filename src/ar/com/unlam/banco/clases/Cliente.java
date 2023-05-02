package ar.com.unlam.banco.clases;

import java.util.HashSet;

public class Cliente {
	
	String nombre;
	String apellido;
	HashSet<Cuenta> cuentas = new HashSet<>();
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, String apellido) {
		this.nombre= nombre;
		this.apellido=apellido;
	}

}
