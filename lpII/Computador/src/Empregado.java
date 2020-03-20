
import java.util.Scanner;


public class Empregado {
    
    private String nome;
    private Computador pc;
    Scanner s = new Scanner(System.in);
    
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
    
    public void setPc(int memoria, int hd, String processador){      
        
    }
    private static Computador comprar(){
        System.out.println("Memória: ");
        int memoria = s.nextInt();
        
        System.out.println("HD: ");
        int hd = s.nextInt();
        
        System.out.println("Processador: ");
        String processador = s.next();
        return null;
                
    }
    
    public static void transferir(Empregado e1, Empregado e2){
        e1 = e1.comprar;
        e2 = e2.comprar;

    }
    
    public void transferir(Empregado e){
        System.out.println("O computador de "+ e + "foi transferido para " + e);
    }
    
    public void troca(Empregado e1, Empregado e2){
        System.out.println( e1 + "e" + e2 + "tiveram os computadores trocados.");
    }
    
    
    
    
    
}
