package aula_40;


public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public Professor(String nome, String endereco, String telefone, String cpf, double salario, String nomeCurso) {
        super(nome, endereco, telefone, cpf);
        this.salario = salario;
        this.nomeCurso = nomeCurso;
    }

     
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }
    
     public String obterEtiquetaEndereco() {
        String s = "Endereço do Professor: ";
        s += this.getEndereco();
        return s;
    }

}
