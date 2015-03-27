/*Alice recently started learning about cryptography and found that anagrams are very useful. Two strings are anagrams of each other if they have same character set. For example strings "bacdc" and "dcbac" are anagrams, while strings "bacdc" and "dcbad" are not.

Alice decides on an encryption scheme involving 2 large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. She need your help in finding out this number.

Given two strings (they can be of same or different length) help her in finding out the minimum number of character deletions required to make two strings anagrams. Any characters can be deleted from any of the strings.

Input Format 
Two lines each containing a string.

Constraints 
1 <= Length of A,B <= 10000 
A and B will only consist of lowercase latin letter.

Output Format 
A single integer which is the number of character deletions.

Sample Input #00:

cde
abc
Sample Output #00:

4
Explanation #00: 
We need to delete 4 characters to make both strings anagram i.e. 'd' and 'e' from first string and 'b' and 'a' from second string.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tilak
 */
public class AnagramDel {
    public static void main(String[] args){
    try {
            int cmn=0;
            BufferedReader s1=new BufferedReader(new InputStreamReader(System.in));
            String input1=s1.readLine().toLowerCase();
            String input2=s1.readLine().toLowerCase();
            input1=input1.replaceAll("\\s+|\\n+|\\d+|[`~!@#$%^&*()_|+\\-=?;:'\",.<>\\{\\}\\[\\]\\\\\\/]","");
            input2=input2.replaceAll("\\s+|\\n+|\\d+|[`~!@#$%^&*()_|+\\-=?;:'\",.<>\\{\\}\\[\\]\\\\\\/]","");
            Set<String> a=new HashSet<>();
           Set<String> aback=new HashSet<>();
            Collections.addAll(a,input1.split(""));
            Collections.addAll(aback,input1.split(""));
            Set<String> b=new HashSet<>();
            Collections.addAll(b,input2.split(""));
            a.retainAll(b);
            String common=Arrays.toString(a.toArray());
            
             Iterator i=a.iterator();
             String temp1=input1;
             String temp2=input2;
             while(i.hasNext()){
                 String ch=i.next().toString();
                 //System.out.println(ch);
                 int cnt2=0;
                 int cnt1=0;
                 if(aback.size()!=input1.split("").length){
                 String temp11;
                 if(temp1.contains(ch)){
                     temp11=temp1.replaceFirst(ch,"");
                     if(temp11.contains(ch)){
                     String temp10=temp1.replaceAll(ch,"");
                    //s System.out.println(tempp.length+"");
                     cnt1=input1.length()-temp10.length();
                     }
                      else{
                     cnt1=1;
                 }
                 }
                 }
                 if(b.size()!=input2.split("").length){
                 String temp22;
                 if(temp2.contains(ch)){
                     temp22=temp2.replaceFirst(ch,"");
                 if(temp22.contains(ch)){
                    String temp20=temp2.replaceAll(ch,"");
                     cnt2=input2.length()-temp20.length();
                     
                 }
                 else{
                     cnt2=1;
                 }
                 }
                 }
                // System.out.println(cnt1+" "+cnt2);
                
                 cmn+=Math.abs(cnt2-cnt1);
                 
                 
             }
            char[] a1=input1.replaceAll(common.replaceAll(",",""),"").toCharArray();
            char[] a2=input2.replaceAll(common.replaceAll(",",""),"").toCharArray();
           // System.out.println(Arrays.toString(a1));
          //  System.out.println(Arrays.toString(a2));
           // System.out.println(cmn);
            System.out.println(""+(a1.length+a2.length+cmn));
            /* Enter your code here. Read input1 from STDIN. Print output to STDOUT. Your class should be named Solution. */
        } catch (IOException ex) {
            Logger.getLogger(AnagramDel.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
  
    
}
