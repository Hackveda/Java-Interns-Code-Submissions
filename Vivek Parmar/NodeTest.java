package code.vivek.javacodes7;

public class NodeTest 
{
    public static void main(String[] args) 
    {
       Node node = new Node(5);
       node.left = new Node(0);
       node.right = new Node(10);
       System.out.println()
    }
    
    static class Node
    {
        int value;
        
        Node left, right;
        
        Node(int value)
        {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
