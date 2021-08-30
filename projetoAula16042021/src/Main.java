public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setPessoa("victor");
        p2.setPessoa("gabriel");
        p3.setPessoa("julia");
        p4.setPessoa("gabriel");

        p2.setCurso("info");
        p3.setSalario(2400);
        p4.setSetor("estoque");

        System.out.println(p1.toString());
    }
}
