import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int index = Integer.parseInt(br.readLine());

        bw.write(str.toCharArray()[index-1]);
        bw.flush();
        bw.close();
    }
}