public class smallest2{
  public static void main(String[]args){
      int min=Integer.MAX_VALUE;
    int arr[]={7,8,15,17,91,15};
    for(int i=0;i<arr.length;i++){
        min=Math.min(min,arr[i]);
    }
      System.out.println(min);
    }
  }