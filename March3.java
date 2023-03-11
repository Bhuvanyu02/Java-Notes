import java.util.Scanner;

public class March3 {
    public static void main(String[] args) {
        // QUESTION 1
//        int[] arr={20,21,25,30,26,25,40,42,43};
//        int count =0;
//        int count2=0;
//        int n=arr.length;
//        for (int i=0;i<n-1;i++){
//            if(arr[i]>arr[i+1] && count==0){
//                count=i;
//            }
//            if (arr[i]<arr[i+1] && count!=0 && count2==0){
//                count2=i;
//            }
//        }
//
//        System.out.println(count +" "+ count2);


        //  QUESTION 2
        String str="ABC";

        // QUESTION 3
        Scanner sc=new Scanner(System.in);
        int boxes=sc.nextInt();
        int []l=new int[boxes];
        int []b=new int[boxes];
        int []h=new int [boxes];
        for (int i=0;i<boxes;i++){
            System.out.println("ENTER Length Breadth Height of BOX "+(i+1));
            l[i]= sc.nextInt();;
            b[i]= sc.nextInt();;
            h[i]= sc.nextInt();
        }
        for (int i=0;i<boxes-1;i++){
            for (int j=i+1;j<boxes;j++){
                if (l[j]>l[i] && b[j]>b[i]){
                    int t=l[j];
                    l[j]=l[i];
                    l[i]=t;

                    int t2=b[j];
                    b[j]=b[i];
                    b[i]=t2;

                    int t3=h[j];
                    h[j]=h[i];
                    h[i]=t3;
                }
            }
        }
        int ans=0;
        int l1=l[0];
        int b1=b[0];
        int h1=h[0];

    for (int i=0;i<boxes;i++){
            //ans+=h[i];
        System.out.println(l[i]+" "+b[i]+" "+h[i]);
         }
        //System.out.println(ans);
    }
}
