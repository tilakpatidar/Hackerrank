/*
 Problem Statement

Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly because it is a pangram. ( pangrams are sentences constructed by using every letter of the alphabet at least once. )

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence s, tell Roy if it is a pangram or not.

Input Format

Input consists of a line containing s.

Constraints 
Length of s can be atmost 103 (1≤|s|≤103) and it may contain spaces, lowercase and uppercase letters. Lowercase and uppercase instances of a letter are considered same.

Output Format

Output a line containing pangram if s is a pangram, otherwise output not pangram.

Sample Input #1

We promptly judged antique ivory buckles for the next prize    
Sample Output #1

pangram
 */

import java.io.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
/**
 *
 * @author tilak
 */
public class Pangram {
    public static void main(String[] args){
        try {
            BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
            String input=s.readLine().toLowerCase();
            input=input.replaceAll("\\s+|\\n+|\\d+|[`~!@#$%^&*()_|+\\-=?;:'\",.<>\\{\\}\\[\\]\\\\\\/]","");
            String[] a=input.split("");
            Set<String> hash=new HashSet<String>();
            Collections.addAll(hash, a);
            hash.remove("");
            if(hash.size()==26){
                System.out.println("pangram");
            }
            else{
                System.out.println("not pangram");
            }
            
            
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        } catch (IOException ex) {
            Logger.getLogger(Pangram.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
}
