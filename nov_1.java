import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class nov_1 {
    public static void main(String[] args) {
//        ArrayList<Integer>alist=new ArrayList<Integer>();
//        alist.add(1);
//        alist.add(2);
//        alist.add(3);
//        alist.add(4);
//        System.out.println(alist);
//        System.out.println(alist.size());
//        Collections.sort(alist);
//        alist.remove(2);
//        Iterator <Integer>itr=alist.iterator();  // Integer
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//        ArrayList<String>alist=new ArrayList<>();
//        alist.add("a");
//        alist.add("b");
//        alist.add("c");
//        alist.add("d");
//        System.out.println(alist);
//        System.out.println(alist.size());
//        Collections.sort(alist);
//        alist.remove(2);
//        Iterator <String>itr=alist.iterator();  // String
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
                        // LIST WORKS SAME AS ARRAYLIST



        // STACK
//        Stack<Integer>s=new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        // System.out.println(s);
//        System.out.println("haaan bhyyii ki hal ne  kesa haii bhai sb theek thak koi dikkat to nhi a agr hai to btaa ");
//        Iterator<Integer>i=s.iterator();
//        while (!s.empty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//        System.out.println(s.search(42));



        // Priority Queue
//        PriorityQueue<String>pq=new PriorityQueue<String>();
//        pq.add("x");
//        pq.add("y");
//        pq.add("a");
//        pq.add("c");
//
//        System.out.println(pq);
//        System.out.println(pq.element());// peek
//        pq.poll();
//        System.out.println(pq.element());
//        pq.remove();
//        System.out.println(pq);



    // DEQUEUE
        ArrayDeque<String>pq=new ArrayDeque<>();
        pq.add("x");
        pq.add("y");
        pq.add("a");
        pq.add("c");

        System.out.println(pq);
        System.out.println(pq.element());// peek
        pq.poll();
        System.out.println(pq.element());
        pq.remove();
        System.out.println(pq);
        pq.pollFirst();//remove first
        System.out.println(pq);
        pq.pollLast();
        System.out.println(pq);
        pq.offerFirst("om");
        System.out.println(pq);
    }
}
