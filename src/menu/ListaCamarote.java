package menu;

public class ListaCamarote {
	
	private boolean disponibildade;
	private String nomeAgenda;
	private String pacote;
	
	
	public ListaCamarote(boolean disponibildade, String nomeAgenda, String pacote) {
		this.disponibildade = disponibildade;
		this.nomeAgenda = nomeAgenda;
		this.pacote = pacote;
	}
	
	public boolean isDisponibildade() {
		return disponibildade;
	}
	public void setDisponibildade(boolean disponibildade) {
		this.disponibildade = disponibildade;
	}
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public String getPacote() {
		return pacote;
	}

	public void setPacote(String pacote) {
		this.pacote = pacote;
	} 
	
	
	public void visualizar() {
		
		String disponibilidade = "";
		
		if(this.disponibildade == true)
			disponibilidade = "Disponível";
		else
			disponibilidade = "Reservado";
		
		System.out.println("Status: " + disponibilidade);
		System.out.println("Pessoa que agendou: " + this.nomeAgenda);
		System.out.println("Pacote: " + this.pacote);
	}
	

}