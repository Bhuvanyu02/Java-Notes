// tree empty ->  root is black
//  leaf node -> red
// parent black -> exit (no red-red conflict)
// if parent red, then check color parent sibling(uncle)
//  case 1 -> if uncle is black/null, do suitable rotation and re-color grandparent and parent and re-check
// case2 -> if uncle is red, re-color(parent and uncle) and also check parent's parent(grandparent) is not root node and re-color, re-check

public class Red_Black_Tree {
    public RB Root = null;

    void insert(RB n1) {
        RB curr = Root;
        RB parent = null;

        while (curr != null) {
            parent = curr;
            if (curr.data < n1.data) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        n1.color = false;
        if (parent == null) {
            Root = n1;
        } else if (n1.data < parent.data) {
            parent.left = n1;
        } else {
            parent.right = n1;
        }
        n1.parent = parent;
        fixRedBlack(n1);
    }

    void fixRedBlack(RB n1) {
        RB parent=n1.parent;
        if (parent==null){
            n1.color=true;
            return;
        }
        if (parent.color==true){
            return;
        }
        RB grandparent=parent.parent;
        if (grandparent==null){
            parent.color=true;
            return;
        }

        RB uncle=getUncle(parent);
        if(uncle != null && uncle.color == false){
            parent.color=true;
            uncle.color=true;
            grandparent.color=false;
            fixRedBlack(grandparent);
        }
        else if (parent==grandparent.left){
            if (n1==parent.right) {
                rotateLeft(parent);
                parent = n1;
            }
                rotateRight(grandparent);
                parent.color=true;
                grandparent.color=false;
        }
        else{
            if (n1==parent.left) {
                rotateLeft(parent);
                parent = n1;
            }
            rotateRight(grandparent);
            parent.color=true;
            grandparent.color=false;
        }
    }

    void rotateLeft(RB n1){
        RB parent=n1.parent;
        RB rightC=n1.right;
        n1.right=rightC.left;
        if (rightC.left!=null){
            rightC.left.parent=n1;
        }
        rightC.left=n1;
        n1.parent=rightC;
        fixParentNodeChild(parent,n1,rightC);

    }
    void rotateRight(RB n1){
        RB parent=n1.parent;
        RB leftC=n1.left;
        n1.left=leftC.right;
        if (leftC.right!=null){
            leftC.right.parent=n1;
        }
        leftC.right=n1;
        n1.parent=leftC;
        fixParentNodeChild(parent,n1,leftC);

    }
   void  fixParentNodeChild(RB parent,RB oldchild,RB newchild){
        if (parent==null){
            parent=newchild;
        }
       else if (parent.left==oldchild){
            parent.left=newchild;
        }
        else if(parent.right==oldchild){
            parent.right=newchild;
        }
        if (newchild!=null){
            newchild.parent=parent;
        }

   }


    RB getUncle(RB n1){
        RB grandparent=n1.parent;
        if (n1==grandparent.left){
            return grandparent.left;
        }
        else{
            return grandparent.right;
        }

    }

    void inOrder(RB Root){

        if (Root!=null){
            inOrder(Root.left);
            System.out.println(Root.data);
            inOrder(Root.right);
        }

    }

    public static void main(String[] args) {
        Red_Black_Tree t= new Red_Black_Tree();
        RB n1 = new RB(10);
        RB n2 = new RB(18);
        RB n3 = new RB(7);
        RB n4 = new RB(15);
        RB n5 = new RB(16);
        RB n6 = new RB(30);
        RB n7 = new RB(25);
        RB n8 = new RB(40);
        RB n9 = new RB(60);


        t.insert(n1);
        t.insert(n2);
        t.insert(n3);
        t.insert(n4);
        t.insert(n5);
        t.insert(n6);
        t.insert(n7);
        t.insert(n8);
        t.insert(n9);

        t.inOrder(t.Root);




    }
}

class RB {
    int data;
    RB left;
    RB right;
    RB parent;
    boolean color;

    RB(int d) {
        data = d;
        left = null;
        right = null;
    }

}
