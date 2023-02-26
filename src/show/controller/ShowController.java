package show.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import repository.ShowRepository;
import show.model.Cadastro;
import show.model.ListaCamarote;
import show.model.ReservaCamarote;
import show.model.ReservaCamaroteEspecial;
import show.model.ReservaCamaroteTradicional;

public class ShowController implements ShowRepository {

	Scanner leia = new Scanner(System.in);

	private ArrayList<ReservaCamarote> listaReserva = new ArrayList<ReservaCamarote>();
	private ArrayList<Cadastro> cadastrarUsuario = new ArrayList<Cadastro>();
	

	char continuar;
	char confirmar;
	int numCam, pacote;
	int num;
	String nomePacote;

	@Override
	public void listarTodas() {
		for (var reserva : listaReserva)
			reserva.visualizar();
		// Listar a reserva para o usuário

	}

	@Override
	public void cadastrar(Cadastro cadastro) {

		cadastrarUsuario.add(cadastro);
		System.out.println("Cadastro Realizado com Sucesso.");

	}

	@Override
	public void criarCamarotesTradicionais() {

		for (int i = 0; i < 3; i++) {
			listaReserva.add(new ReservaCamaroteTradicional(true, "", (i + 1), 1, 0));
		}
	}

	@Override
	public void criarCamarotesEspeciais() {
		for (int i = 0; i < 3; i++) {
			listaReserva.add(new ReservaCamaroteEspecial(true, "", (i + 1), 2, false));
		}
	}

	@Override
	public void agendarCamarote(String nomeAgenda) {
		
		do {
				
				do {
					System.out.println("\nDigite tipo de Camarote:");
					
					try {
						pacote = leia.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("\nDigite valores inteiros!");
						leia.nextLine();
						pacote = 0;
						continue;
					}

					// Se o número for menor que 1 ou maiior que 4, recomeça o loop
					if (pacote < 1 || pacote > 2)
						System.out.println("Digite um número entre 1 e 2!");

				} while (pacote < 1 || pacote > 2);
				
				if(pacote == 1)
					nomePacote = "Tradicional";
				else
					nomePacote = "Especial";
				
				
				//Caso a entrada não seja um inteiro, cria uma "exceção" a esse erro e recomeça esse loop
				for(var reserva : listaReserva) {
				
					if(reserva.getTipoPacote() == pacote) {		
						if(reserva.isDisponibildade() == true)
							System.out.println("Camarote " + nomePacote + " " + reserva.getEspacoCamarote() + " Disponível");
						else
							System.out.println("Camarote " + nomePacote + " " + reserva.getEspacoCamarote() + " Reservado");
					}
				}
				
				do {
					System.out.println("\nDigite número do Camarote:");
					
					try {
						numCam = leia.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("\nDigite valores inteiros!");
						leia.nextLine();
						numCam = 0;
						continue;
					}

					// Se o número for menor que 1 ou maiior que 4, recomeça o loop
					if (numCam < 1 || numCam > 3)
						System.out.println("Digite um número entre 1 e 3!");

				} while (numCam< 1 || numCam > 3);
				
				
				for(var reserva : listaReserva) {
					
					if(reserva.getTipoPacote() == pacote) {		
						//System.out.println(reserva.getTipoPacote());
						if(reserva.getEspacoCamarote() == numCam) {
							
							if(reserva.isDisponibildade() == false) {
								
								System.out.println("\nCamarote reservado. Favor escolher outro");
								System.out.println("\nContinuar? (S/N)\n");
								continuar = leia.next().charAt(0);
								if(continuar == 'n' || continuar == 'N') {
									leia.close();
									System.exit(0);									
								}
							}
							
							var buscarReserva = buscarNaCollection(numCam, pacote);
							
							
							if(pacote == 1) {
								reserva = listaReserva.set(listaReserva.indexOf(buscarReserva), new ReservaCamaroteTradicional (false, nomeAgenda, numCam, pacote, 100.0f));
								reserva.visualizar();}
							else
								reserva = listaReserva.set(listaReserva.indexOf(buscarReserva), new ReservaCamaroteEspecial (false, nomeAgenda, numCam, pacote, true));
							System.out.println(reserva.getNome());
							System.out.println(reserva.getTipoPacote());
							System.out.println(reserva.getEspacoCamarote());
						}
					}
				}
					
			
			System.out.println("\nConfirmar agendamento? (S/N)\n");
			confirmar = leia.next().charAt(0);
			
		} while(confirmar == 'n' || confirmar == 'N');
		
		
	}
	
	@Override
	public void conferirAgendamento(String nome) {
        var buscarReserva = buscarResNaCollection(nome);
		
		if (buscarReserva != null) {
			
			buscarReserva.visualizar();
		
		}else
			System.out.println("\nA Reserva não foi encontrada!");
        
    }
	
	@Override
	public void cancelarReserva(String nome) {
        var buscarReserva = buscarResNaCollection(nome);
		
		if (buscarReserva != null) {
			
			if(buscarReserva.getTipoPacote() == 1)
				listaReserva.set(listaReserva.indexOf(buscarReserva), new ReservaCamaroteTradicional(true, "", buscarReserva.getEspacoCamarote(), 1, 0));
			else
				listaReserva.set(listaReserva.indexOf(buscarReserva), new ReservaCamaroteEspecial(true, "", buscarReserva.getEspacoCamarote(), 2, false));	
		}else
			System.out.println("\nA Reserva não foi encontrada!");
        
    }

	public void login() {

		// Logar no sisitema apenas quando já cadastrado

	}
	
	public ReservaCamarote buscarNaCollection(int numCam, int pacote) {
		for (var reserva : listaReserva) {
			if ((reserva.getEspacoCamarote() == numCam) && (reserva.getTipoPacote() == pacote)) {
				return reserva;
			}
		}
		
		return null;
	}
	
	public ReservaCamarote buscarResNaCollection(String nome) {
		for (var reserva : listaReserva) {
			if ((reserva.getNome().contains(nome))) {
				return reserva;
			}
		}
		
		return null;
	}

}
