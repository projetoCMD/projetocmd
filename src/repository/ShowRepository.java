package repository;

import show.model.Cadastro;

public interface ShowRepository {
	
	public void listarTodas();
	public void cadastrar(Cadastro cadastro);
	public void criarCamarotesTradicionais();
	public void criarCamarotesEspeciais();
	public boolean agendarCamarote(String nomeAgenda, int pacote);
	public void conferirAgendamento(String nome, int pacote, int numAgenda);
	public void cancelarReserva(String nome, int numCam, int pacote);

	
	void procurarPorEmail(String email);
	public Cadastro retornaLogado(String email, String senha);
	


	
}
