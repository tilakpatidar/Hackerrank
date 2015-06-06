/*
Problem Statement
Given two integers, L and R, find the maximal value of A xor B, where A and B satisfy the following condition:
L≤A≤B≤R
Input Format
The input contains two lines; L is present in the first line and R in the second line.
Constraints 
1≤L≤R≤103
Output Format
The maximal value as mentioned in the problem statement.
Sample Input
10
15
Sample Output
7
*/
import java.util.Scanner;
public class XOR{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=Integer.parseInt(sc.nextLine());
        int r=Integer.parseInt(sc.nextLine());
        sc.close();
        int max=-1;
        for(int k=l;k<=r;k++){
            for(int j=l;j<=r;j++){
                int temp=k^j;
                if (temp>max){
                    max=temp;
                }
            }
        }
        System.out.println(""+max);
    }
}