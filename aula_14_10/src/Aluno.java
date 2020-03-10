    
public class Aluno {
    private String nome;
    private int cpf;
    private int idade;
    private Curso cursoObj;
    
    public Aluno(String nome, int cpf, int idade, Curso cursoObj){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.cursoObj = cursoObj;
        
    }
   
    public String getNome(){
        return this.nome;  
          
}
    public void setNome(String nome){
        this.nome = nome;
}
    public int getCpf(){
        return this.cpf;
    }
    
    public int setCpf(int cpf){
        return this.cpf = cpf;
    
}
    public int getIdade(){
        return this.idade;
    }
    
    public int setIdade(int idade){
        return this.idade = idade;
                
}
    public Curso getCurso(){
        return this.cursoObj;

}
    public void setCurso(Curso cursoObj){
        this.cursoObj = cursoObj;

}

}




