//importando a variavel scanner
import java.util.Scanner;
public class ProjetoStatic {
    public static void main(String[] args) {
        //criando  input onde o usuario vai inserir um numero
        Scanner input = new Scanner(System.in);
        //pedindo e armazenando 3 numeros
        System.out.println("digite 3 numeros");
        double nun1=input.nextDouble();
        double nun2=input.nextDouble();
        double nun3=input.nextDouble();
        double result=maximun(nun1,nun2,nun3);
        System.out.printf("%s", result);
    }
    //variavel static para resolver um problema de quak é o numero maior 
    public static double maximun(double x,double y,double d){
        double maxvalue = x;

        if(y > maxvalue){
            maxvalue = y;
        }
        if(d > maxvalue){
            maxvalue = d;
        }

       return maxvalue;
    }
}
