public class Mar1 {
    public static void main(String[] args) {
        // PIGEON HOLE SORTING
            // 2 8 6 5 4 3 1
        // max=8, min =1;
        // holes = max-min+1
        // p[i]=arr[i]-min;

//        int[] arr={2,8,6,5,3,1};
//        int n=arr.length;
//        int max=arr[0];
//        int min = arr[0];
//        for (int i=0;i<n;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        int holes=max-min+1;
//        int[]arr2=new int[holes];
//        for (int i=0;i<holes;i++){
//            arr2[i]=-1234;
//        }
//        for (int i=0;i<n;i++){
//            int j=arr[i]-min;
//            arr2[j]=arr[i];
//        }
//
//        for (int i=0;i<holes; i++){
//            if (arr2[i]==-1234){
//                continue;
//            }
//            System.out.print(arr2[i]+" ");
//        }



        // SORT ARRAY IN O(N) TIME

//        int[] arr={0,1,0,1,2,1,1};
//        int n=arr.length;
//        int b=0;
//        int e=n-1;
//        int m=0;
//        while (m<=e){
//            if (arr[m]==0){
//                int t=arr[b];
//                arr[b]=arr[m];
//                arr[m]=t;
//                b++;
//                m++;
//            }
//            else if(arr[m]==1){
//                m++;
//            }
//            else{
//                int t=arr[m];
//                arr[m]=arr[e];
//                arr[e]=t;
//                e--;
//            }
//        }
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }


    }
}
