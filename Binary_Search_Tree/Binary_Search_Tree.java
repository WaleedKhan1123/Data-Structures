/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary_search_tree;

/**
 *
 * @author Hp
 */
public class Binary_Search_Tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BST b = new BST ();
       b.insert(10);
       b.insert(12);
       b.insert(1);
        b.preOrder();
        System.out.println(b.Search(14));
    }
    
}
