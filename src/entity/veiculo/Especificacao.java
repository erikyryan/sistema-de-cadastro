package entity.veiculo;

public class Especificacao {

    private String modelo;
    private String cor;
    private String fabricante;

    public Especificacao() {
    }

    public Especificacao(String modelo, String cor, String fabricante) {
        this.modelo = modelo;
        this.cor = cor;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
