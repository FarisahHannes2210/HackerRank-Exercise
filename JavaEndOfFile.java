import java.util.*;

public class JavaEndOfFile {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int lineNumber = 1;
        
        while(sc.hasNext()){
            
            String words = sc.nextLine();
            System.out.println(lineNumber + " " + words );
            
            lineNumber++;
            
        }
    }
    

    
}
