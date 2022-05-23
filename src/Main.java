import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Calculator calculator = new Calculator();
    }
}

class Calculator {
        public Calculator() {
                System.out.print("Enter Num 1: ");
                Scanner enter = new Scanner(System.in);
                float num1 = enter.nextFloat();

                System.out.print("Enter Num 2: ");
                float num2 = enter.nextFloat();

                System.out.println("Result: " + sum(num1,num2));
        }

        public float sum (float num1, float num2){
                return num1 + num2;
        }

}