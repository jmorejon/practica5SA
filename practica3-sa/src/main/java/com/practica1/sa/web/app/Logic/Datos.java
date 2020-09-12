package com.practica1.sa.web.app.Logic;



import java.util.ArrayList;
import java.util.List;

import com.practica1.sa.web.app.Entity.*;
public class Datos {
	public List<Cliente> clientes;

	private int contador;
	public Datos() {
		this.contador =0;
		clientes = new ArrayList<>();
		clientes.add(new Cliente(1,"Luisa"));
		clientes.add(new Cliente(2,"Marina"));
		clientes.add(new Cliente(3,"Alba"));
		clientes.add(new Cliente(4,"Liliana"));
		
	}
	
	public int getContadorPedidos() {
		return contador++;
	}
}
