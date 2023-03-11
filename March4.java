import java.util.Scanner;

public class March4 {
    public static void main(String[] args) {
        /* Kadane Algo
               -> define 2 variables -> sum=0, maxsum=0
              i -> add current value to sum
              ii -> if sum > maxsum --> maxsum=sum;
                    -> if sum<0 --> sum=0;
              repeat step ii for each element

              iii -> print maxsum
        */
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Total Number of Elements");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter value for " + (i + 1));
//            arr[i] = sc.nextInt();
//        }
//        int sum = 0;
//        int maxs = 0;
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//            if (maxs < sum) {
//                maxs = sum;
//            }
//            if (sum < 0) {
//                sum = 0;
//            }
//        }
//        System.out.println("Max Sum is " + maxs);



        /*

            Prime Sieve (Sieve of Eratosthenes)
                -> find prime numbers less than given number
            t=15
            loop --> 2 to root t

           1 -> generate numbers 2 to t
           2 -> start loop from 2
           3 -> eliminate all multiples of 2 (set -1 or 0)
           4 -> repeat step 2 and 3 till root t
         */

        System.out.println("Enter Number");
        int n=sc.nextInt();
        int[] arr=new int[n-2];
        for (int i =0;i<n-2;i++){
            arr[i]=i+2;
        }
        for (int i=0;i<n-3;i++){
            if (arr[i]*arr[i]<n){
                for (int j=i+1;j<n-2;j++) {
                    if (arr[j] % arr[i] == 0) {
                        arr[j] = 0;
                    }
                }
            }
            if (arr[i]==0){
                continue;
            }
            else{
                break;
            }
        }

    for (int i=0;i<n-2;i++){
        if (arr[i]!=0)
            System.out.println(arr[i]);
    }
    }
}
