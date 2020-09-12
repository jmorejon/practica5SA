package com.practica1.sa.web.app.rest;

import javax.xml.ws.Response;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practica1.sa.web.app.Entity.Pedido;

@RestController
@RequestMapping("/")
public class RestauranteREST {
	
//	public ResponseEntity<Pedido> getPedido(@PathVariable ("idCliente")int idCliente,@PathVariable("menu") String menu){
//		
//		return ResponseEntity.ok(new Pedido("menu",1,1));
//	}
	@RequestMapping(value="pedido/{idCliente}/{menu}",method=RequestMethod.GET)
	public String getPedido(@PathVariable ("idCliente")int idCliente,@PathVariable("menu") String menu) {
		return "Pedido numero #123";
	}
	
	@RequestMapping(value="estadopedido/{pedido}",method=RequestMethod.GET)
	public String getEstadoPedido(@PathVariable ("pedido")int pedido) {
		return "prerando orden";
	}
	
	@RequestMapping(value="pedidoRepartidor/{pedido}",method=RequestMethod.GET)
	public String getRepartidorPedido(@PathVariable ("pedido")int pedido) {
		return "Aun sin salir";
	}
	
//	@RequestMapping(value="hello",method=RequestMethod.GET)
//	public String hello() {
//		return "hola";
//	}
}
