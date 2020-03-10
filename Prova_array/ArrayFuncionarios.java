package Prova_array;
public class ArrayFuncionarios{
    private ArrayFuncionariosData data = new ArrayFuncionariosData();

	public ArrayFuncionarios(){
        this.data.indice =0;
        data.array = new Funcionario[4];
    }
   
    public void inserir(Funcionario p){
    if(data.indice<4){
    data.array[data.indice]=p;
    data.indice++;
    } else{
        System.out.println("A lista de funcionários está Lotada");
        }
    }
    public void imprimir(){
    for(int i=0; i<data.indice; i++){
        data.array[i].imprimir();
        }
    }
    
    public boolean verificar(String f) {
        boolean result = false;
        String cpf;
        try{
        for(int i = 0; i < 4;i++){
            cpf=data.array[i].cpf;
            if(f.equalsIgnoreCase(cpf)) {
                result=true;
                System.out.println(data.array[i].nome);
            }
        }
        }catch(Exception e){
                System.out.println("CPF não cadastrado.");
            result=false;
            }
            return result;
    }
}