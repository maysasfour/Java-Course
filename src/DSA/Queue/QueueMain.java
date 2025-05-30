package DSA.Queue;

import java.util.ArrayList;

public class QueueMain {
    // print Queue
    public void printQueue(EmpQueue empQueue)
    {
        if (empQueue.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        ArrayList<EmployeeNode>list= new ArrayList<>();
        while (!empQueue.isEmpty())
        {
            list.add(empQueue.getHead());
            System.out.println(empQueue.getHead().getData());
            empQueue.deQueue();
        }
        for (int i = 0; i < list.size(); i++)
        {
            empQueue.enQueue(list.get(i).getData());
        }
    }

    public  static void printRec(EmpQueue empQueue)
    {
        if (empQueue.isEmpty()) {
            System.out.println("empty");
            return;
        }
        EmployeeNode temp = empQueue.getHead();
        empQueue.deQueue();
        System.out.println(temp.getData());
        printRec(empQueue);
        empQueue.enQueue(temp.getData());
    }


    // copy Queue
    // countElement
    // removeEmployee ("Ibrahim")

//    public static void printQueue(EmpQueue empQueue) {
//        if (empQueue.isEmpty()) {
////            System.out.println("Queue is empty");
//            return;
//        }
//
//        EmployeeNode cur = empQueue.getHead();
//        while (cur != null) {
//            System.out.println(cur.getData().toString());
//            cur = cur.getNext();
//        }
//    }
//
//    public static EmpQueue copyQueue(EmpQueue empQueue) {
//        EmpQueue newQueue = new EmpQueue();
//        if (empQueue.isEmpty()) {
//            return newQueue;
//        }
//
//        EmployeeNode cur= empQueue.getHead();
//        while (cur != null) {
//            Employee emp = cur.getData();
//            newQueue.enQueue(new Employee(
//                    emp.getId(),
//                    emp.getName(),
//                    emp.getSalary()
//            ));
//            cur = cur.getNext();
//        }
//        return newQueue;
//    }
//
//    public static int countElement(EmpQueue empQueue) {
//        int count = 0;
//        EmployeeNode cur = empQueue.getHead();
//        while (cur != null) {
//            count++;
//            cur = cur.getNext();
//        }
//        return count;
//    }
//
//    public static void removeEmployee(EmpQueue queue, String name) {
//        if (queue.isEmpty()) {
//            return;
//        }
//
//        while (!queue.isEmpty() && queue.getHead().getData().getName().equals(name)) {
//            queue.deQueue();
//            return;
//        }
//
//        EmployeeNode cur = queue.getHead();
//        while (cur != null && cur.getNext() != null) {
//            if (cur.getNext().getData().getName().equals(name)) {
//                cur.setNext(cur.getNext().getNext());
//                if (cur.getNext() == null) {
//                    queue.getTail();
//                }
//                return;
//            }
//            cur = cur.getNext();
//        }
//    }



    public static void main(String[] args) {
        EmpQueue myEmpQ = new EmpQueue();
        myEmpQ.enQueue(new Employee(1,"Mays",908765.0));
        myEmpQ.enQueue(new Employee(2,"Reem",908765.0));
        myEmpQ.enQueue(new Employee(3,"Kareem",908765.0));
        myEmpQ.enQueue(new Employee(4,"Ibrahim",908765.0));
        myEmpQ.enQueue(new Employee(5,"Tala",908765.0));

        System.out.println("Original Queue:");

        printRec(myEmpQ);

        printRec(myEmpQ);

//        printQueue(myEmpQ);
//
//        System.out.println("\nCopied Queue:");
//        EmpQueue copiedQueue = copyQueue(myEmpQ);
//        printQueue(copiedQueue);
//
//        System.out.println("\nNumber of elements in queue: " + countElement(myEmpQ));
//
//        System.out.println("\nRemoving Ibrahim from queue...");
//        removeEmployee(myEmpQ, "Ibrahim");
//        System.out.println("\nQueue after removing Ibrahim:");
//        printQueue(myEmpQ);
    }
}
