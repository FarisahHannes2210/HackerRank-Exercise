import java.util.*;

public class JavaStringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length() + B.length());
        
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else if(A.compareTo(B) < 0){
            System.out.println("No");
        }else if(A.compareTo(B) == 0){
            System.out.println("No"); 
        }
        
        String capA = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String capB = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        
        System.out.println(capA + " " + capB);
         
        
    }
}
