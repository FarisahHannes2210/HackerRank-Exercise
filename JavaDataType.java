import java.math.BigInteger;
import java.util.Scanner;

public class JavaDataType {
    static BigInteger bn = BigInteger.valueOf(Byte.MIN_VALUE);
    static BigInteger bp = BigInteger.valueOf(Byte.MAX_VALUE);
    static BigInteger sn = BigInteger.valueOf(Short.MIN_VALUE);
    static BigInteger sp = BigInteger.valueOf(Short.MAX_VALUE);
    static BigInteger in = BigInteger.valueOf(Integer.MIN_VALUE);
    static BigInteger ip = BigInteger.valueOf(Integer.MAX_VALUE);
    static BigInteger ln = BigInteger.valueOf(Long.MIN_VALUE);
    static BigInteger lp = BigInteger.valueOf(Long.MAX_VALUE);

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int loopcount = sc.nextInt();

        for (int i = 1; i <= loopcount; i++) {

            BigInteger n = sc.nextBigInteger();
            if (n.compareTo(bn) >= 0 && n.compareTo(bp) <= 0) {

                System.out.println(n + " can be fitted in:\n* byte\n* short\n* int\n* long");

            } else if (n.compareTo(sn) >= 0 && n.compareTo(sp) <= 0) {

                System.out.println(n + " can be fitted in:\n* short\n* int\n* long");

            } else if (n.compareTo(in) >= 0 && n.compareTo(ip) <= 0) {
                
                System.out.println(n + " can be fitted in:\n* int\n* long");

            } else if (n.compareTo(ln) >= 0 && n.compareTo(lp) <= 0) {

                System.out.println(n + " can be fitted in:\n* long");

            } else {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }
    }
}
