import java.util.*;

public class divisiblebythree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);		
        System.out.println("Enter the number:");
	int a=scan.nextInt();
	int sum=0;
	 for (int i = 1; i <= a; i++) {  
            if (i % 3 == 0) {
		sum+=i;
		}
	}
	 System.out.println(sum);
		}
	
}


