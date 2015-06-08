import java.util.Arrays;
import java.util.Scanner;
public class KSortedArray{
    public static int[] getArray(){
        Scanner sc=new Scanner(System.in);
        int l=Integer.parseInt(sc.nextLine());
        int arr[]=new int[l];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(sc.next("\\s*\\d+").trim());
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr=getArray();
        int j;
        for(int i=1;i<arr.length;i++){
            j=i-1;
            int key=arr[j];
            while (j >= 0 && arr[j] > key)
               {
                   arr[j+1] = arr[j];
                   j = j-1;
               }
            arr[j+1]=key;
        }
        System.out.println(""+Arrays.toString(arr));
        
    }
}