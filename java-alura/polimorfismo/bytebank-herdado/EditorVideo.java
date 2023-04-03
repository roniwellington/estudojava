
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Editro de Video");
		return super.getBonificacao() + 100;
	}
}
