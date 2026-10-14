import java.util.*;

public class Month {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the month");
      int month=scan.nextInt();
      switch(month){
        case 1-> System.out.println("jan");
        case 2-> System.out.println("feb");
        case 3-> System.out.println("mar");
        default-> System.out.println("invalid month");
      }
    }
    }