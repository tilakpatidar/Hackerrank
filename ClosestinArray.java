import java.util.Scanner;
public class ClosestinArray{
   
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int max=Integer.parseInt(sc.nextLine());
        int n=Integer.parseInt(sc.nextLine());
        int arr[] =new int[n];
        for(int k=0;k<n;k++){
            arr[k]=Integer.parseInt(sc.next("\\s*\\d+").trim());
        }
        int temp=0;
        int prev=0;//stores the prev best option
        int x=0;
        int y=0;
        boolean sw=true;
        for(int k=0;k<(arr.length-1);k++){
            int t=arr[k]+arr[k+1];
            if(t>prev && t<=max){
                prev=t;
                x=arr[k];
                y=arr[k+1];
            }
           
        }
        
            System.out.println(""+x+" "+y);
        
    }
    
}