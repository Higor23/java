
package exemplo_ploi;

public abstract class Animal {
    protected double peso;
    protected int idade;
    protected int membros;
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public Animal(double peso, int idade, int membros){
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }
    
    public void imprimir(){
        System.out.println(peso + " " + idade + " " + membros); 
        
    }
    
}
