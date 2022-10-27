package heranca_noite;

public class AlunoRegular extends Aluno {

	public static final int TAXA_REGULAR = 2;

	public AlunoRegular(String nome, int idade, double cra) {
		super(nome, idade, cra);
	}

	// Polimorfismo
	@Override
	public double calculaCRA() {
		return getCra() * TAXA_REGULAR;
	}

}
