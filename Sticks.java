import java.util.Scanner;
public class Sticks{
    public static int[] arr;
    public static int findMin(){
        int min=1000000;
        for(int k : Sticks.arr){
            if(k<min && k!=0){
                min=k;
            }
        }
        return min;
    }
   
    public static void reduceBy(int min){
        int t=0;
        for(int k=0;k<Sticks.arr.length;k++){
            if(Sticks.arr[k]!=0){
                int temp=Sticks.arr[k]-min;
                    Sticks.arr[k]=temp;
                
                t++;
            }
        }
        System.out.println(""+t);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] ar=sc.nextLine().split(" ");
        int[] sticks=new int[ar.length];
        for(int i=0;i<sticks.length;i++){
            sticks[i]=Integer.parseInt(ar[i]);
        }
        Sticks.arr=sticks;
        int temp=0;
        while(temp==0){
            int min=Sticks.findMin();
            if(min==1000000){temp=1;}
            else{
            Sticks.reduceBy(min);
            }
        }
        
        
    }
}