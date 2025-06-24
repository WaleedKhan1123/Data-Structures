/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avl_tree;

/**
 *
 * @author Hp
 */
public class AVL_Tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree t = new Tree();
        t.insert(3);
        t.insert(4);
        t.insert(9);
        t.insert(21);
        t.insert(1000);
        t.insert(10);
        
        t.preOrder();
        System.out.println();
        System.out.println("root: "+t.root.data);
        System.out.println(t.Search(10));
    }
    
}
