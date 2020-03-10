
import javax.swing.JOptionPane;


public class Main {

 
    public static void main(String[] args) {
        String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro número: ");
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        JOptionPane.showMessageDialog(null, "Resultado da soma " + (numero1 + numero2));
        
        

    }
    
}
