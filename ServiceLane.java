import java.util.Scanner;
public class ServiceLane{
    public static void main(String[] args){
        int n,t;
        Scanner sc=new Scanner(System.in);
        String temps[]=sc.nextLine().split(" ");
        n=Integer.parseInt(temps[0]);
        t=Integer.parseInt(temps[1]);
        String wd[]=sc.nextLine().split(" ");
        int w[]=new int[n];
        int ii=0;
        for(String s : wd){
            w[ii]=Integer.parseInt(s);
            ii++;
        }
        int ans[]=new int[t];
        int tt=0;
        for(int k=0;k<t;k++){
            String temp[]=sc.nextLine().split(" ");
            int i=Integer.parseInt(temp[0]);
            int j=Integer.parseInt(temp[1]);
            int min=100000;
            for(int u=i;u<=j;u++){
                if(w[u]<min){
                    min=w[u];
                }
            }
            ans[tt]=min;
            ++tt;
        }
        sc.close();
       for(int y :ans){
           System.out.println(""+y);
       }
    }
    
}