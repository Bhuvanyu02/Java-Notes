import java.util.*;

public class Tree {
    TNode root = null;

    ArrayList<Integer> BottomView() {
        ArrayList<Integer> ans = new ArrayList<>();
        int hd;
        Queue<TNode> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        root.hd = 0;
        q.add(root);
        while (!q.isEmpty()) {
            TNode temp = q.remove();
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
        Queue<TNode> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        root.hd = 0;
        q.add(root);
        while (!q.isEmpty()) {
            TNode temp = q.remove();
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

    public void insert(TNode n1) {
        if (root == null) {
            root = n1;
        } else {
            TNode curr = root;
            TNode parent = null;
            while (true) {
                parent = curr;
                if (n1.get_data() < curr.get_data()) {
                    curr = curr.get_left();
                    if (curr == null) {
                        parent.set_left(n1);
                        return;
                    }
                } else {
                    curr = curr.get_right();
                    if (curr == null) {
                        parent.set_right(n1);
                        return;
                    }
                }
            }
        }
    }

    public void preorder(TNode curr) {
        if (curr != null) {
            System.out.println(curr.get_data());
            preorder(curr.get_left());
            preorder(curr.get_right());
        }
    }

    public void postorder(TNode curr) {
        if (curr != null) {
            postorder(curr.get_left());
            postorder(curr.get_right());
            System.out.println(curr.get_data());
        }
    }

    public void inorder(TNode curr) {
        if (curr != null) {
            inorder(curr.get_left());
            System.out.println(curr.get_data());
            inorder(curr.get_right());

        }
    }

    void search(int data) {
        TNode curr = root;
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

    public void delete(int data) {
        TNode curr = root;
        TNode parent = null;
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

            TNode newn; // replacing the node to delete
            if (curr.get_left() == null) {
                newn = curr.get_right();
            } else {
                newn = curr.get_left();
            }

            if (curr == parent.get_left()) {
                parent.set_left(newn);
            } else {
                parent.set_right(newn);
            }
        } else {
            TNode temp = null;
            TNode temp1 = curr.get_right();
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

    int height(TNode root) {
        TNode curr = root;
        int h = 0;
        if (root == null) {
            h = 0;
        } else {
            h = Math.max(height(curr.get_left()), height(curr.get_right()));
        }
        return h + 1;
    }

    public void path(int data) {
        TNode curr = root;
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
        Queue<TNode> q1 = new LinkedList<>();
        q1.add(root);
        TNode curr = root;
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


    static int lca(TNode root, int data1, int data2) {
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
        Tree t1 = new Tree();
        TNode n1 = new TNode(50);
        TNode n2 = new TNode(25);
        TNode n3 = new TNode(15);
        TNode n4 = new TNode(30);
        TNode n5 = new TNode(75);
        TNode n6 = new TNode(85);
        TNode n7 = new TNode(95);


        t1.insert(n1);
        t1.insert(n2);
        t1.insert(n3);
        t1.insert(n4);
        t1.insert(n5);
        t1.insert(n6);
        t1.insert(n7);

        //  t1.path(15);

        // t1.inorder(t1.root);

        // t1.search(85);
        // t1.delete(50);
        // t1.inorder(t1.root);
        // System.out.println(t1.height(t1.root));
        ArrayList<Integer> ans = t1.TopView();
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }


    }
}

class TNode {
    TNode left;
    TNode right;
    int hd;
    int data;

    TNode(int data1) {
        data = data1;
        left = null;

        right = null;
    }

    TNode get_left() {
        return left;
    }

    TNode get_right() {
        return right;
    }

    int get_data() {
        return data;
    }

    void set_left(TNode left1) {
        left = left1;
    }

    void set_right(TNode right1) {
        right = right1;
    }

    void set_data(int d1) {
        data = d1;
    }


}
