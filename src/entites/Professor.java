package entites;

public class Professor extends Pessoa{
	
	private float salario;
	private String formacao;
	
	void ensinar() {
		
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

}
