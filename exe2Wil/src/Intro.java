import java.util.Scanner;
public class Intro {
    public static void main(String[] args) {
      /*  int produto =3;
        int rodada=0;

        while (produto <= 100){
            produto = 3*produto;
            rodada++;
        }
        System.out.printf("o numero de mutiplos é %s ", produto);
        System.out.printf("as dodas foi %s", rodada);*/

        int nota = 0;
        int quantidade=1;
        int notaFinal=0;

        Scanner scanner = new Scanner(System.in);

        while(quantidade <=10){
            System.out.println("digite a nota");
            nota= nota + scanner.nextInt();
            quantidade++;
        }

        System.out.printf("ha nota de 10 alunos é %s", nota);

    }
}
