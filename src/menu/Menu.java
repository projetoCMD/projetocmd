package menu;

import java.util.Scanner;

import util.CoresUtil;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
				
				
				while(true) {
					
					System.out.println(CoresUtil.TEXT_BLUE + CoresUtil.ANSI_BLACK_BACKGROUND +"#################################################################");
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
					System.out.println("|			4- CONSULTA SALDO 									|");
					System.out.println("|			5- DEPOSITO											|");
					System.out.println("|			6- TRANFÊNCIA DE VALOR								|");
					System.out.println("|			7- Sair												|");
					System.out.println("#################################################################");
					System.out.println("#################################################################");
					System.out.println("|	Para mais informações visite o nosso site					|");
					System.out.println("|			www.CMD.com.br										|");
					System.out.println("#################################################################");
					System.out.println("#################################################################");
					
					opcao =leia.nextInt();
					
					if(opcao == 9) {
						
						System.out.println(CoresUtil.TEXT_WHITE_BOLD +"#####################################################################");
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
						System.out.println("CAdastro\n\n");

						break;
					case 3:
						System.out.println("RESERVA(PACOTE)\n\n");

						break;
					case 4:
						System.out.println("SALDO DO CLIENTE\n\n");

						break;
					case 5:
						System.out.println(" Fazer Deposito\n\n");

						break;
					
					case 6:
						System.out.println("Transferência de saldo\n\n");

						break;
					default:
						System.out.println("\nSaindo do sistema!\n Muito Obrigado!");
						break;
					}
				}
	}

}
