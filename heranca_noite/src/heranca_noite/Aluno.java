package heranca_noite;

import java.util.Objects;

public abstract class Aluno {

	protected String nome;
	protected int idade;
	protected double cra;

	public Aluno(String nome, int idade, double cra) {
		this.nome = nome;
		this.idade = idade;
		this.cra = cra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getCra() {
		return cra;
	}

	public void setCra(double cra) {
		this.cra = cra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return idade == other.idade && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", cra=" + cra + "]";
	}

	// metodo abstrato
	public abstract double calculaCRA();

}
