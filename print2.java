public class print2{
        public static void main(String[] args){
                String s="456";
                String r="123";
                int a=0;
                for(char c:s.toCharArray()){
                        a=a*10;
                        a+=c-'0';
                }
                int b=0;
                 for(char c:r.toCharArray()){
                        b=b*10;
                        b+=c-'0';
                }
                System.out.println(a+b);
        } 
}