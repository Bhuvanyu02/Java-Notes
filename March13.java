import java.util.Scanner;

public class March13 {
    public static void main(String[] args) {

        //  QUESTION 1
        //        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Size of the Array");
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for (int i=0;i<n;i++){
//            arr[i]*=arr[i];
//        }
//        for (int i=0;i<n-1;i++){
//            for (int j=i+1;j<n;j++){
//                if(arr[i]>arr[j]){
//                    int t=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=t;
//                }
//            }
//        }
//
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }



        // QUESTION 2

//        String s="lovecodingl";
//        int[] visit=new int[26];
//        int[] count=new int[26];
//        for (int i=0;i<s.length();i++){
//            int num=s.charAt(i)-'a';
//            count[num]++;
//            visit[num]=1;
//        }
//        int c=0;
//        for (int i=0;i<26;i++){
//           if (visit[i]==1 && count[i]==1 &&c==0){
//               System.out.println(i);
//               c++;
//           }
//        }
//        if(c==0){
//            System.out.println(-1);
//        }

        //  QUESTION 6

        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter n");
        //int n=sc.nextInt();
        int n=17;
        int[] arr={2,3 ,15, 16, 18, 2, 20, 14, 15, 12, 19, 20, 7 ,7 ,5, 13, 2};
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        int maxs=0;
        int sum=0;
        int a=0;
        int b=a+1;
        boolean check=false;
        int min1=arr[0];
        int max1=arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]<min1){
                min1=arr[i];
            }
            else if (max1<arr[i]) {
                max1=arr[i];
            }
        }
        maxs=max1-min1;
        while(b<n){
            if (arr[a]<arr[b]){
                sum+=(arr[b]-arr[a]);
                check=true;
            }
            if (check){
                a=b+2;
                b=a+1;
            }
            if (sum>maxs){
                maxs=sum;
            }
        }
        System.out.println(maxs);


    }
}
