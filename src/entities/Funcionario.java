package entities;

public class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected Double salario;
	protected String senha;
	
	public Funcionario() {
		
	}
	
	public Double getBonificacao() {
		return salario * 0.1;
	}	
}
