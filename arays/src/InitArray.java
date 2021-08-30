import java.util.Scanner;
public class InitArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int[] array1 = {10,11,40,50,70,80,70,80,90};




        for(int counter = 0; counter < array.length;counter++){
            System.out.printf("%5d%8d%n",counter,array[counter]);
        }
        for(int counter = 0; counter < array1.length;counter++){
            System.out.printf("%5d%8d%n",counter,array1[counter]);
        }

    }
}
