import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        StringBuilder sb = new StringBuilder(A); // init Stringbuilder
        
        StringBuilder changedd = sb.reverse(); //reverse stringbuilder
        
        String palindrome = changedd.toString(); //change it back to string
        
        if(A.equals(palindrome) == true){ // if A is equal to palindrome, then yes.
            System.out.println("Yes");
        }else{
            System.out.println("No");
            
        }
        
    }
}