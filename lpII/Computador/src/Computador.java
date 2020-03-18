
public class Computador {
    private int memoria;
    private int hd;
    private String processador;
    
    public Computador(int memoria, int hd, String processador){
        this.memoria = memoria;
        this.hd = hd;
        this.processador = processador;
    }
    
    public int getMemoria(){
        return memoria;
    }
    
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
    
    public int getHd(){
        return hd;
    }
    
    public void setHd(int hd){
        this.hd = hd;
    }
    
    public String getProcessador(){
        return processador;
    }
    
    public void setProcessador(String processador){
        this.processador = processador;
    }
    
    public void Imprimir(int memoria, int hd, String processador){
        //System.out.println(processador + "HD " + hd + " GB " + memoria + " GB de RAM." );
    }
    
}
