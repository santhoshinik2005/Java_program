public class  adddition of odd and even{
  public static void main(String[]args){
    int min=Integer.MAX_VALUE;
    int arr[]={7,4,3,2,0,15};
      int sum=0;
      int even=0;
      int odd=0;
    for(int i:arr){
        if(i%2==0){
            even=even+i;
        }
        else{
            odd=odd+i;
        }
    }
      System.out.println("even: "+even);
      System.out.println("odd: "+odd);
  }
}
