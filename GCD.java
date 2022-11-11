import java.util.Scanner;

public class GCD {
   static int gcd(int a,int b){
        if(a==b){
          return a;
        }
        else if(a>b) {
            return gcd(a-b,b);
        }
        else{
            return gcd(a,b-a);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=gcd(a,b);
        System.out.println(ans);

    }
}
