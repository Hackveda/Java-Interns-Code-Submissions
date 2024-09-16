package com.vivek.javacodes7;

public class MyTreeTest3 
{
     public static void main(String[] args) 
    {
        Tree tree = new Tree();
        Tree.Node root = new Tree.Node(5);
        
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        
        System.out.println("Traverse the tree: ");
        tree.traverseInOrder(root);

        System.out.println("Traverse PreOrder: ");
        tree.traversePreOrder(root);

        System.out.println("Traverse PostOrder: ");
        tree.traversePostOrder(root);
        
        System.out.println("Breadth First Search / Level Order: ");
        tree.bfs(root);
    }
    
    public static class Tree
    {
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
        
        public void insert(Node node, int value)
        {
            if(value < node.value)
            {
                if(node.left != null)
                {
                insert(node.left, value);
                }
                else
                {
                    System.out.println("Insert " + value + " to the left of " + node.value);
                    node.left = new Node(value);
                }
            }
            else if(value > node.value)
            {
                if(node.right != null)
                {
                    insert(node.right, value);
                }
                else
                {
                    node.right = new Node(value);
                    System.out.println("Inserted " + value + " to the right of " + node.value);
                }
            }
        }
        
        public void traverseInOrder(Node node)
        {
            if(node != null)
            {
                traverseInOrder(node.left);
                System.out.println(" " + node.value);
                traverseInOrder(node.right);
            }
        }

        public void traversePreOrder(Node node)
        {
            if(node != null)
            {
                System.out.println(" " + node.value);
                traversePreOrder(node.left);
                traversePreOrder(node.right);
            }
        }

        public void traversePostOrder(Node node)
        {
            if ((node != null))
            {
                traversePostOrder(node.left);
                traversePostOrder(node.right);
                System.out.println(" " + node.value);
            }
        }
        
        public int height(Node root)
        {
            if(root == null)
            {
                return 0;
            }
            else
            {
                int lheight = height(root.left);
                int rheight = height(root.right);
                
                if(lheight > rheight)
                {
                    return(lheight+1);
                }
                else
                {
                    return(rheight+1);
                }
            }
        }
        
        public void printCurrentLevel(Node root, int level)
        {
            if(root == null)
            {
                return;
            }
            
            if(level == 1)
            {
                System.out.println(root.value + " ");
            }
            else if(level > 1)
            {
                printCurrentLevel(root.left, level-1);
                printCurrentLevel(root.right, level-1);
            }
        }
        
        public void bfs(Node root)
        {
            int h = height(root);
            
            for(int i=1; i<=h; i++)
            {
                printCurrentLevel(root, i);
            }
        }
    }
}
