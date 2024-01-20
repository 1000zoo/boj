//2024-01-21
//https://www.acmicpc.net/problem/01356
//유진수

package bruteforce;

public class P01356 {

    public static void main(String[] args) {
        String input = new java.util.Scanner(System.in).nextLine();

        System.out.println(process(input) ? "YES" : "NO");
    }

    private static boolean process(String input) {

        for (int i = 1; i < input.length(); i++) {
            String f = input.substring(0, i);
            String e = input.substring(i);
            if (getMul(f) == getMul(e)) {
                return true;
            }
        }

        return false;
    }

    private static int getMul(String num) {
        int mul = 1;

        for (char c : num.toCharArray()) {
            mul *= c - '0';
        }

        return mul;
    }
}
