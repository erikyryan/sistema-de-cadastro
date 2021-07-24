package entity.veiculo;

public class Caminhao extends Veiculo {
    private String mercadoria;
    private Double pesoCarga;

    public Caminhao(){

    }

    public Caminhao(int id, String fabricante, Status status,Especificacao especificao, String mercadoria, Double pesoCarga) {
        setId(id);
        setFabricante(fabricante);
        setStatus(status);
        setEspecificacao(especificao);
        this.mercadoria = mercadoria;
        this.pesoCarga = pesoCarga;
    }

    public Caminhao(String mercadoria, Double pesoCarga) {
        this.mercadoria = mercadoria;
        this.pesoCarga = pesoCarga;
    }

    @Override
    public String locomocao(){
        return "Apenas em rodovias";
    }

    public String getMercadoria() {
        return this.mercadoria;
    }

    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }

    public Double getPesoCarga() {
        return this.pesoCarga;
    }

    public void setPesoCarga(Double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

}
