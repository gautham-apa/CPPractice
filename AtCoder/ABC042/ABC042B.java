import java.io.*;
import java.util.*;

public class ABC042B {
    public static void main(String args[]) {
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        int l = br.nextInt();
        String[] list = new String[n];
        for(int i=0; i<n; i++) list[i] = br.next();
        Arrays.sort(list);
        String ans = "";
        for(String s: list) ans += s;
        System.out.println(ans);
    }
}
