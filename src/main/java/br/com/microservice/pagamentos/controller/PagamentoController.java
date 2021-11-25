package br.com.microservice.pagamentos.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.microservice.pagamentos.constantes.RabbitmqConstantes;
import br.com.microservice.pagamentos.dto.PagamentoDTO;
import br.com.microservice.pagamentos.service.RabbitmqService;

@RestController
public class PagamentoController {

	@Autowired private RabbitmqService rabbitmqService;
	
	
	@PutMapping("/pagamento")
	public ResponseEntity<String> pagamentoPut(@RequestBody PagamentoDTO pagamento) throws IOException{
		Gson gson = new Gson();		
		this.rabbitmqService.enviaMensagem(RabbitmqConstantes.FILA_PAGAMENTO, gson.toJson(pagamento));
		return new ResponseEntity<>("Pagamento realizado com sucesso", HttpStatus.OK);
		
	}
}