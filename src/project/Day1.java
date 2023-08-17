package project;

import java.io.*;
import java.util.*;

public class Day1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int W = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        double answer = W * (1 + R / (double)30);
        
        bw.write(String.valueOf((int)answer));
        bw.flush();
        bw.close();
        br.close();
    }

}
