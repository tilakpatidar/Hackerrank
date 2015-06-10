/*If length of arr is n then the range of elements is 0 to n square minus one
*/
import java.util.Scanner;
    public class LinearRangeSort{
    public static int[] arr;
    public static int N;
    public static void getArray(){
        Scanner sc=new Scanner(System.in);
        int l=Integer.parseInt(sc.nextLine());
        N=l;
        arr=new int[l];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(sc.next("\\s*\\d+").trim());
        }
        
    }
    public static void main(String[] args){
        getArray();
        int[] bin_set=new int[N*N];
        for(int k:arr){
            bin_set[k]=k;
        }
        for(int k :bin_set){
            if(k!=0)
            System.out.print(" "+k);
        }
        
    }
}