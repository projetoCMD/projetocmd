package show;

import java.util.Scanner;

import show.util.CoresUtil;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;

		while (true) {

			System.out.println("#################################################################");
			System.out.println("#################################################################");
			System.out.println("|																|");
			System.out.println("|																|");
			System.out.println("|				MENU 											|");
			System.out.println("|																|");
			System.out.println("|																|");
			System.out.println("#################################################################");
			System.out.println("#################################################################");
			System.out.println("|			1- LOGIN											|");
			System.out.println("|			2- CADASTRO											|");
			System.out.println("|			3- RESERVA(PACOTE)									|");
			System.out.println("|			4- PEDIDO			    							|");
			System.out.println("| 			5- PAGAMENTO     						        	|");			
			System.out.println("| 			6- SAIR						                     	|");
			System.out.println("#################################################################");
			System.out.println("#################################################################");
			System.out.println("|	Para mais informações visite o nosso site					|");
			System.out.println("|			www.CMD.com.br										|");
			System.out.println("#################################################################");
			System.out.println("#################################################################");

			opcao = leia.nextInt();

			if (opcao == 9) {

				System.out.println("#####################################################################");
				System.out.println("\n  		CMD - RELIZAMOS OS SEUS SONHOS						 		");
				System.out.println("\n			TENHA UM OTIMO DIA! 										");
				System.out.println("#######################################################################	");
				leia.close();
				System.exit(0);

			}
			switch (opcao) {
			case 1:
				System.out.println("Login \n\n");

				break;
			case 2:
				System.out.println("Cadastro\n\n");

				break;
			case 3:
				System.out.println("Reserva(Pacote)\n\n");

				break;
			case 4:
				System.out.println("Pedido\n\n");

				break;
			case 5:
				System.out.println("Camarote\n\n");
				
				break;
			default:
				System.out.println("\nSaindo do sistema!\n Muito Obrigado!");
				break;
			}

		}
	}
}