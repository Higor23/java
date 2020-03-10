package aulas;
public class Gerente extends Funcionario{

//Declarando variavel da classe Gerente
    public double CRM;

//Construtor padrão
    public Gerente(String nome, String cpf, double salario, double CRM) {
        super(nome, cpf, salario);
        this.CRM=CRM;
    }

//Metodos abstratos
    @Override
    public double getBonificacao(){
        return salario*1.2;
    }
    @Override
    public void imprimir(){
        System.out.println("________________________________________");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salario: R$ "+ salario);
        System.out.println("Salário com Bonificação: R$ " + this.getBonificacao());
        System.out.println("----------------------------------------");
    }
}