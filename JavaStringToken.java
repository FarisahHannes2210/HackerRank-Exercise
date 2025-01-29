import java.util.*;
import java.util.stream.Collectors;


public class JavaStringToken {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // String s = "He is a very very good boy, isn't he?";
        
        String regex = "[,\\.!?'_@\\-\\s]";
        
        
       
        List<String> token = Arrays.asList(s.split(regex))
            .stream()
            .map(x -> x.trim())
            .filter(x -> !x.isEmpty())
            .collect(Collectors.toList());

    System.out.println(token.size());
    for (String t: token){
        System.out.println(t);
    }
    
        // Write your code here.
        scan.close();
    }
}
