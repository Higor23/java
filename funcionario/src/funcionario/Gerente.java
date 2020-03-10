package funcionario;

public class Gerente extends Funcionario{

    public double crm;

    public Gerente(String nome, String cpf, double salario, double crm) {
        super(nome, cpf, salario);
        this.crm = crm;  
    }
    @Override
    public double getBonificacao(){
        double bonificacao = salario*0.20;
        return  bonificacao;
    }
    public void Imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: " + salario);
        System.out.println("CRM: " + crm + "\n");
        
    }

   

}
