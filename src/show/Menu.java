package show;

import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import show.controller.ShowController;
import show.model.Cadastro;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ShowController cliente = new ShowController();
		
		Cadastro c1 = new Cadastro(1, "Brian Schneider de Lima", "R1p4rT3ex", "123.456.789-01", "Masculino", "(11)98765-4321", LocalDate.of(1994, 10, 6), "brian@generation.com");
		Cadastro c2 = new Cadastro(2, "Vinicius Prazeres", "E#30y0@*", "987.654.321-10", "Masculino", "(11)91234-5678", LocalDate.of(1995, 5, 13), "vprazeres@generation.com");
		Cadastro c3 = new Cadastro(3, "Erica Araújo da silva Oliveira", "m5R&8t5h", "444.333.55-22", "Feminino", "(11)98237-4765", LocalDate.of(1997, 8, 24), "ericaraujo@generation.com");
		Cadastro c4 = new Cadastro(4, "Jennifer Cruz", "%0p%L52%", "842.632.919-87", "Feminino", "(11)98888-7777", LocalDate.of(1997, 11, 16), "jennifercruz@generation.com");
		
		cliente.cadastrar(c1);
		cliente.cadastrar(c2);
		cliente.cadastrar(c3);
		cliente.cadastrar(c4);
		
		cliente.criarCamarotes(4);
		
		int opcao, numCam, pacote;
		
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
			System.out.println("			4- cliente(PACOTE)									 ");
			System.out.println("			5- APAGAR cliente									 ");
			System.out.println("			6- CONSULTAR cliente								 ");			
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
				leia.skip("\\R?");
				email = leia.nextLine();
				
				System.out.println("Informe sua senha: ");
				senha = leia.nextLine();
				
				keyPress();
				break;
			case 3:
				System.out.println("cliente(Pacote)\n\n");

				break;
			case 4:
				System.out.println("Pedido\n\n");

				break;
			case 5:
				System.out.println("Camarote\n\n");
				
				System.out.println("Digite nome dono camarote:");
				leia.skip("\\R?");
				nome = leia.nextLine();
				
				do {
					System.out.println("\nDigite numero camarote:");
					
					//Caso a entrada não seja um inteiro, cria uma "exceção" a esse erro e recomeça esse loop
					try {
						numCam = leia.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("\nDigite valores inteiros!");
						leia.nextLine();
						numCam = 0;
						continue;
					}
					
					//Se o número for menor que 1 ou maiior que 4, recomeça o loop
					if(numCam < 1 || numCam > 4)
						System.out.println("Digite um número entre 1 e 4!");
					
				} while(numCam < 1 || numCam > 4);
				
				System.out.println("\nDigite numero camarote:");
				pacote = leia.nextInt();
				
				cliente.agendarCamarote(nome, numCam, pacote);
				
				
				break;
			case 6:
				System.out.println("Consultar cliente\n\n");
				cliente.listarTodas();
				
				
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

	
