package funcionario;

public class RepositorioFuncionario {

    private Funcionario[] array;
    private int indice;

    public RepositorioFuncionario() {
        this.indice = 0;
        array = new Funcionario[4];
    }

    public void inserir(Funcionario p) {
        if (indice < 4) {
            array[indice] = p;
            indice++;
        } else {
            System.out.println("A lista de funcionários está lotada");
        }
    }

    public void imprimir() {
        for (int i = 0; i < indice; i++) {
            array[i].imprimir();
        }
    }

    public boolean verificar(String f) {
        boolean result = false;
        String cpf;
        try {
            for (int i = 0; i < 4; i++) {
                cpf = array[i].cpf;
                if (f.equalsIgnoreCase(cpf)) {
                    result = true;
                    System.out.println(array[i].nome);
                }
            }
        } catch (Exception e) {
            System.out.println("CPF não cadastrado.");
            result = false;
        }
        return result;
    }
}
