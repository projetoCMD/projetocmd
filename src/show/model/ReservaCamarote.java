package show.model;

public abstract class ReservaCamarote {
	
	private String nome;
	private float saldo;
	private int tipo;
	
	public ReservaCamarote(String nome, float saldo, int tipo) {
		this.nome = nome;
		this.saldo = saldo;
		this.tipo = tipo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
		
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void visualizar() {
		String tipo = "";
		switch(this.tipo) {
		
		
		case 1 -> tipo = "Reserva Camarote (Especial)";
		case 2 -> tipo = "Reserva Camarote (Mast)";
		
	}	
		
		
	System.out.println("#######################");	
	System.out.println("   RESERVA CAMAROTE    ");	
	System.out.println("#######################");	
	System.out.println("Nome: " + this.nome);			
	System.out.println("Saldo Disponivel: " + this.saldo);			
	System.out.println("Espaço do Camorete Escolhido: " + this.tipo);	
	
   }
}
