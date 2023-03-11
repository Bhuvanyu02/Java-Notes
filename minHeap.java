import java.util.PriorityQueue;
// by default minHeap is PriorityQueue
public class minHeap {

    PriorityQueue<Integer>minHeap1=new PriorityQueue<>();
    public int add(int num,int k){
        if(minHeap1.size()<k){
            minHeap1.add(num);
            return minHeap1.size()==k?minHeap1.peek():-1;
        }
        if(num>minHeap1.peek()){
            minHeap1.poll(); // remove number
            minHeap1.add(num);
        }
        return minHeap1.peek();
    }
    public static void main(String[] args) {
        minHeap m=new minHeap();
        int k=3;
        int[] a=new int[]{10,7,11,5,27,8,9,45};
        for (int i=0;i<a.length;i++){
            System.out.println(m.add(a[i],k));
        }
}
}