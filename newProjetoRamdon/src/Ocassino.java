//cria a variavel ramdom
import java.security.SecureRandom;

public class Ocassino {
    //cia as variaveis static pois nao vai ser mutavel
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum status{CONTINUE ,WON ,LOST};

    private static final int SNAK = 2;
    private static final int TREY = 3;;
    private static final int SEVEN = 7;
    private static final int YO_ELEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int mypoint = 0;
        status gameStatus;
        int PrimeiraRolagem = rollDice();

        switch (PrimeiraRolagem){
            case SEVEN:case YO_ELEVEN:
                gameStatus = status.WON;
                break;
            case SNAK: case TREY: case BOX_CARS:
                gameStatus = status.LOST;
                break;
            default:
                gameStatus = status.CONTINUE;
                break;
        }
        while(gameStatus == status.CONTINUE){
            PrimeiraRolagem = rollDice();
            if(PrimeiraRolagem == mypoint) {
                gameStatus = status.WON;
            }else if(PrimeiraRolagem == SEVEN){
                gameStatus = status.LOST;

            }
        }
        if(gameStatus == status.WON){
            System.out.printf("voce venceu");
        }else{
            System.out.printf("voce perdeu");
        }

    }
    public static int rollDice(){
        int nun1 = 1 + randomNumbers.nextInt(6);
        int nun2 = 1 + randomNumbers.nextInt(6);
        int soma = nun1 + nun2;
        System.out.printf("a soma de %s e %s é %s ",nun1,nun2,soma);
        return soma;
    }
}
