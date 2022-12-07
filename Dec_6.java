public class Dec_6 {
    ////        PRIORITY QUEUE
    public Node head=null;
    public void push(Node ele){
        int p1=ele.node_p();
        if(head==null){
            head=ele;
        }
        else{
            Node ptr=head;
            if(p1>ptr.node_p()){
                ele.set_node(head);
                head=ele;
            }
            else{
                while (ptr.node_n()!=null && ptr.node_n().node_p()<p1){
                    ptr=ptr.node_n();
                }
                ele.set_node(ptr.node_n());
                ptr=ele;
            }
        }
    }
    public void peek(){
        System.out.println("Head Data : "+head.node_d());
        System.out.println("Head Priority : "+head.node_p());
    }

    public void pop(){
        if (head==null){
            System.out.println("UNDER-FLOW");
        }else{
            head=head.node_n();
            System.out.println("Element Deleted");
        }
    }

    public static void main(String[] args) {
            Dec_6 d=new Dec_6();
            Node n1=new Node(1565,18);
            Node n2=new Node(1565555,19);
            Node n3=new Node(1,20);

            d.push(n1);
            d.push(n2);
            d.push(n3);
            d.peek();
            d.pop();
            d.peek();

    }
}
class Node{
    private int data;
    private int priority;
    private Node next;
    Node (int d1,int p1){
        data=d1;
        priority=p1;
        next=null;
    }
    int node_d(){
        return data;
    }
    int node_p(){
        return priority;
    }
    Node node_n(){
        return next;
    }
    void set_node(Node next1){
        next=next1;
    }
}