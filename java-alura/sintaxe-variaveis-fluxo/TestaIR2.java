
public class TestaIR2 {
    public static void main(String[] args) {
		
        // De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
        // De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
       // De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636
       
       
       double salario = 3300.0;
       
       if(salario >= 1900.0 && salario <= 2800.0) {
           
           System.out.println("A sua aliquota e de 7,5%");
           System.out.println("Você pode deduzir ate R$ 142");
           
       } else if(salario >= 2800.01 && salario <= 3751.0) {
           
           System.out.println("A sua aliquota e  de 15%");
           System.out.println("Voce pode deduzir ate R$ 350");
           
       } else if(salario >= 3751.01 && salario <= 4664.0) { 
           
           System.out.println("A sua aliquota e de 22.5%");
           System.out.println("Voce pode deduzir ate R$ 636");
           
       }
   }
}
