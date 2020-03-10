

package funcionario;


public class Desenvolvedor extends Funcionario{
    
    public Desenvolvedor(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }
    @Override
      public double getBonificacao(){
        double bonificacao = salario*0.15;
        return  bonificacao;
    }
      public void Imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: " + salario + "\n");
        
    }

}
