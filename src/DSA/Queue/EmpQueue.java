package DSA.Queue;

public class EmpQueue {
//
//    private EmployeeNode head;
//    private EmployeeNode tail;
//    private int size;
//
//    public EmpQueue() {
//        this.head = null;
//        this.tail = null;
//        this.size = 0;
//    }
//
//    public void enqueue(Employee employee) {
//        EmployeeNode newNode = new EmployeeNode(employee);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//        } else {
//            tail.setNext(newNode);
//            tail = newNode;
//        }
//        size++;
//    }
//
//    public Employee dequeue() {
//        if (isEmpty()) {
//            System.out.println("The queue is empty");
//            return null;
//        }
//        Employee employee = head.getData();
//        head = head.getNext();
//        if (head == null) {
//            tail = null;
//        }
//        size--;
//        return employee;
//    }
//
//    public Employee peek() {
//        if (head == null) return null;
//        return head.getData();
//    }
//
//    public boolean isEmpty() {
//        return head == null;
//    }
//
//    public int size() {
//        return size;
//    }

    private EmployeeNode head,tail;
    public EmpQueue()
    {
        head=tail=null;
    }
    public boolean isEmpty()
    {
        return head == null;
    }
    public EmployeeNode getHead() {
        return head;
    }
    public EmployeeNode getTail() {
        return tail;
    }
public void enQueue(Employee obj)
{
    EmployeeNode  newNode = new EmployeeNode(obj);
    if (this.isEmpty())
    {
        head=tail=newNode;
        return;
    }
    this.tail.setNext(newNode);
    this.tail=newNode;
}

public void deQueue(){
        if (this.isEmpty())
            return;
        if (this.head==this.tail)
        {
            this.head=this.tail=null;
            return;
        }
        this.head=this.head.getNext();

}
}