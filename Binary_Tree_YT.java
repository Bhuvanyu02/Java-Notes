import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree_YT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void lvlOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static int CountNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int LeftNodes = CountNodes(root.left);
        int RightNodes = CountNodes(root.right);
        return LeftNodes + RightNodes + 1;
    }

    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int LeftSum = Sum(root.left);
        int RightSm = Sum(root.right);
        return LeftSum + RightSm + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int Lh = height(root.left);
        int Rh = height(root.right);
        int ans = Math.max(Lh, Rh) + 1;
        return ans;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int d1 = diameter(root.left);
        int d2 = diameter(root.right);
        int d3 = height(root.left) + height(root.right) + 1;
        return Math.max(d3, Math.max(d1, d2));
    }

    static class TreeInfo{
        int ht;
        int dia;
        TreeInfo(int a,int b){
            this.ht=a;
            this.dia=b;
        }
    }
    public static TreeInfo diameter2(Node root){
        if (root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);

        int ht= Math.max(left.ht,right.ht)+1;

        int d1= left.dia;
        int d2=right.dia;
        int d3= left.ht+right.ht+1;

        int dia=Math.max(d3, Math.max(d1, d2));

        TreeInfo myInfo=new TreeInfo(ht,dia);
        return myInfo;

    }

    

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(diameter2(root).dia);
    }
}
