public class minimum{
  public static void main(String[]args)
    {
      int arr[]={9,34,56,78,90};
      int min=arr[0];
      for(int i=1;i<arr.length;i++){
        min=Math.min(min,arr[i]);
      }
      {
      System.out.println(min);
      }
    }
}
    