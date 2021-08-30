public class Bolsista extends Aluno{
    private int bolsa;
    private int mensalidade;

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public int getMensalidade() {
        return mensalidade;
    }

    @Override
    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public void pagarmensalidade(){

    }
}
