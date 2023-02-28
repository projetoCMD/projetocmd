package show.model;

public class CadastroHomem extends Cadastro {
	
	public CadastroHomem(String nome, String senha, String cpf, int tipoSexo, String telefone, String dataNascimento,
			String email) {
		super(nome, senha, cpf, tipoSexo, telefone, dataNascimento, email);
	}
	
	public void visualizar() {
		super.visualizar();
	}

}
