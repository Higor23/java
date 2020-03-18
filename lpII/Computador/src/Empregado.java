
public class Empregado {
    
    private String nome;
    private Computador pc;
    
    public Empregado(String nome, Computador pc){
        this.nome = nome;
        this.pc = pc;
    }
    
    public Empregado(String nome, int memoria, int hd, String processador){
        this.nome = nome;

    }
    public String getNome(){
        return nome; 
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Computador getPc(){
        return pc;
    }
    
    public void setPc(Computador pc){
        this.pc = pc;
    }
    
    //como fazer sem herança?
    public void setPc(int memoria, int hd, String processador){
        
    }
    
    
}
