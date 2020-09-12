package com.practica1.sa.web.app.Entity;

public class Pedido {
	private String pedido;
	private int cliente;
	private int estado;
	public Pedido(String pedido,int cliente, int estado) {
		this.cliente = cliente;
		this.pedido = pedido;
		this.estado = estado;
	}
	public Pedido() {}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
