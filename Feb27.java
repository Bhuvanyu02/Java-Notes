public class Feb27 {
    public static void main(String[] args) {
        int[]arr={1,2,-1,-8,-3,7,9,-4,0,11};
        int n=arr.length;
        int[] arr2=new int [n];
        int count=0;
        int j=0;
        //  DOUBLE ARRAY APPROACH

        for (int i=0;i<n;i++){
            if(arr[i]<0){
                count++;
                arr2[j]=arr[i];
                j++;
            }
        }
        for (int i=0;i<n;i++){
            if(arr[i]>=0){
                arr2[j]=arr[i];
                j++;
            }

        }
        for (int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
