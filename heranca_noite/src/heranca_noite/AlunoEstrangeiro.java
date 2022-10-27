package heranca_noite;

public class AlunoEstrangeiro extends Aluno {
	
	public static final int TAXA_ESTRANGEIRO = 4;

	public AlunoEstrangeiro(String nome, int idade, double cra) {
		super(nome, idade, cra);
	}

	@Override
	public double calculaCRA() {
		return getCra() * TAXA_ESTRANGEIRO;
	}

}
