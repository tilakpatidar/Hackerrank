import java.util.Scanner;
public class ClosestPairInTwoArray{
    
        
       
        
    
    public static void main(String[] args){
        int[] arr={1,4,5,7};
        int[] arr1={10,20,30,40};
        int temp=0;
        int prev=0;//stores the prev best option
        int x=0;
        int y=0;
        int previt=0;
        boolean sw=true;
        for(int u=0;u<arr1.length;u++){
            int max=arr1[u];
            for(int k=0;k<(arr.length);k++){
                int t=arr[k];
                if(t>prev && t<=max){
                    prev=t;
                    x=arr[k];
                }

            }
            if(previt>Math.abs(max-x) || previt==0){
                previt=Math.abs(max-x);
                y=max;
            }
        }
        System.out.println(""+x+" "+y);
        
        
    }
}