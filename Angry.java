import java.util.Scanner;
public class Angry{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        String ans="";
        for(int i=0;i<t;i++){
            String[] temp=sc.nextLine().split(" ");
            int n=Integer.parseInt(temp[0]);
            int k=Integer.parseInt(temp[1]);
            int[] arrival=new int[n];
            String[] t1=sc.nextLine().split(" ");
            for(int j=0;j<t1.length;j++){
                arrival[j]=Integer.parseInt(t1[j]);
            }
            int late=0;
            int on_time=0;
            for(int p:arrival){
                    if(p<=0){
                            on_time++;
                    }
                    else{
                        late++;
                    }
            }
            if(on_time<k){
                ans+="YES\n";
            }
            else{
                ans+="NO\n";
            }
        }
        System.out.println(ans);
        
        
    }
}