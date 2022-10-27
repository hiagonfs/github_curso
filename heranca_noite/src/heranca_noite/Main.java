package heranca_noite;

import composicao.Pessoa;

public class Main {

	public static void main(String[] args) {

		// instancia
		Aluno a1 = new AlunoEstrangeiro("Hiago", 28, 1);

		Aluno a2 = new AlunoRegular("Hiago2", 28, 1);

		System.out.println(a1.calculaCRA());
		System.out.println(a2.calculaCRA());

		
		// composicao
		Pessoa p1 = new Pessoa("Hiago", 28);
		
		p1.getEndereco().getCep();
		p1.getEndereco().getBairro();

	}

}
