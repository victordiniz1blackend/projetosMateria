public class Carro {
    private String carro;
    private double ano;
    private String placa;

    public Carro(String carro, double ano, String placa){
        this.carro = carro;
        this.placa = placa;
        this.ano = ano;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public double getAno() {
        return ano;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
