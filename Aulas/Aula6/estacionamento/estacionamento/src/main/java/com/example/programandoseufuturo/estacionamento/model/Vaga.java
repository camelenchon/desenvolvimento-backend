package main.java.com.example.programandoseufuturo.estacionamento.model;

public class Vaga {
    
    private int id;

    @JsonProperty("placa_veiculo")
    private String placaVeiculo;
    
    @JsonProperty("esta_ocupada")
    private String estOcupada;

    public Vaga() {
    }

    public Vaga(int id, String placaVeiculo, String estOcupada) {
        this.id = id;
        this.placaVeiculo = placaVeiculo;
        this.estOcupada = estOcupada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getEstOcupada() {
        return estOcupada;
    }

    public void setEstOcupada(String estOcupada) {
        this.estOcupada = estOcupada;
    }

    

}
