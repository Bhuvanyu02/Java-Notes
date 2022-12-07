import java.util.Scanner;

public class nov_11 {
    public static void main(String[] args) {
        // SORTING (selection,insertion,quick,merge,bubble)

        //  Quick sort  (scan right to left and swap it to pivot)

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int sum=sc.nextInt();
            int sum2=0;
            boolean check=false;
            for (int j=0;j<n;j++){
                if(sum2<sum) {
                    sum2 += arr[j];
                }
                if(sum2==sum){
                    System.out.println(j+1);
                    check=true;
                }
                if (check==true){
                    break;
                }
            }
            if(check==false){
                System.out.println(-1);
            }
            sum2=0;
        }
    }
}
