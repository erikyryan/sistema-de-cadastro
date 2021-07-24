package entity.veiculo;

public class Carro extends Veiculo {

    @Override
    public String locomocao(){
        return "Sem restrições de caminhos";
    }

    public Carro() {
    }

    public Carro(int id, String fabricante, Especificacao especificacao) {
        super.setId(id);
        super.setFabricante(fabricante);
        super.setEspecificacao(especificacao);
    }
 
}
