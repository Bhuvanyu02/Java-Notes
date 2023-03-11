import java.util.Arrays;
import java.util.Scanner;

public class Feb22 {
    public static void main(String[] args) {
        // Frequency Array O(N)

//        int[] arr={1,2,3,4,5,6,7,8,9};
//        int n=arr.length;
//        Arrays.sort(arr);
//        int count;
//        for (int i=1;i<n;i++){
//            count=1;
//            while(arr[i-1]==arr[i] && i<n-1){
//                i++;
//                count++;
//            }
//            System.out.println(arr[i]+" : "+count);
//        }


        // PREFIX ARRAY
//    int[] arr={10,20,30,40};
//    int n=arr.length;
//    int[] p_arr=new int[n];
//    p_arr[0]=arr[0];
//    for (int i=1;i<n;i++){
//        p_arr[i]=arr[i]+p_arr[i-1];
//    }
//    for (int i=0;i<n;i++){
//        System.out.print(p_arr[i]+" ");
//    }

     // SLIDING WINDOW O(N)

     int arr[]={-1,0,1,2,8,6};
     int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter K");
        int k=sc.nextInt();
        int max1=arr[0];
        int max2=arr[1];
        if (max2>max1){
            int t=max1;
            max1=max2;
            max2=t;
        }

        int count=1;

        for (int i=0;i<n;i++){

            if (arr[i]>=max1){
                max1=arr[i];
            }
            if (count==k){
                System.out.println(max1);
                count=1;
            }
            else if(arr[i]<max1 && arr[i]>=max2){
                max2=arr[i];
            }
            count++;
        }




//     for (int i=0;i<k;i++){
//         if (arr[i]>max){
//             max=arr[i];
//         }
//     }
//        System.out.println(max);
//     for (int i=k-1;i<n-k+1;i++){
//         for (int j=i;j<i+k;j++){
//             if (arr[j]>max){
//                 max=arr[j];
//             }
//         }
//         System.out.println(max);
//     }


    }
}
