import java.util.Scanner;
public class whileIntro {
    public static void main(String[] args) {
        // entrada de dados
        int nota=0;
        int media =0;
        int dividir=0;
        //criacao da variavel Scanner
        Scanner scanner = new Scanner(System.in);
        /*condicao while de repticao, aqui ele verifica se nota é diferente de -1, enquanto ele for diferente ele
         vai entrar no lup */
        while(nota != -1){
            //aqui o usuario vai digitar um valor de 0 a 10
            nota =  scanner.nextInt();
            /* nesse ifs faz a verificacao se o usuario digitou um numero valido de 0 a 10 ou escreveu -1 para finalizar
             */
            if(nota==0){
                System.out.printf("voce digitou 0 por favor insira um numero ou finalize o programa");
                nota =scanner.nextInt();
            } if(nota> 10){
                System.out.printf("voce digitou um numero maior que 10 insira um numero ou finalize o programa");
                nota =scanner.nextInt();
            }
            //aqui é armazenado as notas e contabilizado quantas notas fi cadastrada
            media = media + nota;
            dividir++;
        }
        //aqui é imprimido a variavel media divida pela quantidade
        System.out.printf("a media de todos os alunos é %s",media/dividir);
    }


}
