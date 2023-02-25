package show.model;

public class ReservaCamaroteTradional extends ReservaCamarote {

	private float valorDisponivel;
	
	public ReservaCamaroteTradional(String nome, int espacoCamorete, String alimento, String bebida,
			String escolherMusica) {
		super(nome, espacoCamorete, alimento, bebida, escolherMusica);
		this.valorDisponivel = valorDisponivel;	
	}

	public float getValorDisponivel() {
		return valorDisponivel;
	}

	public void setValorDisponivel(float valorDisponivel) {
		this.valorDisponivel = valorDisponivel;
	}
	
	
	public void visualizar() {
		super.visualizar();
		System.out.println("-> VOUCHER NO VALOR: " + this.valorDisponivel);
		System.out.println("• Curtir o show bem próximo do palco;");
		System.out.println("• Bebidas vodka, whisky e gin importados, suco, refrigerante e água.");

		
	}
	
}
