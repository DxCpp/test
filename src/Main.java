import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.print("Enter string: ");
        Scanner enter = new Scanner(System.in);
        String str = enter.nextLine();
        System.out.println(str);
=======
        System.out.print("Enter Num 1: ");
        Scanner enter = new Scanner(System.in);
        float num1 = enter.nextFloat();

        System.out.print("Enter Num 2: ");
        Scanner enter1 = new Scanner(System.in);
        float num2 = enter1.nextFloat();
        float sum = num1+num2;
        System.out.println("Result: " + sum);
>>>>>>> 2a3d567 (Initial commit)
    }
}