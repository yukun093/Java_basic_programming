
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if(value > 0){
                continue;
            }else if(value < 0){
                sum = sum + 1;
            }else if(value == 0){
                break;
            }
        }
        System.out.println("Number of negative numbers: " + sum);
    }
}