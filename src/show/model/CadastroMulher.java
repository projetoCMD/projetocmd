package show.model;

public class CadastroMulher extends Cadastro {
	
	private float taxaDesc;

	public CadastroMulher(String nome, String senha, String cpf, int tipoSexo, String telefone, String dataNascimento,
			String email, float taxaDesc) {
		super(nome, senha, cpf, tipoSexo, telefone, dataNascimento, email);
		this.taxaDesc = taxaDesc;
	}

	public float getTaxaDesc() {
		return taxaDesc;
	}

	public void setTaxaDesc(float taxaDesc) {
		this.taxaDesc = taxaDesc;
	}
	
	public void visualizar() {
		super.visualizar();
	}
	
}
	
	
