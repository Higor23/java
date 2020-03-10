
public class Main {

    public static void main(String[] args) {
       /* Pessoa x = new Pessoa("Joao", 25, 1.6);
        
        Pessoa y = new Pessoa();
        
        System.out.println(y.getNome());
        y.setNome("Paulo");
        System.out.println(y.getNome());*/
       
       Curso y = new Curso(0012, "BSI");
       System.out.println(y.getNome());
       
        Aluno x = new Aluno("Higor" , 001002 , 18 , y);
        
        System.out.println(x.getNome());
        System.out.println(x.getCurso().getNome());

    }
    
}
