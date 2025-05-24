package DSA;

public class MainDemo {

    // write none member method that copy two linkedList

    // public static void copy(first,second) //copy first LinkedList to the second one
    public static void copy(LinkedList first, LinkedList second) {
//    if (first == null || second == null) return;
//
//    int size = first.getSize();
//
//    for (int i = 0; i < size; i++) {
//        EmployeeNode cur = first.getNode(i);
//        if (cur != null) {
//            EmployeeNode newNode = new EmployeeNode(cur.getObjEmp(), cur.getDate());
//            second.addLast(newNode);
//        }

//    }
        if (first.isEmpty())
            return;
        int size= first.getSize();
        for (int i = 0; i<size;i++)
        {
            second.addLast(first.getNode(i));
        }
    }

    // print none member method
    public static void print(LinkedList list) {
//        if (list == null) return;
//
//        for (int i = 0; ; i++) {
//            EmployeeNode node = list.getNode(i);
//            if (node == null) break;
//            System.out.println(node);
//        }
        int size =list.getSize();
        for (int i = 0; i<size;i++)
        {
            System.out.println(list.getNode(i));
        }
    }

    // countRec don't use getSize it must be none member
//public static int countRec(EmployeeNode node) {
//    if (node == null) return 0;
//    return 1 + countRec(node.getNext());
//}
    public static int countRec(LinkedList first,int count)
    {
        if (first.getNode(count)!=null)
        {
        return  countRec(first,count+1);
        }
        return count;
    }

    public static int countRec(LinkedList first)
    {
        return countRec(first,0);

    }


// reverse Rec none member
//public static EmployeeNode reverseRec(EmployeeNode node) {
//    if (node == null || node.getNext() == null) return node;
//
//    EmployeeNode newHead = reverseRec(node.getNext());
//    node.getNext().setNext(node);
//    node.setNext(null);
//    return newHead;
//}

    public static void reverseRec(LinkedList list)
    {
        if (list.isEmpty())
            return;
        EmployeeNode temp =list.getNode(0);
        list.RemoveFirst();
        reverseRec(list);
        list.addFirst(temp);
    }
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.addFirst(new EmployeeNode(new Employee("Mays","25046814",1000),new Date(22,5,2025)));
        myList.RemoveFirst();
        myList.RemoveLast();
        myList.removeNode("Kareem");

        myList.print();
        System.out.println("*********");
        myList.addFirst(new EmployeeNode(new Employee("Reem","25046814",1000),new Date(22,5,2025)));
        myList.addFirst(new EmployeeNode(new Employee("Kareem","25046814",1000),new Date(22,5,2025)));
        myList.print3Nodes();
        System.out.println("***************");
        myList.print();
        System.out.println("***************");

//        myList.addBetween(new EmployeeNode(new Employee("Ahmad","25046814",1000),new Date(22,5,2025)));
//        myList.addBetween(new EmployeeNode(new Employee("eslam","25046814",1000),new Date(22,5,2025)));
        myList.addLast(new EmployeeNode(new Employee("Saleem","25046814",1000),new Date(22,5,2025)));
        myList.print();
        System.out.println("***************");
        myList.addAfterIndex(new EmployeeNode(new Employee("test","25046814",1000),new Date(22,5,2025)),2);
        myList.print3Nodes();
        System.out.println("***************");
        EmployeeNode test = new EmployeeNode(new Employee("Tala","25046814",1000),new Date(22,5,2025));
        myList.print();



        System.out.println(countRec(myList));
        System.out.println("***************");
        reverseRec(myList);
        myList.print();

//        // Create and populate the original list
//        LinkedList list1 = new LinkedList();
//        list1.addFirst(new EmployeeNode(new Employee("test1","25046814",1000),new Date(22,5,2025)));
//        list1.addFirst(new EmployeeNode(new Employee("test2","25046814",1000),new Date(22,5,2025)));
//        list1.addFirst(new EmployeeNode(new Employee("test3","25046814",1000),new Date(22,5,2025)));
//
//        // print (LinkedList)
//        System.out.println("Original List:");
//        LinkedList.print(list1);
//
//        // copy (LinkedList,LinkedList)
//        LinkedList list2 = new LinkedList();
//        LinkedList.copy(list1, list2);
//
//        // Print the copied list
//        System.out.println("\nCopied List:");
//        LinkedList.print(list2);
//
//        //CountRec(LinkedList)
//        int count = LinkedList.countRec(list1.getNode(0));
//        System.out.println("\nCount (Recursive): " + count);
//
//        //reverseLinkedList (LinkedList)
//        LinkedList.reverseList(list1);
//
//        // Print the reversed original list
//        System.out.println("\nReversed Original List:");
//        LinkedList.print(list1);
    }
}
