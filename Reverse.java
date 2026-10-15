import java.util.*;
public class Reverse{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int k=1234;
int reverse=0;
for(i=k;i>0;i/=10){
  reverse=reverse*10;
  reverse+=i%10;
  }
System.out.println(reverse);
}
}