package entity.pessoa;

import java.util.ArrayList;
import java.util.List;

import entity.veiculo.Carro;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String senha;
    private List<Carro> carros = new ArrayList<>();

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

    public String getSenha() {
        return this.senha;
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

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarro(Carro carro) {
		this.carros.add(carro);
	}

}
