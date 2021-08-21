package entity.pessoa;

import java.util.List;

import entity.veiculo.Veiculo;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
	private String senha;
	

	public PessoaJuridica() {
	}

	public PessoaJuridica(String cnpj, String senha) {
		this.cnpj = cnpj;
		this.senha = senha;
	}

	public PessoaJuridica(Integer chave, String nome, String cnpj, String senha, Endereco endereco) {
		this.setId(chave);
		this.setNome(nome);
		this.cnpj = cnpj;
		this.senha = senha;
		setEndereco(endereco);
	}


	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public PessoaJuridica cnpj(String cnpj) {
		setCnpj(cnpj);
		return this;
	}

	public PessoaJuridica senha(String senha) {
		setSenha(senha);
		return this;
	}


	@Override
	public String toString(){
		return " [ id: " + this.getId() + ",cnpj: " + this.getCnpj()+ ", nome: " + this.getNome() + ", senha: "
	+ this.getSenha() + ", endereco: " + this.getEndereco().toString() + " ] ";
	}

}
