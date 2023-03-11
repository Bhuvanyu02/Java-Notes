import java.util.Collections;
import java.util.PriorityQueue;

public class maxHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer>maxH=new PriorityQueue<>(Collections.reverseOrder());
        int k=3;
        int[] a=new int[]{10,7,11,5,27,8,9,45};
        for (int i=0;i<a.length;i++){
            maxH.add(a[i]);
            if (maxH.size()>k){
                maxH.poll();
            }
            if (maxH.size()<k){
                System.out.println(-1);
            }
            else{
                System.out.println(maxH.peek());
            }
        }
    }
}
