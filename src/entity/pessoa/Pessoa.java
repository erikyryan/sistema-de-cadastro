package entity.pessoa;

import java.util.ArrayList;
import java.util.List;

import entity.veiculo.Veiculo;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String senha;
    private Endereco endereco = new Endereco();
    private List<Veiculo> veiculos = new ArrayList<>();

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
    	
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public List<Veiculo> getVeiculos() {
        return this.veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
