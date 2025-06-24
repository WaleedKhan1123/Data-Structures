/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular_linkedlist;

/**
 *
 * @author Hp
 */
public class LinkedList<T>
{
    //you must have a general idea of this data structure in order to understand code
    class Node // class containing node objects
    {

        T data; // data which will contain node value
        Node next; // next is a reference variable which holds reference of the next node
        Node previous; // previous is a reference variable which holds reference of the previous node
    }
    Node Start; // start holds the reference of the starting node
    Node End; // end refers to the end node of the list

    public void insertAtStart(T Value) // for insertion of node at Start
    {
        Node n = new Node(); // create node object
        n.data = Value; // assign value to the node 
        if (Start == null) // when there is no node in the list
        {
            Start =End= n;     // start and end refers to n node
            
        } else if (Start == End//when there is one node in the list
        {
            n.next = Start;      // next of n node refers to start
            Start.previous = n;  // previous of start node refers to n node
            n.previous = Start;  // previous of n node refers to start
            Start = n;           // start refers to n node    
            End.next = Start;    // the next of end refers to start
                                 // remeber sequence is very important
        } else // when there is more than one node
        {
            n.next = Start;    
            Start.previous = n;
            Start = n;
            Start.previous = End;
            End.next = Start;
        }
    }

    public void insertAtEnd(T Value) // for insertion of node at end
    { 
        Node n = new Node();
        n.data = Value;
        if (Start == null)
        {
            Start =End=n;
        } else      
        {
            // same logic as in the previous method
            End.next = n;           
            n.previous = End;  
            n.next = Start;
            End = n;
            Start.previous = End;
        }
    }

    public void insertAfter(T Key, T Value) // for insertion after a key node
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return;
        } else
        {
            Node _t1 = Start; // temporary node 
            do                // loop to find the key node
            {
                if (_t1.data == Key)  //if key is found
                {
                    Node n = new Node();
                    n.data = Value;
                    if (_t1 == Start)   // if key node is at start
                    {
                        if (Start == End) // if there is only one node
                        {
                            Start.next = n;
                            n.previous = Start;
                            n.next = Start;
                            Start.previous = n;
                            End = n;
                        } else  // for more than one node
                        {
                            n.next = Start.next;
                            Start.next.previous = n;
                            Start.next = n;
                            n.previous = Start;
                        }
                        return;
                    } else if (_t1 == End) //if key node is found at the end node
                    {
                        End.next = n;
                        n.previous = End;
                        n.next = Start;
                        Start.previous = n;
                        End = n;
                    } else // if key node is in betweeen
                    {
                        n.next = _t1.next;
                        _t1.next.previous = n;
                        _t1.next = n;
                        n.previous = _t1;
                    }
                    return;
                }
                _t1 = _t1.next;  // mpove tempory node through the list
            } while (_t1 != Start);
            System.out.println("Key not found");   // exedutes when key node is not found
        }
    }

    public T deleteAtStart() // for deletion at start
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return null;
        } else if (Start == End)
        {
            T val = Start.data;   // store start value in a variable
            Start = End = null;   // start and end becomes null as there was only one node
            return val;           
        } else
        {
            T val = Start.data;  
            Start = Start.next;  // start refers to the node next to start
            Start.previous = End; // previous of start is then reffered to end
            End.next = Start;  // the next of end is then reffered to the new start
            return val;

        }
    }

    public T deleteAtEnd() // for deletion of node at end
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return null;
        } else if (Start == End)
        {
            T val = Start.data;
            Start = End = null;
            return val;
        } else
        { // same logic as in the previous methods
            T val = End.data;
            End.previous.next = Start;
            End = End.previous;
            Start.previous = End;
            return val;
        }
    }

    public T deleteNode(T key) // for deletion of any node in the list
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return null;
        } else
        {
            Node _t = Start;
            do
            {
                // same logic as in the previous mehtods
                if (_t.data == key)
                {
                    if (key == Start.data)
                    {
                        Start = Start.next;
                        Start.previous = End;
                        End.next = Start;
                        return key;
                    } else if (key == End.data)
                    {
                        End.previous.next = Start;
                        End = End.previous;
                        Start.previous = End;
                        return key;
                    } else
                    {
                        _t.previous.next = _t.next;
                        _t.next.previous = _t.previous;
                        _t = null;
                        return key;
                    }
                }
                _t = _t.next;
            } while (_t != Start);
            System.out.println("List not found");
            return null;
        }
    }

    public boolean Search(T key) // to search the presence of a node
    {
        if (Start == null)
        {
            return false;
        } else
        {
            Node _t = Start;
            do
            {
                if (_t.data == key)
                {
                    return true;
                }
                _t = _t.next;
            } while (_t != Start);
            return false;
        }
    }

    public void print() // for displaying linked list
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return;
        } else if (Start == End)
        {
            System.out.print(Start.data + "=>");
        } else
        {

            Node _t1 = Start;
            do
            {
                System.out.print(_t1.data + "=>");
                _t1 = _t1.next;
            } while (_t1 != Start);
            System.out.println("Null");
        }
    }
}
