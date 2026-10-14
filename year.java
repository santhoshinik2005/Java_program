import java.util.*;
public class Year {
     public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the year");
int year=scan.nextInt();
if(year%4==0)
{
System.out.println("it is  leap Year");
}
else
{
System.out.println("it isnot a leap Year");
}
}
}