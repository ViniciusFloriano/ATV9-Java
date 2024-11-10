package Conta;

public class CartaoDeCredito {

	private int numero;
	private String operacao;
	private double limite;
	private String tipoDeCartao;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getOperacao() {
		return operacao;
	}
	
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public String getTipoDeCartao() {
		return tipoDeCartao;
	}
	
	public void setTipoDeCartao(String tipoDeCartao) {
		this.tipoDeCartao = tipoDeCartao;
	}
	
}
