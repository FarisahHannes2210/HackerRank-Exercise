//019 tag content extractor

//java regex, matcher, pattern, stack(need to study more)

import java.util.*;
import java.util.regex.*;

public class TagContentExtractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	Pattern pattern = Pattern.compile("<([^<>]+)>([^<>]+)<\\/\\1>"); 
            Matcher matcher = pattern.matcher(line); 
            Stack<String> stack = new Stack<>();  
             
            List<String> strsFound = new LinkedList<>();
            while (matcher.find()) {   
                
                 if (matcher.group(2).length() > 0) strsFound.add(matcher.group(2)); 
            }
            if (strsFound.size() == 0) {
                System.out.println("None"); 
            }
            else {
                for (String str: strsFound) {
                    System.out.println(str); 
                }
            }
			
			testCases--;
		}
	}
}



