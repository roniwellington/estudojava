

public class CodigoAlunoAlura {
    public static void main(String[] args) {
		/*Em uma loja de celular, foram vendidos 300 unidades do celular "Samsung J8" e 180 unidades do celular "Moto G Prime".
		 * Sendo que destas vendas , foram subtraidas os descontos em cada unidade contendo o valor de 50,00 do valor total de 800,00
		 *  do Samsung e 750,00 do Moto G modelos de celular. Quanto a loja lucrou no total?*/
		
		String samsung = "Samsung J8";
		String moto = "Moto G Prime";
		
		int unidadesVendidasSamsung = 300;
		int unidadesVendidasMotoG = 180;
		float faturamentoSamsung = (300 * 800) - 50 * 300;
		float faturamentoMotoG = (180 * 750) - 50 * 180;
		float lucro = faturamentoSamsung + faturamentoMotoG;
		
		System.out.println("A loja lucrou no total de R$ " + lucro);
	}
}
