import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[]args){
        // LARGEST NUMBER IN A ARRAY
        // SORT ARRAY
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int [n];
        for (int i = 0; i <n; i++) {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for (int i = 1; i < n; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("MAX is "+max);

        Arrays.sort(a);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
