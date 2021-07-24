package entity.pessoa;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String senha;

    public PessoaFisica(int id,String nome, String senha, Status status) {
    	setId(id);
    	setNome(nome);
    	this.senha = senha;
    	setStatus(status);
    }
    
    public PessoaFisica(int id, String nome, String cpf, String senha,Endereco endereco, Status status) {
        this.cpf = cpf;
        this.senha = senha;
        setStatus(status);
        setId(id);
        setNome(nome);
        setEndereco(endereco);
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
