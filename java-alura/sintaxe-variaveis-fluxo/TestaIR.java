
public class TestaIR {
    public static void main(String[] args) {
		
		double salario = 3300.0;
		
		if(salario < 2600.0) {
			System.out.println("A aliquota e de 15%");
			System.out.println("Voce pode deduzir até R$ 350");
			
		}
		if(salario < 3750.0) {
			System.out.println("A sua aliquota e de 15%");
			System.out.println("Voce pode deduzir R$ 636");
		}
	}
}
