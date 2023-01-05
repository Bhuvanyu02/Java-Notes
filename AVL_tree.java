import java.util.*;

public class AVL_tree {

    TNode2 root = null;


    TNode2 right_rotate(TNode2 n1) {
        TNode2 n2 = n1.get_left();
        TNode2 n3 = n2.get_right();
        n2.set_right(n1);
        n1.set_left(n3);
        update_height(n1);
        update_height(n2);
        return n2;
    }

    TNode2 left_rotate(TNode2 n1) {
        TNode2 n2 = n1.get_right();
        TNode2 n3 = n2.get_left();
        n2.set_left(n1);
        n1.set_right(n3);
        update_height(n1);
        update_height(n2);
        return n2;
    }

    int get_height(TNode2 n1) {
        return n1 == null ? -1 : n1.height;
    }

    void update_height(TNode2 n2) {
        n2.height = 1 + Math.max(get_height(n2.get_left()), get_height(n2.get_right()));
    }

    int balance_factor(TNode2 n1) {
        return n1 == null ? 0 : get_height(n1.get_left()) - get_height(n1.get_right());
    }


    public void delete(int data) {
        TNode2 curr = root;
        TNode2 parent = null;
        if (curr == null) {
            System.out.println("UNDER-FLOW");
            return;
        }
        while (curr != null && curr.get_data() != data) {
            parent = curr;
            if (data < curr.get_data()) {
                curr = curr.get_left();
            } else {
                curr = curr.get_right();
            }
        }
        if (curr == null) {
            System.out.println("Node Not Found!!!");
            return;
        }
        if (curr.get_left() == null || curr.get_right() == null) {

            // 1 child

            TNode2 n1; // replacing the node to delete
            if (curr.get_left() == null) {
                n1 = curr.get_right();
            } else {
                n1 = curr.get_left();
            }

            if (curr == parent.get_left()) {
                parent.set_left(n1);
            } else {
                parent.set_right(n1);
            }
            parent.height = 1 + Math.max(get_height(parent.get_left()), get_height(parent.get_right()));

            int bf=balance_factor(parent);
            if (bf>1 && n1.get_data()<=parent.get_left().get_data()){
                 right_rotate(parent);
            }
            else if(bf>1 && n1.get_data()>parent.get_left().get_data()){
                parent.set_left(left_rotate(parent.get_left()));
                 right_rotate(parent);
            }
            else if (bf<-1 && n1.get_data()>=parent.get_right().get_data()){
                 left_rotate(parent);
            }
            else if (bf<-1 && n1.get_data()<parent.get_right().get_data()){
                parent.set_right(right_rotate(parent.get_right()));
                left_rotate(parent);
            }
        } else {
            TNode2 temp = null;
            TNode2 temp1 = curr.get_right();
            while (temp1.get_left() != null) {
                temp = temp1;
                temp1 = temp1.get_right();
            }
            if (temp != null) {
                temp.set_left(temp.get_right());
            } else {
                curr.set_right(temp1.get_right());
            }
            curr.set_data(temp1.get_data());

        }

    }



