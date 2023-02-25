package show.controller;

import java.util.ArrayList;

import repository.ShowRepository;
import show.model.Cadastro;
import show.model.ReservaCamarote;

public class ShowController implements ShowRepository {
	
	private ArrayList<ReservaCamarote> listaReserva = new ArrayList<ReservaCamarote>();
	private ArrayList<Cadastro> cadastrarUsuario = new ArrayList<Cadastro>();
	
	@Override
	public void listarTodas() {
		for (var reserva : listaReserva)
			reserva.visualizar();
		//Listar a reserva para o usuário
		
	}
	
	public void cadastrar(Cadastro cadastro) {
		
		cadastrarUsuario.add(cadastro);
		System.out.println("Cadastro Realizado com Sucesso.");
		
	}
	
	public void login() {
		//Logar no sisitema apenas quando já cadastrado
		
		
	}
	


}
