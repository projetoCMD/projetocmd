package show.model;

public abstract class ReservaCamarote {
	
	private String nome;
	private int espacoCamorete;
	private String alimento;
	private String bebida;
	private String escolherMusica;

	public ReservaCamarote(String nome, int espacoCamorete, String alimento, String bebida, String escolherMusica) {
		this.nome = nome;
		this.espacoCamorete = espacoCamorete;
		this.alimento = alimento;
		this.bebida = bebida;
		this.escolherMusica = escolherMusica;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getEspacoCamorete() {
		return espacoCamorete;
	}

	
	public void setEspacoCamorete(int espacoCamorete) {
		this.espacoCamorete = espacoCamorete;
	}


	public String getAlimento() {
		return alimento;
	}


	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}


	public String getBebida() {
		return bebida;
	}


	public void setBebida(String bebida) {
		this.bebida = bebida;
	}


	public String getEscolherMusica() {
		return escolherMusica;
	}


	public void setEscolherMusica(String escolherMusica) {
		this.escolherMusica = escolherMusica;
	}


	public void visualizar() {
		
		String tipo = "";
		
		switch(this.espacoCamorete) {		
		case 1 -> tipo = "Reserva Camarote (Especial)";
		case 2 -> tipo = "Reserva Camarote (Tradional)";
		
	}	
		
	
	System.out.println("#######################");	
	System.out.println("   RESERVA CAMAROTE    ");	
	System.out.println("#######################");	
	System.out.println("Nome: " + this.nome);			
	System.out.println("Tipo de Reserva Camarote: " + tipo);
	System.out.println("Escolha o numero do camarote: " + this.espacoCamorete);
	System.out.println("Informe o Alimento: " + this.alimento);	
	System.out.println("Qual a Bebida Desejada: " + this.bebida);	
	System.out.println("Esolha uma música para o Show: " + this.bebida);	
	
   }
}
