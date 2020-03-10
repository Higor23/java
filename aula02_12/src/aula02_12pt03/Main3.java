package aula02_12pt03;

public class Main3 {

    public static void main(String[] args) {
        String frase = null;
        String nova_frase = null;
        try {
            nova_frase = frase.toUpperCase();
        } catch (Exception e) {
            System.out.println("Erro " + e);
            frase = "Frase vazia";
        } finally {
            nova_frase = frase.toLowerCase();
        }
        System.out.println("Frase antiga " + frase);
        System.out.println("Frase alterada " + frase);
    }

}
