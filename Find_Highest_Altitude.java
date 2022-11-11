import java.util.Scanner;

public class Find_Highest_Altitude {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=0;
        int max=0;
        for (int i=0;i<n;i++){
            s=s+a[i];
            if(s>max){
                max=s;
            }
        }
        System.out.println(max);
    }
}
