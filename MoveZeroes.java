import java.util.Arrays;
class MoveZeroes{
    public static void main(String[]args)
    {
        int left=0;
        int arr[]={0,1,0,3,12};
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}