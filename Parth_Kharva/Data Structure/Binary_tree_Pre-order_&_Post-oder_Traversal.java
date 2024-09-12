/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary_tree_creation_insert_traversal;

import binary_tree_creation_insert_traversal.Binary_tree_creation_insert_traversal.Tree.Node;

/**
 *
 * @author Parthkharva
 */
public class Binary_tree_creation_insert_traversal {

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
                System.out.println(" "+node.value);;
            }
        }
    }

}
