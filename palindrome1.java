public class palindrome1 {
    public static void main(String[] args) {
        String s = "mam";
            String rev="";

        for (int i =2 ; i >=0; i--) {
            rev=rev+ s.charAt(i);
        }
            if(rev.equals(s)){
                    System.out.println("palindrome");
            }
            else
            {
                     System.out.println(" not palindrome");
            }
    }
}
