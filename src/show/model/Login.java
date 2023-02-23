package show.model;

import java.time.LocalDate;

public class Login extends Cadastro {

	private boolean validacao;
	
	public Login(Long id, String nome, String senha, String cpf, String sexo, String telefone, LocalDate dataNascimento,
			String email) {
		super(id, nome, senha, cpf, sexo, telefone, dataNascimento, email);
		
	}
	
}