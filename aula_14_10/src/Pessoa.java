
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    public Pessoa(){
        this.nome = null;
        this.idade = 0;
        this.altura = 0.0;
    }
    
    public String getNome(){
        return this.nome;   
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
