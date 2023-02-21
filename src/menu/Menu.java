package menu;

import java.util.Scanner;

import util.CoresUtil;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;

		//Instancia 2 objetos utilizando o método construtor da classe Cadastro
		Cadastro cad1 = new Cadastro("Vinicius", "123abc", 19041996, "123.456.789-10", "Masculino", 11912345678l);
		Cadastro cad2 = new Cadastro("Samuel", "2233sn", 20052000, "222.333.444-08", "Masculino", 11987654321l);
		
		// Visualiza os dados cadastrados para os 2 objetos
		cad1.visualizar();
		cad2.visualizar();
		
		// Exemplo utilizando os métodos get da classe Cadastro
		System.out.println(" ");
		System.out.println("Dados pelos GETS da classe Cadastro");
		System.out.println(cad1.getNome());
		System.out.println(cad1.getSenha());
		System.out.println(cad1.getDataNascimento());
		System.out.println(cad1.getCpf());
		System.out.println(cad1.getSexo());
		System.out.println(cad1.getTel());
		System.out.println(" ");

		// Exemplo utilizando os métodos set da classe Cadastro
		cad1.setNome("Vinicius Prazeres");
		cad1.setSenha("abc123");
		cad1.setDataNascimento(15011998);
		cad1.setCpf("111.222.333-01");
		cad1.setSexo("Feminino");
		cad1.setTel(1222335566);
		
		// Visualiza os dados do objeto após alterados
		cad1.visualizar();
				
				
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
