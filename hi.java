
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class hi {

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        for(int k=0;k<n;k++){
            
            String temp=in.readLine();
            String t=temp.toLowerCase();
            if(t.matches("^hi\\s([^d]).*$")){
                System.out.println(temp);
            }
        }
        in.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
