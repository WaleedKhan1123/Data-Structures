/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avl_tree;

/**
 *
 * @author Hp
 */
public class Tree {

    class node {

        int data;
        int height;
        node right;
        node left;
    }
    node root;

    public boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }

    public void insert(int value) {
         insertRec(root, value);

    }

    private void insertRec(node n1, int value) {
        node n = new node();
        n.data = value;
        if (isEmpty()) {

            root = n;
            
        } else {

            if (n1.data > value) {
                if (n1.left == null) {
                    n1.left=n;
                }
                 else{
                                    
                                               
                  insertRec(n1.left, value);
                                    
                                    }
                }
             else {
                if (n1.right == null) {
                   n1.right=n; 
                }
                else{
                 insertRec(n1.right, value);
            }
            }

        }
       
    }

    public boolean Search( int key) {
    return searchRec(root,key);
    }

    private boolean searchRec(node n,int key) {
        if(isEmpty()){
            
            return false;
        }
        
        else if(n!=null){
            if(n.data==key){
                
                return true ;
            }
            else if(n.data>key){
              return  searchRec(n.left,key);
              
                
            }
            else{
              return  searchRec(n.right,key);
              
            }
        }
        
      return false;
    }
    public int delete(int key){
        
        return deleteRec(root,key);
    }
    private int deleteRec(node n,int key){
        if(isEmpty()){
            System.out.println("Tree Empty");
            return 0;
        }
        else if 
    }
    


    public void inOrder(node n) {
        if (isEmpty()) {
            System.out.println("Tree is Empty");
        } else {

            inOrder(n.left);
            System.out.print(n.data + "=>");
            inOrder(n.right);
        }
    }

    public void preOrder() {
        preRec(root);
    }

    private void preRec(node n) {
        if (n != null) {
            preRec(n.left);
            System.out.print(n.data + "=>");
            preRec(n.right);
        }
    }

    public void postOrder(node n) {
        if (isEmpty()) {
            System.out.println("Tree is Empty");
        } else {
            postOrder(n.left);
            postOrder(n.right);
            System.out.print(n.data + "=>");

        }
    }
}
