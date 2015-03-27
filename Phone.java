/*
There is a list of phone numbers which needs the attention of a text processing expert. As an expert in regular expressions, you are being roped in for the task. A phone number directory can reveal a lot such as country codes and local area codes. The only constraint is that one should know how to process it correctly.

A Phone number is of the following format

[Country code]-[Local Area Code]-[Number]  
There might either be a '-' ( ascii value 45), or a ' ' ( space, ascii value 32) between the segments 
Where the country and local area codes can have 1-3 numerals each and the number section can have 4-10 numerals each.

And so, if we tried to apply the a regular expression with groups on this phone number: 1-425-9854706

We'd get: 
Group 1 = 1 
Group 2 = 425 
Group 3 = 9854706


*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Phone {

    public static void main(String[] args) throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        String result="";
        for(int k=0;k<n;k++){
            
            String temp=in.readLine();
            if(temp.contains(" ")){
                String[] parts=temp.split(" ");
                result+="CountryCode="+parts[0]+",LocalAreaCode="+parts[1]+",Number="+parts[2]+"\n";
            }
            else if(temp.contains("-")){
                String[] parts=temp.split("-");
                result+="CountryCode="+parts[0]+",LocalAreaCode="+parts[1]+",Number="+parts[2]+"\n";
            }
            
            
        }
        System.out.println(result);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
