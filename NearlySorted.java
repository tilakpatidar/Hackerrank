import java.util.Scanner;
public class NearlySorted{
    public static int[] arr;
    public static int key;
    public static void getArray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Key : ");
        key=Integer.parseInt(sc.nextLine());
        System.out.print("N : ");
        int l=Integer.parseInt(sc.nextLine());
        arr=new int[l];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(sc.next("\\s*\\d+").trim());
        }
        
        sc.close();
    }
    public static int binarySearch(int[] a,int low,int high){
        if(high>=low){
            int mid=low+(high-low)/2;
            if(key==a[mid]){
                return mid;
            }
            else if(key<arr[mid] && key==arr[mid+1]){
                return mid+1;
            }
            else if(key>arr[mid] && key==arr[mid-1]){
                return mid-1;
            }
            if(key>arr[mid]){
                return binarySearch(a,mid+2,high);
            }
            else{
                return binarySearch(a,low,mid-2);
            }
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        getArray();
        System.out.println(""+binarySearch(arr,0,arr.length-1));
    }
    
}