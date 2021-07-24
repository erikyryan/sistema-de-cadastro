package entity.veiculo;

public abstract class Veiculo {

    private int id;
    private Status status;
    private Especificacao especificacao = new Especificacao(); 
    //private String anoDeFabricacao;

    public String locomocao(){
        return null;
    }

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
    
    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}




   