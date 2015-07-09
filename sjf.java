import java.util.Scanner;
import java.util.ArrayList;
public class sjf{
    public static int ans[][];
    public static ArrayList completed;
    public static int n;
    public static int checkIfShortAvail(int d){
        int min=ans[0][1];
        boolean first=true;
        int index=0;
        for(int i=0;i<n;i++){
            if(ans[i][0]<d && !completed.contains(i)){
                if(first){
                    min=ans[i][1];
                    first=false;
                    index=i;
                }
                else{
                    if(ans[i][1]<min){
                        min=ans[i][1];
                        index=i;
                    }
                }
                
               
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of processes :  ");
        n=Integer.parseInt(sc.nextLine());
        System.out.println("Arrival Time    Service Time");
        ans=new int[n][7];//init array
        completed=new ArrayList();
        for(int i=0;i<n;i++){
            
          for(int j=0;j<2;j++){
              
            ans[i][j]=Integer.parseInt(sc.next("\\s*\\d+").trim());
            
          }
        }
        //calculation
        
        int start_time=0;
        int finish_time=0;
        int k=0;
        int done=0;
        while(done!=(n)){
            if(k==0){
                ans[0][2]=0;//zero start time for first row
                ans[0][3]=ans[0][1];
                finish_time+=ans[0][1];
                start_time=ans[0][1];
                
            }
            else{
               ans[k][2]=start_time;
               finish_time+=ans[k][1];
               ans[k][3]=finish_time;
               start_time+=ans[k][1];
              
               
            }
            
             ans[k][4]=Math.abs(ans[k][0]-ans[k][2]);
               ans[k][5]=Math.abs(ans[k][0]-ans[k][3]);
               ans[k][6]=ans[k][5]/ans[k][1];
           completed.add(k);
           k=checkIfShortAvail(ans[k][3]);
           System.out.println("new "+k);
           done+=1;
        }
         for(int t=0;t<n;t++){
                for(int p=0;p<7;p++){
                    System.out.print("  "+ans[t][p]);
                    
                }
                System.out.println("\n");
            }
        
    }
    
}