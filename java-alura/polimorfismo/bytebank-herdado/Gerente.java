public class Gerente extends Funcionario {

    private int senha;
    
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;

        } else {
            return false;
        }
    }
    
    /**
     * @return
     */
    public double getBonificacao() {
        System.out.println("Chamado o método de bonificacao do GERENTE");
        return super.getBonificacao() + super.getSalario();
    }
    
    

}
