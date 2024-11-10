package Conta;

public class ContaBancaria {

	protected Banco banco;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	protected Pessoa correntista;
	
	public ContaBancaria() {
		banco = new Banco();
		correntista = new Pessoa();
	}
	
	public Banco getBanco() {
		return banco;
	}
	
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Pessoa getCorrentista() {
		return correntista;
	}
	
	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}

	public boolean deposito(double valor) {
		saldo += valor;
		return true;
	}
	
	public boolean saque(double valor) {
		saldo -= valor;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroDaConta=");
		builder.append(numeroDaConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append("]");
		return builder.toString();
	}
	
}
