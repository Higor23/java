package aula_40;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

//    public Aluno(){
//
//        super();
//    }

    public Aluno(String curso, double[] notas, String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;

    }

    @Override
    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno: ";
        s += this.getEndereco();
        return s;
    }

}
