public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;
    private  String variante;

    public Carro(String modelo , String marca, Integer ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public Carro(String modelo , String marca, Integer ano, String variante){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.variante = variante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        variante = variante;
    }
}
