import java.util.*;
import java.io.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        Arrays.sort(arr2);
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr2[i]){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
