public class maximum{
  public static void main(String[]args)
    {
      int arr[]={9,34,56,78,90};
      int max=arr[0];
      for(int i=0;i<arr.length;i++){
        max=Math.max(max,arr[i]);
      }
      {
      System.out.println(max);
      }
    }
}
    