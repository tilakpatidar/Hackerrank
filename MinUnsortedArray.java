import java.util.Arrays;
import java.util.Scanner;
public class MinUnsortedArray{
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
        
        int arr[]=MinUnsortedArray.getArray();
        int init=0;//inital index
        int fin=0;//final index
        int temp=arr[0];
        for(int k=0;k<arr.length;k++){
            if(k!=arr.length-1 && arr[k]>arr[k+1]){
                
                    init=k;
                    break;
               
            }
        }
        for(int k=arr.length-1;k>=0;k--){
            if(k!=0 && arr[k-1]>arr[k]){
               
                    fin=k;
                    break;
                
            }
        }
        int temp_arr[]=Arrays.copyOfRange(arr,init,fin+1);
        Arrays.sort(temp_arr);
        int max=temp_arr[temp_arr.length-1];
        int min=temp_arr[0];
        int i=0;
        int j=0;
        boolean ifound=false;
        boolean jfound=false;
        for(int p=0;p<init;p++){
            if(arr[p]>min){
                i=p;
                ifound=true;
                break;
            }
        }
        for(int p=fin+1;p<arr.length;p++){
            if(arr[p]<max){
                j=p;
                jfound=true;
                break;
            }
        }
        if(!ifound){
            i=init;
        }
        if(!jfound){
            j=fin;
        }
        
        System.out.println("i is "+i+" j is "+j);
    }
}