/*
Problem Statement

At HackerRank, we always want to find out how popular we are getting every day and have scraped conversations from popular sites. Each conversation fits in 1 line and there are N such conversations. Each conversation has at most 1 word that says hackerrank (all in lowercase). We would like you to help us figure out whether a conversation:

Starts with hackerrank
Ends with hackerrank
Start and ends with hackerrank
Input Format

First line of the input contains an integer, N. Then N lines follow. 
From the second line onwards, each line contains a set of W words separated by a single space

Constraints

1 <= N <= 10
1 <= W <= 100
All the characters in W are lowercase alphabet characters.
If C is the count of the characters in W, then 1 <= C <= 20
Output Format

For every line,

Print 1 if the conversation starts with hackerrank
Print 2 if the conversation ends with hackerrank
Print 0 if the conversation starts and ends with hackerrank
Print -1 if none of the above.
Sample Input

4
i love hackerrank
hackerrank is an awesome place for programmers
hackerrank
i think hackerrank is a great place to hangout
Sample Output

2
1
0
-1
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hackerrank {

    public static void main(String[] args) throws IOException {
       BufferedReader s1=new BufferedReader(new InputStreamReader(System.in));
        int times=Integer.parseInt(s1.readLine());
        int result=0;
        for(int k=0;k<times;k++){
            result=0;
            String w=s1.readLine().toLowerCase();
            if(w.matches("^hackerrank.*")){
                if(w.matches(".*hackerrank$")){
                    
                    result=0;
                }
                else{
                result=1;
                }
                
            }
            else{
                if(w.matches(".*hackerrank$")){
                    
                    result=2;
                }
                else{
                    
                    result=-1;
                }
                
            }
           System.out.println(result+"");
            
        }
        
    }
}
