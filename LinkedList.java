public class LinkedList<T> {
    class Node{

        T data;
        Node next;

    }
    Node Start;

    public void insetAtStart(T Value){
     Node n = new Node();
     n.data=Value;

     if(Start==null){
        Start=n;
    }

     else{
      n.next=Start;
      Start = n;
     }
    }

    public void insertAtEnd(T Value){
          Node n = new Node();
          n.data = Value;
          if(Start==null){
             Start=n;
          }
          else{
            Node _t = Start;
            while(_t.next!=null){
              _t=_t.next;
            }
            _t.next = n;
          }
    }
    public void insertAfter(){
        
    }
    public T deletAtStart(){
        return null;
    }
    public T deletAtEnd(){
        return null;
    }
    public T deletNode(){
        return null;
    }


    public boolean searchNode(){


        return false;
    }

    public void print(){
     if (Start==null) {
        System.out.println("List is empty");
     }
     else{
        Node _t =Start;
        while (_t!=null){
          System.out.print(_t.data + "=>");
          _t = _t.next;
        }
    System.out.println("null");
     }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.print(); 
        list.insetAtStart(10);
        list.print();
        list.insetAtStart(2);
        list.print();
        list.insertAtEnd(6);
        list.insertAtEnd(102);
        list.print();
    }
}
