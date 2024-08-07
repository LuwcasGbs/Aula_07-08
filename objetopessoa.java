package aula0708;

public class objetopessoa {

	public static void main(String[] args) {
		pessoa pessoa1 = new pessoa();
		pessoa pessoa2 = new pessoa();

		pessoa1.setNome("Hanni");
		pessoa1.setIdade(19);
		pessoa1.setEndereco("Seul, Coreia do Sul");
		pessoa1.setProfissao("Idol");
		pessoa1.setRg(123456);
		pessoa1.setCpf(654321);

		pessoa2.setNome("Olivia Rodrigo");
		pessoa2.setIdade(21);
		pessoa2.setEndereco("Califórnia, EUA");
		pessoa2.setProfissao("Cantora");
		pessoa2.setRg(123456);
		pessoa2.setCpf(654321);

		System.out.println("---------OBJETO 1---------");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());

		System.out.println("---------OBJETO 2---------");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
	}

}
