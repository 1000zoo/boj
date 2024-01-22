//2024-01-22
//https://www.acmicpc.net/problem/01524
//세준세비

package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class P01524 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            reader.readLine();
            reader.readLine();
            List<Integer> nList = new ArrayList<>();
            List<Integer> mList = new ArrayList<>();

            StringTokenizer forN = new StringTokenizer(reader.readLine());
            while (forN.hasMoreTokens()) {
                nList.add(Integer.parseInt(forN.nextToken()));
            }
            StringTokenizer forM = new StringTokenizer(reader.readLine());
            while (forM.hasMoreTokens()) {
                mList.add(Integer.parseInt(forM.nextToken()));
            }

            System.out.println(process(nList, mList));
        }
    }

    private static String process(List<Integer> nList, List<Integer> mList) {
        Collections.sort(nList);
        Collections.sort(mList);
        Queue<Integer> nQ = new LinkedList<>(nList);
        Queue<Integer> mQ = new LinkedList<>(mList);

        while (!nQ.isEmpty() && !mQ.isEmpty()) {
            if (nQ.peek() < mQ.peek()) {
                nQ.poll();
            } else {
                mQ.poll();
            }
        }

        if (!nQ.isEmpty()) {
            return "S";
        }
        if (!mQ.isEmpty()) {
            return "B";
        }
        return "C";
    }
}
