import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class KClosest{
    public static int[] arr;
    public static Scanner sc;
    public static int getCrossOver(int e){
        int temp=0;
        for(int k=0;k<arr.length;k++){
            if(k!=0 && arr[k-1]<e){
                temp=k;
            }
            if(k!=0 && arr[k+1]>e){
                temp=k;
                break;
            }
        }
        return temp;
    }
    public static void getArray(){
        
        int l=Integer.parseInt(sc.nextLine());
        arr=new int[l];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(sc.next("\\s*\\d+").trim());
        }
        
    }
    public static void main(String[] args){
        System.out.print("Get closest elements :");
        sc=new Scanner(System.in);
        int k=Integer.parseInt(sc.nextLine());
        System.out.print("Enter element : ");
        int e=Integer.parseInt(sc.nextLine());
        getArray();
        int cross=getCrossOver(e);
        int i=1;
        int rejected=0;
        LinkedList<Integer> li=new LinkedList();
        while(i!=(k+1)){
            if(Math.abs(arr[cross]-arr[cross-i])<Math.abs(arr[cross]-arr[cross+i])){
                
                boolean flag=false;
                int temp=0;
                int it=0;
                while(it<li.size()){
                    int next=li.get(it);
                    
                    if(Math.abs(arr[cross]-arr[cross-i])>Math.abs(arr[cross]-next)){
                        
                        temp=next;
                        li.remove(it);
                        flag=true;
                        break;
                    }
                    it++;
                }
                li.push(arr[cross+i]);
                
                if(flag){
                    li.push(arr[cross-i]);
                    System.out.println(""+temp);
                }
                else{
                    System.out.println(""+arr[cross-i]);
                }
            }
            else{
                int it=0;
                boolean flag=false;
                int temp=0;
                while(it<li.size()){
                    int next=li.get(it);
                    if(Math.abs(arr[cross]-arr[cross+i])>Math.abs(arr[cross]-next)){
                        temp=next;
                        
                        li.remove(it);
                        flag=true;
                        break;
                    }
                    it++;
                }
                li.push(arr[cross-i]);
                
                if(flag){
                    li.push(arr[cross+i]);
                    System.out.println(""+temp);
                }
                else{
                    System.out.println(""+arr[cross+i]);
                }
            }
            i++;
        }
    }
}