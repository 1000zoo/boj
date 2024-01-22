//2024-01-22
//https://www.acmicpc.net/problem/01546
//평균

package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01546 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int max = -1;
        int sum = 0;
        StringTokenizer st = new StringTokenizer(reader.readLine());
        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            max = Math.max(max, temp);
            sum += temp;
        }
        double avg = ((double) sum / N) * (100.0 / max);
        System.out.println(avg);
    }
}
