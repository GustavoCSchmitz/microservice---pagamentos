package br.com.microservice.pagamentos.dto;

public class PagamentoDTO {

	private CarteiraDTO carteira;
	private Double valor;
	private Integer codigo;
	
	public CarteiraDTO getCarteira() {
		return carteira;
	}
	public void setCarteira(CarteiraDTO carteira) {
		this.carteira = carteira;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}	
	
}
