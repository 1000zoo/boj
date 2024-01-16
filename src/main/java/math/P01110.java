//2024-01-16
//https://www.acmicpc.net/problem/01110
//더하기 사이클

package math;

public class P01110 {

    public static void main(String[] args) {
        int N = new java.util.Scanner(System.in).nextInt();

        System.out.println(process(N));
    }

    private static int process(final int n) {
        int next = getNext(n);
        int count = 1;

        while (next != n) {
            next = getNext(next);
            count++;
        }

        return count;
    }

    private static int getNext(int n) {
        return (n % 10) * 10 + (n / 10 + n % 10) % 10;
    }
}
