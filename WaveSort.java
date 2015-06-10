import java.util.Arrays;
import java.util.Scanner;
public class WaveSort{
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
        Arrays.sort(arr);
        boolean skip=false;
        for(int k=0;k<arr.length;k++){
            if(!skip && (k+1)!=arr.length){
                int temp=arr[k];
                arr[k]=arr[k+1];
                arr[k+1]=temp;
                skip=true;
            }
            else{
                skip=false;
            }
        }
        System.out.println(""+Arrays.toString(arr));
    }
}