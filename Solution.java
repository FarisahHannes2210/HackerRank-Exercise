import java.io.*;
import java.util.Calendar;


//input: 08 14 2019 output: 



class JavaCalendar {
    


    public static String findDay(int month, int day, int year) {
        
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day); // Calendar months are 0-based
    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

    // Array of day names in uppercase
    String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
    return days[dayOfWeek - 1];
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = JavaCalendar.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
