import java.util.Scanner;
public class fcfs{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of processes :  ");
        int n=Integer.parseInt(sc.nextLine());
        System.out.println("Arrival Time    Service Time");
        int ans[][]=new int[n][7];
        for(int i=0;i<n;i++){
            
          for(int j=0;j<2;j++){
              
            ans[i][j]=Integer.parseInt(sc.next("\\s*\\d+").trim());
            
          }
        }
        //calculation
        
        int start_time=0;
        int finish_time=0;
        for(int k=0;k<n;k++){
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
           
        }
         for(int t=0;t<n;t++){
                for(int p=0;p<7;p++){
                    System.out.print("  "+ans[t][p]);
                    
                }
                System.out.println("\n");
            }
        
    }
    
}