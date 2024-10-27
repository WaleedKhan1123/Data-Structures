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
    public void insertAfter(T key,T Value){
        if(Start==null){
            System.out.println("List is Empty");
        }
        else{
            Node _t =Start;
            while(_t!=null){
                     if(_t.data==key){
                        Node n = new Node();
                        n.data = Value;
                        n.next= _t.next;
                        _t.next=n;
                        return;
                     }
                _t = _t.next;

            }
            System.out.println("Key not Found");
        }
    }
    public T deletAtStart(){
        if(Start==null){
           System.out.println("List is empty");
           return null;
        }
        else{
           T data = Start.data;
           Start= Start.next;
           return data;
        }
        
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
        list.insertAfter(102, 3);
        list.print();
        list.insertAfter(6, 7);
        list.deletAtStart();
        list.deletAtStart();
        list.print();

    }
}
