package poo01;

import java.util.Scanner;

public class MainFreelas {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		Agencia barman1 = new Agencia();
		System.out.println("Informe o nome do funcionário: ");
		barman1.setNome(dados.next());
		System.out.println("Informe os dias trabalhados no mês: ");
		barman1.setDias(dados.nextInt());
		System.out.println("Informe o valor pago por dia de trabalho R$: ");
		barman1.setValorDia(dados.nextDouble());
		dados.close();
		
		System.out.println();
		
		System.out.println("======== PAGAMENTO FREELANCERS =========\n");
		System.out.printf("Funcionário: %s\n", barman1.getNome());
		System.out.printf("Dias trabalhados no mês: %d\n", barman1.getDias());
		System.out.printf("Valor pago por dia: R$%.2f\n\n", barman1.getValorDia());
		System.out.printf("****************************************\n\n");
		System.out.printf("Total a ser pago para %s: R$%.2f\n\n", barman1.getNome(), barman1.valorFinal());
		System.out.printf("****************************************\n");
		System.out.println("========================================");
	}

}
