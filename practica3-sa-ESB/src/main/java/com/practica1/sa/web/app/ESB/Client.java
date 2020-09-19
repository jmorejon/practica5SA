package com.practica1.sa.web.app.ESB;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Client {
	private static final String GET_PEDIDO_API = "http://localhost:8090/pedido/{idCliente}/{menu}";
	private static final String GET_ESTADO_API = "http://localhost:8090/estado/{pedido}";
	private static final String GET_REPARTIDOR_API = "http://localhost:8090/repartidor/{pedido}";
	RestTemplate restTemplate = new RestTemplate();
	public String callGetPedidoAPI(String idCliente, String menu) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>("parameters",headers);
		ResponseEntity<String> result = restTemplate.exchange(GET_PEDIDO_API, HttpMethod.GET, entity, String.class);
		return result.toString();
	}
	public String callGetEstadoAPI(String pedido) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>("parameters",headers);
		ResponseEntity<String> result = restTemplate.exchange(GET_ESTADO_API, HttpMethod.GET, entity, String.class);
		return result.toString();
	}
	
	public String callGetRepartidorAPI(String pedido) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>("parameters",headers);
		ResponseEntity<String> result = restTemplate.exchange(GET_REPARTIDOR_API, HttpMethod.GET, entity, String.class);
		return result.toString();
	}
}
