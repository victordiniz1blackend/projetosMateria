public class StudantTest {
    public static void main(String[] args) {

        Studant aluno1 = new Studant("victor",10);
        Studant aluno2 = new Studant("vitinho",90);

        System.out.printf("%s a nota é %s%n",aluno1.getNome(),aluno1.getLetterGrade());
        System.out.printf("%s a nota é %s%n",aluno2.getNome(),aluno2.getLetterGrade());

    }

}
