package provas_LPI_1;

public class Funcionario_Main {

	public static void main(String[] args) {
		String matricula = "001";
		int horasTrabalhadas = 160;
		double valorHora = 10;
		int tempo_servico = 5;
		double salario_bruto = horasTrabalhadas*valorHora;
		double ir;
		double inss = (salario_bruto*0.085);
		double adicional;
		double salario_liquido;
		
		
		if(salario_bruto>1500) {
			ir = salario_bruto*0.015;
		}
		else if(salario_bruto > 500 && salario_bruto <= 1500) {
			ir = salario_bruto*0.08;
		}
		else {
			ir = 0;
		}
		
		if(tempo_servico <= 5) {
			adicional = salario_bruto*0.02;
		}
		else if(tempo_servico >=6 && tempo_servico <=15) {
			adicional = salario_bruto * 0.035;
			
		}
		else{
			adicional = salario_bruto * 0.15;
		}
		
		salario_liquido = salario_bruto - inss - ir + adicional;
		
		System.out.println("Matrícula: " + matricula);
		System.out.println("Salário Bruto: " + salario_bruto);
		System.out.println("Total de descontos: " + (ir + inss));
		System.out.println("Adicional: " + adicional);
		System.out.println( "Salário Líquido: " + salario_liquido);
		
	}
	
		

}
