public class CadastroDeCarro {
    public static void main(String[] args) {
        Carro modelo = new Carro("fiat",2020,"p10gr");
        Carro modelo1 = new Carro("pejot",2021,"p2934f");

        System.out.printf("%s o ano e o medelo é %s %s%n",modelo.getCarro(),modelo.getAno(),modelo.getPlaca());
        System.out.printf("%s o ano e o medelo é %s %s%n",modelo1.getCarro(),modelo1.getAno(),modelo1.getPlaca());
    }
}
