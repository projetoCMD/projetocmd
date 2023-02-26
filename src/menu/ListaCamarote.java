package menu;

public class ListaCamarote {
	
	private boolean disponibildade;
	private String nomeAgenda;
<<<<<<< Updated upstream:src/menu/ListaCamarote.java
	private String pacote;
	
	
	public ListaCamarote(boolean disponibildade, String nomeAgenda, String pacote) {
=======
	private int pacote;
	private int espacoCamarote;

	public ListaCamarote(boolean disponibildade, String nomeAgenda, int pacote, int espacoCamarote) {
>>>>>>> Stashed changes:src/show/model/ListaCamarote.java
		this.disponibildade = disponibildade;
		this.nomeAgenda = nomeAgenda;
		this.pacote = pacote;
		this.espacoCamarote = espacoCamarote;
	}

	public String getPacote() {
		return pacote;
	}

	public void setPacote(String pacote) {
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

	
	public int getEspacoCamarote() {
		return espacoCamarote;
	}

	public void setEspacoCamarote(int espacoCamarote) {
		this.espacoCamarote = espacoCamarote;
	}

	public void visualizar() {

		String disponibilidade = "";

		if (this.disponibildade == true)
			disponibilidade = "Disponível";
		else
			disponibilidade = "Reservado";

		String tipo = "";

		switch (this.espacoCamarote) {
			case 1 -> tipo = "Reserva Camarote (Especial)";
			case 2 -> tipo = "Reserva Camarote (Tradional)";
		}

		System.out.println("#######################");
		System.out.println("   RESERVA CAMAROTE    ");
		System.out.println("#######################");
		System.out.println("Nome: " + this.nomeAgenda);
		System.out.println("Tipo de Reserva Camarote: " + tipo);
		System.out.println("Escolha o numero do camarote: " + this.espacoCamarote);
		System.out.println("Status: " + disponibilidade);
<<<<<<< Updated upstream:src/menu/ListaCamarote.java
		System.out.println("Pessoa que agendou: " + this.nomeAgenda);
		System.out.println("Pacote: " + this.pacote);
=======

>>>>>>> Stashed changes:src/show/model/ListaCamarote.java
	}
	

}