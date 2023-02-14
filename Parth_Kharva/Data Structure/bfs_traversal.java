/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bfs_traversal;

import bfs_traversal.Bfs_traversal.Tree.Node;

/**
 *
 * @author Parthkharva
 */
public class Bfs_traversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(50);
        tree.insert(root, 12);
        tree.insert(root, 1);
        tree.insert(root, 26);
        tree.insert(root, 10);
        tree.insert(root, 2);
        tree.insert(root, 62);
        tree.insert(root, 152);
        tree.insert(root, 129);
        tree.insert(root, 17);
        tree.insert(root, 100);
        
        System.out.println("Travers the tree :");
        tree.traversal_inorder(root);
        
        System.out.println("Travers the tree in pre-order :");
        tree.traversal_preorder(root);
        
        System.out.println("Travers the tree in post-order :");
        tree.traversal_postorder(root);
        
        System.out.println("Breadth First Search / Level Order :");
        tree.bfs(root);
    }

    public static class Tree {

        static class Node {

            int value;
            Node left, right;

            Node(int value) {
                this.value = value;

                left = null;
                right = null;
            }

        }
        public void insert(Node node,int value){
            if(value<node.value){
                if(node.left != null){
                    insert(node.left,value);
                }
                else{
                    System.out.println("Insert "+value +" to the left of "+node.value+".");
                    node.left = new Node(value);
                }
            }
            else if(value>node.value){
                if(node.right != null){
                    insert(node.right,value);
                }
                else{
                    System.out.println("Insert "+value +" to the right of "+node.value+".");
                    node.right = new Node(value);
                }
            } 
        }
        
        public void traversal_inorder(Node node){
            if(node != null){
                traversal_inorder(node.left);
                System.out.println(" "+node.value);
                traversal_inorder(node.right);
            }
        }
        public void traversal_preorder(Node node){
            if(node != null){
                System.out.println(" "+node.value);
                traversal_inorder(node.left);
                traversal_inorder(node.right);
            }
        }
        public void traversal_postorder(Node node){
            if(node != null){
                traversal_inorder(node.left);
                traversal_inorder(node.right);
                System.out.println(" "+node.value);
            }
        }
        
        public int height(Node root){
            if(root == null){
                return 0;
            }
            else{
                int left_height = height(root.left);
                int right_height = height(root.right);
                if(left_height > right_height){
                    return(left_height + 1);
                }
                else{
                    return(right_height + 1);
                }
            }
        }
        public void printCurrentlevel(Node root, int level){
            if(root == null){
                return;
            }
            if(level == 1){
                System.out.println(root.value + " ");
            }
            else if(level<1){
                printCurrentlevel(root.left,level-1);
                printCurrentlevel(root.right,level-1);
            }
        }
        public void bfs(Node root){
            int h = height(root);
            for(int i=1; i<=h; i++){
                printCurrentlevel(root,i);
            }
        }
    }
    
}
