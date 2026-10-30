import java.util.Scanner;
class Student{
    void score(String name,String department){
        System.out.println("name:"+name);
        System.out.println("department:"+department);

    }
        public static void main(String[]args){
            Scanner scan=new Scanner(System.in);
            String details=scan.nextLine();
            Student s=new Student();
            System.out.println( "name:"+details);
            String detail=scan.nextLine();
            System.out.println( "department:"+detail);

           
    }
}