package funcionario;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        Gerente gerente1 = new Gerente("Higor", "000.000.000-00", 5000.00, 854.0);
        Gerente gerente2 = new Gerente("Millena", "000.000.000-01", 6000.00, 855.0);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Joana", "000.000.000-00", 10000.0);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Mari", "000.000.000-00", 8000.0);

        gerente1.Imprimir();
        gerente2.Imprimir();
        desenvolvedor1.Imprimir();
        desenvolvedor2.Imprimir();

        System.out.println(gerente1.getBonificacao());
        System.out.println(gerente2.getBonificacao());
        System.out.println(desenvolvedor1.getBonificacao());
        System.out.println(desenvolvedor2.getBonificacao());

        RepositorioFuncionario array = new RepositorioFuncionario();
        array.inserir(gerente1);
        array.inserir(gerente2);
        array.inserir(desenvolvedor1);
        array.inserir(desenvolvedor2);
        array.inserir(gerente2);

        System.out.println("Digite um número de CPF para consulta: ");
        String cpf = read.next();

        boolean verificar = array.verificar(cpf);
        if (verificar) {
            System.out.println("Este CPF está cadastrado em nosso Sistema: " + cpf);
        } else {
            System.out.println("CPF não cadastrado em nosso Sistema.");
        }
    }

}
