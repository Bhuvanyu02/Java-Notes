import java.util.Scanner;

public class Smith_Joke_Numbers {
    public static void main(String[] args) {
            // step 1  -> find prime factors of numbers
            // step 2 ->  add digits of composite number
            // step 3 -> factors include composite number add digits
        // step 4 -> both sums are equal then smith numbers

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int n1=n;
        int count=1;
        while(!(n1>=1&&n1<=9)){
            int r=n1%10;
            sum+=r;
            n1/=10;
            count++;
        }
        sum+=n1;
        int sum2=0;
        for (int i=2;i<=n;i++){
            while(n%i==0){
                int i1=i;
                while(!(i1>=1&&i1<=9)){
                    int r=i1%10;
                    sum2+=r;
                    i1/=10;
                }
                sum2+=i1;
                n=n/i;
            }
        }
        if (sum==sum2){
            System.out.println("YES SMITH NUMBER");
        }
        else{
            System.out.println("NO");
        }
    }
}
