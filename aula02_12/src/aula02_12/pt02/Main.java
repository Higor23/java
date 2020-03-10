package aula02_12.pt02;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Final do main");
    }

    public static void metodo1() {
        System.out.println("Início do método1");
        try{
            metodo2();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro " + e);
        }
        System.out.println("Final do metodo1");
    }

    public static void metodo2() {
        System.out.println("Início do método 2");
        int[] matriz = new int[10];

        for (int i = 0; i < 15; i++) {
            matriz[i] = i;
            System.out.println(i);
        }

        System.out.println("Fim do método2");
    }

}
