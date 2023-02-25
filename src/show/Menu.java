package show;

import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import show.controller.ShowController;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ShowController reserva = new ShowController();
		
		int opcao;
		
		long id;
		String nome, senha, cpf, sexo, telefone, email;
		LocalDate dataNascimento;
		

		while (true) {

			System.out.println("#################################################################");
			System.out.println("#################################################################");
			System.out.println("																 ");
			System.out.println("																 ");
			System.out.println("				MENU 											 ");
			System.out.println("																 ");
			System.out.println("																 ");
			System.out.println("#################################################################");
			System.out.println("#################################################################");
			System.out.println("			1- CADASTRO											 ");
			System.out.println("			2- LOGIN											 ");
			System.out.println("			3- VISUALIZAR CADASTRO								 ");
			System.out.println("			4- RESERVA(PACOTE)									 ");
			System.out.println("			5- APAGAR RESERVA									 ");
			System.out.println("			6- CONSULTAR RESERVA								 ");			
			System.out.println(" 			0- SAIR						                     	 ");
			System.out.println("#################################################################");
			System.out.println("#################################################################");
			System.out.println("Entre com a opção desejada:      								 ");
			System.out.println("			  													 ");

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Digite valores inteiros de 0 a 6! ");
				leia.nextLine();
				opcao = 0;
				
			}

			if (opcao == 0) {

				System.out.println("#####################################################################");
				System.out.println("\n  		CMD - RELIZAMOS OS SEUS SONHOS						 	 ");
				System.out.println("\n			TENHA UM OTIMO DIA! 									 ");
				System.out.println("#####################################################################");
				leia.close();
				System.exit(0);

			}
			switch (opcao) {
			case 1:
				System.out.println("Cadastro \n\n");
				
		        System.out.println("Realizando cadastro...");
		        System.out.println("Digite o Email:");
//		        String email = leia.nextLine();
		        System.out.println("Digite a senha:");
//		        String senha = leia.nextLine();		
				
				
		        keyPress();
				break;
			case 2:
				System.out.println("Login \n\n");
				System.out.println("Informe seu email: ");
				
				
				System.out.println("Informe sua senha: ");
				

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
			case 6:
				System.out.println("Consultar Reserva\n\n");
				reserva.listarTodas();
				
				
				break;
			default:
				System.out.println("\nSaindo do sistema!\n Muito Obrigado!");
				break;
			}

		}
		
	}	
	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}

	
