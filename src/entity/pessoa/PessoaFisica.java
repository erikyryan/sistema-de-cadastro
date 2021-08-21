package entity.pessoa;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String senha;

	public PessoaFisica() {
	}

	public PessoaFisica(String cpf, String senha) {
		this.cpf = cpf;
		this.senha = senha;
	}

	public PessoaFisica(String chave, String nome, String cpf, String senha,String cidade, String cep, String numero) {
		this.setId(chave);
		this.setNome(nome);
		this.cpf = cpf;
		this.senha = senha;
		setEndereco(cidade,cep,numero);
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString(){
		return " [ id: " + this.getId() + ",cpf: " + this.getCpf() + ", nome: " + this.getNome() + ", senha: "+ this.getSenha() + ", endereco: " + this.getEndereco().toString() + " ] ";
	}
}
