package show.model;

public class ReservaCamaroteEspecial extends ReservaCamarote{
	
	private int acessoVip;

	public ReservaCamaroteEspecial(String nome, int espacoCamorete, String alimento, String bebida,
			String escolherMusica) {
		super(nome, espacoCamorete, alimento, bebida, escolherMusica);
		this.acessoVip = acessoVip;
	}

	public int getAcessoVip() {
		return acessoVip;
	}

	public void setAcessoVip(int acessoVip) {
		this.acessoVip = acessoVip;
	}
	
	public void visualizar() {
		super.visualizar();
		//ACESSO AO CARDÁPIO ->Tratativa VIP ou não
		System.out.println("-> ACESSO VIP AO CARDÁPIO");
		System.out.println("• Bebidas e alimentos à vontade;");
		System.out.println("• Localização com vista privilegiada;");
		System.out.println("• Banheiros Exclusivos;");
		System.out.println("• Acesso à balada após o show.");

		
	}
	
}
