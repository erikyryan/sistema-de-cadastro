package entity.pessoa;

import java.util.List;

import entity.veiculo.Veiculo;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica() {
    }

    public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString(){
		return " [ id: " + this.getId() + ",cnpj: " + this.getCnpj()+ ", nome: " + this.getNome() + ", senha: "+ this.getSenha() + ", endereco: " + this.getEndereco().toString() + " ] ";
	}

}
