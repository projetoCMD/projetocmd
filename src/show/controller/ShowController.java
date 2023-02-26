package show.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import show.model.Cadastro;
import show.model.ReservaCamarote;
import show.model.ReservaCamaroteEspecial;
import show.model.ReservaCamaroteTradicional;
import src.repository.ShowRepository;


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
	public boolean agendarCamarote(String nomeAgenda, int pacote) {
		
		
				
			if(pacote == 1) {
				nomePacote = "Tradicional";
				System.out.println("\n\n-> VOUCHER NO VALOR: " + 199.0f);
				System.out.println("• Curtir o show bem próximo do palco;");
				System.out.println("• Bebidas vodka, whisky e gin importados, suco, refrigerante e água.\n");
			}
			else {
				nomePacote = "Especial";
				System.out.println("\n\n-> ACESSO VIP AO CARDÁPIO");
				System.out.println("• Bebidas e alimentos à vontade;");
				System.out.println("• Localização com vista privilegiada;");
				System.out.println("• Banheiros Exclusivos;");
				System.out.println("• Acesso à balada após o show.\n");
			}
			
			//Caso a entrada não seja um inteiro, cria uma "exceção" a esse erro e recomeça esse loop
			for(var reserva : listaReserva) {
			
				if(reserva.getTipoPacote() == pacote) {		
					if(reserva.isDisponibildade() == true)
						System.out.println("Camarote " + nomePacote + " " + reserva.getEspacoCamarote() + " Disponível");
					else
						System.out.println("Camarote " + nomePacote + " " + reserva.getEspacoCamarote() + " Reservado");
				}
			}
				
			System.out.println("\n");
			
			do {
				System.out.println("\nDigite número do Camarote:");
					
				try {
					numCam = leia.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("\nDigite valores inteiros!");
					leia.nextLine();
					numCam = 0;
					continue;					}

				// Se o número for menor que 1 ou maiior que 4, recomeça o loop
				if (numCam < 1 || numCam > 3)
					System.out.println("\nDigite um número entre 1 e 3!");

			} while (numCam< 1 || numCam > 3);
			
			
			if(reservado(numCam, pacote, nomeAgenda) == false) {
				System.out.println("\nCamarote reservado. Favor escolher outro\n");
				System.out.println("\nAgendar outro Camarote? (S/N)\n");
				continuar = leia.next().charAt(0);
				if(continuar == 's' || continuar == 'S')
					return true;
				return false;
				
			}
			
			System.out.println("\nConfirmar agendamento? (S/N)\n");
			confirmar = leia.next().charAt(0);
			if(confirmar == 's' || confirmar == 'S') {
				adicionarReserva(numCam, pacote, nomeAgenda);
				return false;

			}
			return true;
		
		
	}
	
	@Override
	public void conferirAgendamento(String nome, int numCam, int pacote) {
        var buscarReserva = buscarResNaCollection(nome, numCam, pacote);
		
		if (buscarReserva != null) {
			
			buscarReserva.visualizar();
		
		}else
			System.out.println("\nA Reserva não foi encontrada!");
        
    }
	
	@Override
	public void cancelarReserva(String nome, int numCam, int pacote) {
        var buscarReserva = buscarResNaCollection(nome, numCam, pacote);
		
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
	
	public ReservaCamarote buscarResNaCollection(String nome, int numCam, int pacote) {
		for (var reserva : listaReserva) {
			if (reserva.getNome().contains(nome) && reserva.getEspacoCamarote() == numCam && reserva.getTipoPacote() == pacote) {
				return reserva;
			}
		}

		return null;
	}

	private boolean reservado(int numCam, int pacote, String nomeAgenda) {

	
		for (var reserva : listaReserva) {
	
			if (reserva.getTipoPacote() == pacote) {
				// System.out.println(reserva.getTipoPacote());
				if (reserva.getEspacoCamarote() == numCam) {
	
					if (reserva.isDisponibildade() == false)
						return false;
				}
			}
		}
		return true;
	}
	
	private void adicionarReserva(int numCam, int pacote, String nomeAgenda) {
		for (var reserva : listaReserva) {
			var buscarReserva = buscarNaCollection(numCam, pacote);
			
			if (pacote == 1) {
				reserva = listaReserva.set(listaReserva.indexOf(buscarReserva),
						new ReservaCamaroteTradicional(false, nomeAgenda, numCam, pacote, 100.0f));
				reserva.visualizar();
			} else
				reserva = listaReserva.set(listaReserva.indexOf(buscarReserva),
						new ReservaCamaroteEspecial(false, nomeAgenda, numCam, pacote, true));
		}
		
	}
	
}


