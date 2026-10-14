import java.util.*;
public class userint {
     public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter the 1st no");
int a=scan.nextInt();
System.out.println("enter the 2nd n0");
int b=scan.nextInt();
System.out.println("enter the 3nd no");
int c=scan.nextInt();
if(a>b && a>c){
System.out.println(a);
}
else if(b>c&&b>a)
{
System.out.println(b);
}
else{
System.out.println(c);
}
}
}