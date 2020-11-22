package DataStructure;

import java.util.Scanner;

class treeNode{
    int data;
    treeNode left;
    treeNode right;
    public treeNode(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class Tree{
    private treeNode root;
    public Tree(){
        root = createTree();
    }

    public treeNode getRoot(){
        return root;
    }

    public treeNode createTree(){
        treeNode r = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data :");
        int data = sc.nextInt();
        if(data == -1) return null;

        r = new treeNode(data);

        System.out.println("Enter left for "+data);
        r.left = createTree();

        System.out.println("Enter right for "+data);
        r.right = createTree();
        
        return r;
    }

    public void inorder(treeNode r){
        if(r == null) return;
        inorder(r.left);
        System.out.print(r.data+" ");
        inorder(r.right);
    }
    public void preorder(treeNode r){
        if(r == null) return;
        System.out.print(r.data+" ");
        preorder(r.left);
        preorder(r.right);
    }

    public void postorder(treeNode r){
        if(r == null) return;
        postorder(r.left);
        postorder(r.right);
        System.out.print(r.data+" ");
    }
    
}
public class binaryTree{
    public static void main(String[] args) {
        Tree t = new Tree();

        System.out.println("Pre Order : ");
        t.preorder(t.getRoot());

        System.out.println("\nIn order : ");
        t.inorder(t.getRoot());

        System.out.println("\nPost order : ");
        t.postorder(t.getRoot());

    }
}