import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// even position 1st half
// odd position 2nd half

// find kth Largest and kth Smallest

public class sort_AND_half {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8,9,10,11,12};
        Arrays.sort(a);
        Queue<Integer>q1=new LinkedList<>();
        Queue<Integer>q2=new LinkedList<>();

        int j=a.length/2;
        int count=0;
       for (int i=0;i<a.length/2;i++){
           q1.add(a[i]);
       }
       for (int i=a.length/2;i<a.length;i++){
           q2.add(a[i]);
       }

       for (int i=0;i<a.length;i++){
           if(i%2!=0){
               a[i]=q1.peek();
               q1.poll();
           }
           else {
               a[i]=q2.peek();
               q2.poll();
           }
       }

       for (int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
    }
}
