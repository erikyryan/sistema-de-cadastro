package entity.pessoa;

public class Endereco {
    private String cidade;
    private String cep;
    private String numero;

    public Endereco() {
    }

    public Endereco(String cidade, String cep, String numero) {
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String toString() {
    	return "[ cidade: " + cidade + ", cep: " + cep + ", numero: " + numero + "]";
    }

}
