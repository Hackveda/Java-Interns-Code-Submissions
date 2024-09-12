/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package node_creation.trees_basic;

/**
 *
 * @author Parthkharva
 */
public class Node_CreationTrees_basic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node node = new Node(15);
        node.left = new Node(12);
        node.right = new Node(29);
    }
    static class Node{
        int value;
        Node left,right;
        Node(int value){
            this.value = value;
            
            left = null;
            right = null;
        }
    }
    
}
