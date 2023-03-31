
public class TesteCondicional {
    public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 17;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("voce esta acompanhado");
				System.out.println("pode entrar");
			} else {
				System.out.println("voce e de menor");
				System.out.println("voce so pode entrar acompanhado");
			}
			
		}

	}
}
