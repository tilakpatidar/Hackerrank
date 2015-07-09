import java.util.Scanner;
class MinHeap{
    private Node root;
    MinHeap(int val){
        this.root=new Node(val,null,null,null);
        
    }
    public Node getRoot(){
        return this.root;
    }
    public void addNode(int val){
       Node t=this.getRoot();
       while(t.getVal()<val){
           if(t.getLeft().getVal()<val){
               t=t.getLeft();
           }
           
       }
        Node node = new Node(val,t.getRoot(),null,null);
       
    }
    public Node popRoot(){
        return null;
    }
}
class Node{
    private int value;
    private Node root,left,right;
    public Node(int value,Node root,Node left,Node right){
        this.value=value;
        this.root=root;
        this.left=left;
        this.right=right;
        
    }
    public int getVal(){
        return this.value;
    }
    public Node getLeft(){
        return this.left;
    }
    public Node geRight(){
        return this.right;
    }
    public Node getRoot(){
        return this.root;
    }
    
}
public class Array2Heap{
    public static int[] getArray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("N : ");
        int l=Integer.parseInt(sc.nextLine());
        int[] arr=new int[l];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(sc.next("\\s*\\d+").trim());
        }
        
        sc.close();
        return arr;
    }
   
    public static void main(String[] args){
        int[] arr=getArray();
        
    }
}