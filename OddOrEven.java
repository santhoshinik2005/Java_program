import java.util.*;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);		
        System.out.println("Enter the number:");
        int a = scan.nextInt();
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= a; i++) {  
            if (i % 2 == 0) {
                even += i;  
            } else {
                odd += i;              
 }
        }

        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);

           }
}
