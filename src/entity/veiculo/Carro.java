package entity.veiculo;

public class Carro extends Veiculo {

    @Override
    public String locomocao(){
        return "Sem restricoes de caminhos";
    }

    public Carro() {
    }

    public Carro(int id, Status status, Especificacao especificacao) {
        super.setId(id);
        super.setStatus(status);
        super.setEspecificacao(especificacao);
    }

	@Override
	public String toString() {
		return "Carro [locomocao()=" + locomocao() + ", getId()=" + getId() + ", getEspecificacao()="
				+ getEspecificacao() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
    
    
 
}
