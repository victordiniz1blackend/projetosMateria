public class Pessoa {
    private String pessoa;
    private int ano;
    private String sexo;

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "pessoa='" + pessoa + '\'' +
                ", ano=" + ano +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
