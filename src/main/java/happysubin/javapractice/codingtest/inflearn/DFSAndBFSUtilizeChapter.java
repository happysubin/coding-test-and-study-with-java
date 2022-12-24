package happysubin.javapractice.codingtest.inflearn;

import java.io.*;
import java.util.*;

public class DFSAndBFSUtilizeChapter {

     static List<Integer> list = new ArrayList<>();
     static int[] ch;
     static int answer = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        for (String s1 : s) {
            list.add(Integer.parseInt(s1));
        }
        ch = new int[num];

        DFSAndBFSUtilizeChapter main = new DFSAndBFSUtilizeChapter();
        main.DFS(-1, ch);
        if(answer >= 1) bw.write("YES");
        else bw.write("NO");
        bw.flush();
    }

    private void DFS(int L, int[] ch) {
        if(L == ch.length - 1){
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < ch.length; i++) {
                if(ch[i] == 1){
                    sum2 += list.get(i);
                }
                else{
                    sum1 += list.get(i);
                }
            }
            if(sum2 == sum1)answer++;
        }
        else{
            L++;
            ch[L] = 1;
            DFS(L, ch);
            ch[L] = 0;
            DFS(L, ch);
        }
    }
}
