import java.util.Arrays;

public class Feb20 {
    public static void main(String[] args) {

        // Ques1 Sliding Window

//        int k = 4;  // max sum with k elements
//        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
//        int n = arr.length;
//
//        int max1 = 0;
//        if (n < k) {
//            System.out.println("Invalid");
//        }


//        for (int i = 0; i < n - k + 1; i++) {
//            int sum = 0;
//            for (int j = 0; j < k; j++) {
//                sum += arr[i + j];
//                max1 = Math.max(sum, max1);
//            }
//
//        }
//    int sum=0;
//        for (int i=0;i<k;i++){
//            sum+=arr[i];
//        }
//        max1=sum;
//        for (int i=0;i<n-k;i++){
//            sum-=arr[i]; // subtract previous
//            sum+=arr[i+k]; //  add next element
//            if (sum>max1){
//                max1=sum;
//            }
//        }


        // System.out.println(max1);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////


// Two Sum Problem

        int[] arr = {0, -1, 2, -3, 1};
        int sum = -2;
        int n = arr.length;
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        while(j>i){
            if (arr[i]+arr[j]==sum){
                System.out.println("Yes");
                System.out.println("Index are "+i+" and "+j);
                break;
            }
            else if (arr[i]+arr[j]<sum) {
                i++;
            }
            else{
                j--;
            }
        }
    }
}
