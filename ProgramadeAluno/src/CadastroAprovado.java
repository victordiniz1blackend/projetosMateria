import java.util.Scanner;
public class CadastroAprovado {
    public static void main(String[] args) {
        //criacao das variaveis
        int nota;
        int aprovados=0;
        int reprovados=0;
        int contador=1;
//criacao do scanner para pedir um valor para o usuario
        Scanner scanner = new Scanner(System.in);
// while para fazer o loop ate 10
        while(contador<= 10){
            //pedindo para o usuario colocar a informacao
            System.out.println("1 para aprovado, 2 para reprovado");
            //armazenando a informacao do  usuario
            nota= scanner.nextInt();
            // nesse primeiro if par verificar se é 1 ou 2 se for 1 soma mais 1 no aprovado, caso aocontrario vai no else e soma reprovado
            if(nota == 1){
                aprovados++;
            }else{
                reprovados++;
            }
            contador++;
        }

//nesse if e else é para mostrar se o instrutor vai ter um bonus ou nao
        if(aprovados>8){
            System.out.printf("a quantidade de aprovados é %s%n voce recebera um bonus",aprovados);
        }else{
            System.out.printf("a quantidade de aprovados é%s e reprovados é %s%n",aprovados,reprovados);
        }


    }
}
//pagina 104