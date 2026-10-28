import java.util.Arrays;
public class Anagram{
    public static void main(String[] args) {
            String s1 = "list";
            String s2 = "silent";
            char a[] = s1.toCharArray();
            char b[] = s2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            String x = new String(a);
            String y = new String(b);
            if (x.equals(y)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}