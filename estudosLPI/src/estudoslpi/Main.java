
package estudoslpi;

public class Main {
    public static void main(String[] args) {
        conta x = new conta();
        x.setSaldo(350);
        x.creditar(20);
        System.out.println(x.getSaldo());
        
        
        conta y = new conta();
        y.setSaldo(x.getSaldo());
        y.creditar(x.getSaldo());
       
        //System.out.println(y.getSaldo());
        //System.out.println(x);
        //System.out.println(y);
        
        
    }
    
}
