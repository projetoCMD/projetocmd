package menu;

public class Cadastro {

    private String nome;
    private String senha;
    private int dataNascimento;
    private String cpf;
    private String sexo;
    private long tel;

    public Cadastro(String nome, String senha, int dataNascimento, String cpf, String sexo, long tel) {
        this.nome = nome;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.tel = tel;
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

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
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
        System.out.println("Telefone: " + this.tel);

    }

}
