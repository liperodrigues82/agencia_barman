package poo01;

public class Agencia {

	private String nome;
	private int dias;
	private double valorDia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public double getValorDia() {
		return valorDia;
	}
	public void setValorDia(double valorDia) {
		this.valorDia = valorDia;
	}
	
	public double valorFinal() {
		return getDias() * getValorDia();
	}
}
