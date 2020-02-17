package entities;

public class Gerente extends Funcionario{

	@Override
	public Double getBonificacao() {
		return salario;
	}
}
