package show.model;

public class CadastroOutros extends Cadastro {

	private String declaraGenero;

	public CadastroOutros(String nome, String senha, String cpf, int tipoSexo, String telefone, String dataNascimento,
			String email, String declaraGenero) {
		super(nome, senha, cpf, tipoSexo, telefone, dataNascimento, email);
		this.declaraGenero = declaraGenero;
	}

	public String getDeclaraGenero() {
		return declaraGenero;
	}

	public void setDeclaraGenero(String declaraGenero) {
		this.declaraGenero = declaraGenero;
	}
	

	public void visualizar() {
		super.visualizar();
		 System.out.println("Gênero que se identifica: " + this.declaraGenero);
	}
	

}
