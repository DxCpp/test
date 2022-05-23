import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter Num 1: ");
        Scanner enter = new Scanner(System.in);
        float num1 = enter.nextFloat();

        System.out.print("Enter Num 2: ");
        float num2 = enter.nextFloat();
        float sum = num1+num2;
        System.out.println("Result: " + sum);
    }
}