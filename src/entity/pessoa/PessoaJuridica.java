package entity.pessoa;

import java.util.List;
import entity.veiculo.Carro;
import entity.veiculo.Caminhao;

public class PessoaJuridica extends Pessoa{
    private String CNPJ;
    private List<Carro> carros;
    private List<Caminhao> caminhoes;

    public PessoaJuridica() {
    }

    public PessoaJuridica(int id, String nome,String CNPJ, Endereco endereco,Status status) {
        this.CNPJ = CNPJ;
        setId(id);
        setNome(nome);
        setEndereco(endereco);
        setStatus(status);
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
        
    }

    public List<Carro> getCarros() {
        return this.carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public List<Caminhao> getCaminhoes() {
        return this.caminhoes;
    }

    public void setCaminhoes(List<Caminhao> caminhoes) {
        this.caminhoes = caminhoes;
    }
}
