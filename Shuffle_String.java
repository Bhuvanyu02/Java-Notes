import java.lang.reflect.Array;
import java.util.Scanner;

public class Shuffle_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<n;i++){
            ans.append(str.charAt(a[i]));
        }
        System.out.println(ans);
    }
}