    ArrayList<Integer> BottomView() {
        ArrayList<Integer> ans = new ArrayList<>();
        int hd;
        Queue<TNode2> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        root.hd = 0;
        q.add(root);
        while (!q.isEmpty()) {
            TNode2 temp = q.remove();
            hd = temp.hd;
            map.put(hd, temp.get_data());
            if (temp.get_left() != null) {
                temp.get_left().hd = hd - 1;
                q.add(temp.get_left());
            }
            if (temp.get_right() != null) {
                temp.get_right().hd = hd + 1;
                q.add(temp.get_right());
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }


    ArrayList<Integer> TopView() {
        ArrayList<Integer> ans = new ArrayList<>();
        int hd;
        Queue<TNode2> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        root.hd = 0;
        q.add(root);
        while (!q.isEmpty()) {
            TNode2 temp = q.remove();
            hd = temp.hd;
            if (map.containsKey(hd)) {
                continue;
            } else {
                map.put(hd, temp.get_data());
            }
            if (temp.get_left() != null) {
                temp.get_left().hd = hd - 1;
                q.add(temp.get_left());
            }
            if (temp.get_right() != null) {
                temp.get_right().hd = hd + 1;
                q.add(temp.get_right());
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    TNode2 insert(TNode2 n2, TNode2 n1) {
        if (n2 == null) {
            root = n1;
            return root;
        }
        if (n1.get_data() < n2.get_data()) {
            n2.set_left(insert(n2.get_left(), n1));
        } else {
            n2.set_right(insert(n2.get_right(), n1));
        }
        n2.height = 1 + Math.max(get_height(n2.get_left()), get_height(n2.get_right()));

        int bf=balance_factor(n2);
        if (bf>1 && n1.get_data()<=n2.get_left().get_data()){
           return right_rotate(n2);
        }
        else if(bf>1 && n1.get_data()>n2.get_left().get_data()){
            n2.set_left(left_rotate(n2.get_left()));
            return right_rotate(n2);
        }
        else if (bf<-1 && n1.get_data()>=n2.get_right().get_data()){
            return left_rotate(n2);
        }
        else if (bf<-1 && n1.get_data()<n2.get_right().get_data()){
            n2.set_right(right_rotate(n2.get_right()));
            return left_rotate(n2);
        }
        return n2;
    }

    public void preorder(TNode2 curr) {
        if (curr != null) {
            System.out.println(curr.get_data());
            preorder(curr.get_left());
            preorder(curr.get_right());
        }
    }

    public void postorder(TNode2 curr) {
        if (curr != null) {
            postorder(curr.get_left());
            postorder(curr.get_right());
            System.out.println(curr.get_data());
        }
    }

    public void inorder(TNode2 curr) {
        if (curr != null) {
            inorder(curr.get_left());
            System.out.println(curr.get_data());
            inorder(curr.get_right());

        }
    }

    void search(int data) {
        TNode2 curr = root;
        boolean flag = false;
        while (curr != null) {
            if (curr.get_data() == data) {
                flag = true;
                break;
            } else {
                if (data < curr.get_data()) {
                    curr = curr.get_left();
                } else {
                    curr = curr.get_right();
                }
            }
        }
        if (flag) {
            System.out.println("Element Found");
        } else {
            System.out.println("NOT FOUND!!!");
        }
    }



    int height(TNode2 root) {
        TNode2 curr = root;
        int h = 0;
        if (root == null) {
            h = 0;
        } else {
            h = Math.max(height(curr.get_left()), height(curr.get_right()));
        }
        return h + 1;
    }


    public void path(int data) {
        TNode2 curr = root;
        boolean flag = false;
        int patharr[] = new int[10];
        int i = 0;
        if (root == null) {
            System.out.println("Tree empty");
        } else {
            while (curr != null) {
                patharr[i] = curr.get_data();
                i++;
                if (curr.get_data() == data) {
                    flag = true;
                    break;
                } else if (data < curr.get_data()) {
                    curr = curr.get_left();
                } else {
                    curr = curr.get_right();
                }

            }
        }
        if (flag) {
            for (int j = 0; j < i; j++) {
                System.out.println(patharr[j] + " ");
            }
        }

    }

    public void levelOrder() {
        if (root == null) {
            System.out.println("Empty");
            return;
        }
        Queue<TNode2> q1 = new LinkedList<>();
        q1.add(root);
        TNode2 curr = root;
        while (!q1.isEmpty()) {
            curr = q1.peek();
            q1.remove();
            System.out.println(curr.get_data());
            if (curr.get_left() != null) {
                q1.add(curr.get_left());
            }
            if (curr.get_right() != null) {
                q1.add(curr.get_right());
            }
        }

    }

    static int lca(TNode2 root, int data1, int data2) {
        if (root == null) {
            return -1;
        }
        if (data1 < root.get_data() && data2 < root.get_data()) {
            return lca(root.get_left(), data1, data2);
        }
        if (data1 > root.get_data() && data2 > root.get_data()) {
            return lca(root.get_right(), data1, data2);
        }
        return root.get_data();
    }


    public static void main(String[] args) {
        AVL_tree t1 = new AVL_tree();
        TNode2 n1 = new TNode2(10);
        TNode2 n2 = new TNode2(12);
        TNode2 n3 = new TNode2(16);
        //TNode2 n4 = new TNode2(22);

        t1.root=t1.insert(t1.root,n1);
        t1.root=t1.insert(t1.root,n2);
        t1.root=t1.insert(t1.root,n3);
        //t1.root=t1.insert(t1.root,n4);

        t1.inorder(t1.root);

    }
}

class TNode2 {
    TNode2 left;
    TNode2 right;
    int hd;
    int data;
    int height = 1;

    TNode2(int data1) {
        data = data1;
        left = null;

        right = null;
    }

    TNode2 get_left() {
        return left;
    }

    TNode2 get_right() {
        return right;
    }

    int get_data() {
        return data;
    }

    void set_left(TNode2 left1) {
        left = left1;
    }

    void set_right(TNode2 right1) {
        right = right1;
    }

    void set_data(int d1) {
        data = d1;
    }


}
