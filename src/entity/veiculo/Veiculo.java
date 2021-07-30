package entity.veiculo;

public class Veiculo {

    private TipoDeVeiculo tipo;
    private Especificacao especificacao = new Especificacao(); 

    public Veiculo( TipoDeVeiculo tipo, String modelo, String cor, String fabricante) {
		super();
		this.tipo = tipo;
		this.especificacao.setModelo(modelo);
		this.especificacao.setCor(cor);
		this.especificacao.setFabricante(fabricante);
	}
    
    public Veiculo() {
    	
    }

	public Veiculo(int id, TipoDeVeiculo tipo, Especificacao especificacao) {
		this.tipo = tipo;
		this.especificacao = especificacao;
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
        return "[ tipo de veiculo: " + this.tipo + ", especificacao: " + especificacao.toString() + " ]";
    }

}




   