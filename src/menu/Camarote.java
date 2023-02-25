package menu;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Camarote {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Parametrizando uma Lista com Objetos do tipo ListaCamarote
		ArrayList<ListaCamarote> camaroteDisp = new ArrayList<ListaCamarote>();
		
		char continuar;
		char confirmar;
		int numCam;
		String nomeAgenda = "";
		String pacote = "";
		
		//Crianco 4 camarotes com Status de disponível (true)
		for(int i = 0; i < 4; i++) {
			camaroteDisp.add(new ListaCamarote(true, "", ""));
		}	
		
		
		do {
			
			//Lista os 4 Camarotes, mostrando quais estão reservado ou não
			for(int i = 0; i < camaroteDisp.size(); i++) {
				ListaCamarote exibirCamarotes = camaroteDisp.get(i);
				if(exibirCamarotes.isDisponibildade() == true)
					System.out.println("Camarote " + (i + 1) + " Disponível");
				else
					System.out.println("Camarote " + (i + 1) + " Reservado");
			}
			
			
			do {
				
				do {
					
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
					
					//Instancia um objeto do tipo ListaCamarotes em fundão de seu Index
					ListaCamarote camaroteSelecionado = camaroteDisp.get(numCam - 1);
					
					//Se o camarote ja estiver reservado (false), reiniciar o loop caso a pessoa queira
					if(camaroteSelecionado.isDisponibildade() == false) {
						
						System.out.println("\nCamarote reservado. Favor escolher outro");
						System.out.println("\nContinuar? (S/N)\n");
						continuar = leia.next().charAt(0);
						if(continuar == 'n' || continuar == 'N') {
							leia.close();
							System.exit(0);
							
						}
					}
				
				} while(camaroteDisp.get(numCam - 1).isDisponibildade() == false);
				
				//Se o camarote selecionado estiver Disponível (true), mudar seu status para Reservado (false)
				camaroteDisp.get(numCam - 1).setDisponibildade(false);
				
				System.out.println("Dono da reserva:");
				leia.skip("\\R?");
				nomeAgenda = leia.nextLine();
				
				System.out.println("Tipo do Pacote: ");
				pacote = leia.nextLine();
				
				//Adicinoar o nome da pessoa que reservou e o pacote que ela selecionou
				camaroteDisp.get(numCam - 1).setNomeAgenda(nomeAgenda);
				camaroteDisp.get(numCam - 1).setPacote(pacote);
				
				System.out.println("\nConfirmar agendamento? (S/N)\n");
				confirmar = leia.next().charAt(0);
				
			} while(confirmar == 'n' || confirmar == 'N');
			
			camaroteDisp.get(numCam - 1).visualizar();
			
			System.out.println("\nContinuar? (S/N)\n");
			continuar = leia.next().charAt(0);
			
		
		} while(continuar != 'n' || continuar != 'N');
		
		leia.close();
		
	}

}