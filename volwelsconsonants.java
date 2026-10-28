public class volwelsconsonants{
    public static void main(String[] args) {
        String s="HelloWorld";
        int volwels=0;
        int consonants=0;
            for(int i=0;i<s.length();i++){
                    char c=s.charAt(i);
                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                            volwels++;
                    }
                    else
                    {
                            consonants++;
                    }
            }
        System.out.println("volwels:"+volwels);
              System.out.println("consonants:"+consonants);
    
}
}
