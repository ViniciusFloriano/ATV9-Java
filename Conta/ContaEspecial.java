package Conta;

public class ContaEspecial extends ContaBancaria {

	private int diasSemJuros;
	private double limite;
	protected CartaoDeCredito cartao;
	
	public ContaEspecial() {
		cartao = new CartaoDeCredito();
	}
	
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	
	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public CartaoDeCredito getCartao() {
		return cartao;
	}
	
	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", cartao=");
		builder.append(cartao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
