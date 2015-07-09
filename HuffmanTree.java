import heap.MinHeap;
import java.util.Scanner;
public class HuffmanTree{
    public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           int n=Integer.parseInt(sc.nextLine());
           String[] chars=new String[n];
           int[] freq=new int[n];
           for(int i=0;i<n;i++){
               String res=sc.nextLine();
               chars[i]=res.split(" ")[0];
               freq[i]=Integer.parseInt(res.split(" ")[1]);
           }
        MinHeap m=new MinHeap();
        
        
    }
}