import java.util.Scanner;

public class JavaAnagram{




    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        
         int[]map = new int[26];
        for(char x: a.toLowerCase().toCharArray()) map[(int)x - (int)'a']++;
        for(char x: b.toLowerCase().toCharArray()) map[(int)x - (int)'a']--;
        for(int x: map) if(x != 0) return false;
        return true;
        
        
      
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }



}

//need explanation tmrw