package entidades;

public class funcionarios implements Comparable<funcionarios> {
	private String nome;
	private Double Salario;
	
	public funcionarios(String nome, Double salario) {
		this.nome = nome;
		Salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	@Override
	public int compareTo(funcionarios outro) {	//Usando o metodo compareTo da interface comparable 
		return -Salario.compareTo(outro.getSalario());	//para comparar os funcionarios pelos seus nomes
	}
	
	
	
	

}
