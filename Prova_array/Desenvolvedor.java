package aulas;
public class Desenvolvedor extends Funcionario{

//Construtor padrão da Classe Desenvolvedor    
    public Desenvolvedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

//Metodos abstratos
    @Override
    public double getBonificacao(){
        return salario*1.15;
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