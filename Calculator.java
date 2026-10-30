import java.util.Scanner;
class Calculator {
    Calculator(int a, int b) {
        System.out.println("Add: " + (a + b));
    }
    Calculator(int a, int b,int c) {
        System.out.println("Sub: " + (a - b -c));
    }
    Calculator(double a, double b) {
        System.out.println("Mul: " + (a * b));
    }
    Calculator(float a, float b) {
        System.out.println("Div: " + (a / b));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        Calculator c1 = new Calculator(num1, num2);
        Calculator c2 = new Calculator(num1, num2,num3);
        Calculator c3 = new Calculator((double)num1, (double)num2);
        Calculator c4 = new Calculator((float)num1, (float)num2);
    }
}
    
