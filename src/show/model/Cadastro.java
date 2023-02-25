package show.model;

import java.time.LocalDate;

public class Cadastro {
	
	private long id;
    private String nome; 
    private String senha;
    private String cpf;
    private String sexo;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;
    
	public Cadastro(long id, String nome, String senha, String cpf, String sexo, String telefone, LocalDate dataNascimento, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
		this.sexo = sexo;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.email = email;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
    public void visualizar(){

        System.out.println("****************************************");
        System.out.println("   DADOS DE CADASTRO  ");
        System.out.println("****************************************");   
        System.out.println("Nome: " + this.nome);
        System.out.println("Senha: " + this.senha);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
        

    }

}
