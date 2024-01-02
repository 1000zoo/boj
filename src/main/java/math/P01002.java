//2024-01-02
//https://www.acmicpc.net/problem/01002
//터렛

package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P01002 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            StringTokenizer st2 = new StringTokenizer(reader.readLine());
            int x1 = Integer.parseInt(st2.nextToken());
            int y1 = Integer.parseInt(st2.nextToken());
            int r1 = Integer.parseInt(st2.nextToken());
            int x2 = Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());
            int r2 = Integer.parseInt(st2.nextToken());
            writer.write(process(x1, y1, r1, x2, y2, r2) + "\n");
        }

        writer.flush();
        writer.close();
    }

    private static String process(int x1, int y1, int r1, int x2, int y2, int r2) {
        double distance = getSquareDistance(x1, y1, x2, y2);
        double r = Math.pow(r1 + r2, 2);
        double dr = r1 > r2 ? r1 - r2 : r2 - r1 ;
        dr = Math.pow(dr, 2);

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return "-1";
        }

        if (distance == r || distance == dr) {
            return "1";
        }
        if (distance < dr || distance > r) {
            return "0";
        }
        return "2";
    }

    private static int getSquareDistance(int x1, int y1, int x2, int y2) {
        return (int) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
