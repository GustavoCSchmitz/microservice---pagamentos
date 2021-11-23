package br.com.microservice.pagamentos.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.pagamentos.dto.PagamentoDTO;
import br.com.microservice.pagamentos.service.PagamentoService;

@RestController
public class PagamentoController {

@Autowired private PagamentoService pagamentoService;
	
	@PostMapping("/pagamento")
	public ResponseEntity<String> pagamento(@RequestBody PagamentoDTO pagamento) throws IOException{
		try {
			pagamentoService.pagamento(pagamento);	
			return new ResponseEntity<>("Pagamento realizado com sucesso", HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>("Ocorreu um erro durante a execução do pagamento", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
