package com.practica1.sa.web.app.REST;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/repartidor")
public class Repartidor {
	
	
	@RequestMapping(value="pedido/{idCliente}/{menu}",method=RequestMethod.GET)
	public String getPedido(@PathVariable ("idCliente")int idCliente,@PathVariable("menu") String menu) {
		return "Pedido numero #123";
	}
	
	@RequestMapping(value="estado/{pedido}",method=RequestMethod.GET)
	public String getEstado(@PathVariable ("pedido")int pedido) {
		return "Saliendo del horno";
	}
	
	@RequestMapping(value="repartidor/{pedido}",method=RequestMethod.GET)
	public String getRepartidor(@PathVariable ("pedido")int pedido) {
		return "Aun sin salir";
	}
}
