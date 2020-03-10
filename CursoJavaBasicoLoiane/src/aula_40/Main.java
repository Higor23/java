package aula_40;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(null, null, null, null);
        Pessoa aluno = new Aluno(null, null, null, null, null, null);
        Pessoa professor = new Professor(null, null, null, null, .0, null);

        
        pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");
        
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());         
    }
   
}
