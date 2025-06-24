/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_search_tree;

/**
 *
 * @author Hp
 */
public class BST {

    class node {

        int data;
        node left;
        node right;
    }
    node root;

    private boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }

    public void insert(int value) {
        
        node n = new node();
        n.data = value;
        if(isEmpty()){
            root=n;
        }
        else{
        node _t = insertRec(root, value);
        if (_t.data > n.data) {
            _t.left = n;
        } else {
            _t.right = n;
        }
        }
    }

    private node insertRec(node n, int value) {

        if (isEmpty()) {

            return root;
        } else {
            node _t = null;
            if (n != null) {
                if (n.data <= value) {
                    if (n.right != null) {
                        _t = insertRec(n.right, value);
                    } else {
                        return n;
                    }
                } else if (n.data > value) {
                    if (n.left != null) {
                        _t = insertRec(n.left, value);
                    } else {
                        return n;
                    }
                }
            }
            return _t;

        }
    }
    public boolean Search(int Key){
       return Search(root,Key);
    }

    private boolean Search(node n, int key) {
        if(isEmpty())
            return false;
        else{
            if(n.data==key)
                return true;
            else if(n.data>key)
                return Search(n.left,key);
            else {
                return Search(n.right,key);
            }           
        }
        
        
    }

    public int delete(node n, int key) {
        
       node _t= deleteRec(root, key);
       return _t.data;
    }
    
    private node deleteRec(node n,int key){
        node _t=null;
        if(isEmpty()){
            System.out.println("Tree is Empty");
            return null;
        }
        else{
             if(n.data>key){
              _t=deleteRec(n.left,key);  
            }
            else if(n.data<key){
                _t=deleteRec(n.right,key);
            }
            else{
             
        
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            
            n.data = successor(n.right);
            n.right = deleteRec(n.right, n.data);
        }

            }
        return n;
        }
    

    private int successor(node n) {
        int suc = n.data;
        node _t = n;
        
            while (_t.left!= null) {
                suc = _t.data;
                _t = _t.left;
            }
        
        return suc;
    }

    public void inOrder(node n) {
        if (n != null) {

            inOrder(n.left);
            System.out.print(n.data + "=>");
            inOrder(n.right);
        }
    }

    public void preOrder() {
        preorderRec(root);
    }

    private void preorderRec(node root) {
        if (root == this.root) {
            System.out.print("PreOrder => ");
        }
        if (root != null) {
            System.out.print(root.data + "=>");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void postOrder(node n) {
        if (n != null) {

            postOrder(n.left);
            postOrder(n.right);
            System.out.print(n.data + "=>");
        }
    }

}
