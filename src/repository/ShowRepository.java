package repository;

import show.model.Cadastro;

public interface ShowRepository {
	
	public void listarTodas();
	public void cadastrar(Cadastro cadastro);
	public void criarCamarotesTradicionais();
	public void criarCamarotesEspeciais();
	public void agendarCamarote(String nomeAgenda);
	public void conferirAgendamento(String nome);
	public void cancelarReserva(String nome);
}
