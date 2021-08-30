import java.security.SecureRandom;
public class NewRandonwm {
    public static void main(String[] args) {
        int arm1=0,arm2=0,arm3=0,arm4=0,arm5=0,arm6=0;
        SecureRandom newRandom = new SecureRandom();
        for(int cont = 0; cont <=30; cont++) {
            int numero = 1+ newRandom.nextInt(6);
            System.out.printf("%d ", numero);
            if(numero % 5 == 0){
                System.out.println();

            }
        }
        for(int cont = 0; cont <=10000; cont++){
            int num1 = 1+ newRandom.nextInt(6);
            switch (num1) {
                case 1:
                    arm1++;
                    break;
                case 2:
                    arm2++;
                    break;
                case 3:
                    arm3++;
                    break;
                case 4:
                    arm4++;
                    break;
                case 5:
                    arm5++;
                    break;
                case 6:
                    arm6++;
                    break;
            }
        }
        System.out.printf("%s %n",arm1);
        System.out.printf("%s %n",arm2);
        System.out.printf("%s %n",arm3);
        System.out.printf("%s %n",arm4);
        System.out.printf("%s %n",arm5);
        System.out.printf("%s %n",arm6);
    }

}
