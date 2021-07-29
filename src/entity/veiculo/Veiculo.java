package entity.veiculo;

public abstract class Veiculo {

    private int id;
    private TipoDeVeiculo tipo;
    private Especificacao especificacao = new Especificacao(); 

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Especificacao getEspecificacao() {
        return this.especificacao;
    }

    public void setEspecificacao(Especificacao especificacao) {
        this.especificacao = especificacao;
    }

    public TipoDeVeiculo getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoDeVeiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "[ ID: " + this.id + ", tipo de veiculo: " + this.tipo + ", especificacao: " + especificacao.toString() + " ]";
    }

}




   