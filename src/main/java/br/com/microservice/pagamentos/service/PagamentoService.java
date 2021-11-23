package br.com.microservice.pagamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.microservice.pagamentos.dto.PagamentoDTO;

@Service
public class PagamentoService {

	@Autowired private RestTemplate client;
	
	public void pagamento(PagamentoDTO pagamento) {
		client.exchange("http://carteira/pagamento",HttpMethod.POST, new HttpEntity<String>(montaJson(pagamento), null), String.class);
		
	}
	
	private String montaJson(PagamentoDTO pagamento) {
		Gson gson = new GsonBuilder().serializeNulls().create();
		return gson.toJson(pagamento);
	}

}
