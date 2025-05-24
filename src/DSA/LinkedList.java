package DSA;

public class LinkedList {
    private EmployeeNode first;

    public LinkedList() {
        first = null;
    }


    // first
    public boolean isEmpty() {

        return this.first == null;
    }

    public void addFirst(EmployeeNode obj) {
        EmployeeNode temp = new EmployeeNode(obj.getObjEmp(), obj.getDate());
        if (this.isEmpty())
            this.first = temp;
        else {
            temp.setNext(this.first);
            this.first = temp;

        }
    }

    public boolean search(String name) {
        EmployeeNode cur = this.first;
        while (cur != null) {
            if (cur.getObjEmp().name.equalsIgnoreCase(name))
                return true;

            cur = cur.getNext();

        }
        return false;
    }

    public int getSize() {

        EmployeeNode cur = this.first;
        int c = 0;

        while (cur != null) {
            c++;
            cur = cur.getNext();
        }
        return c;
    }

    public void print() {
        if (this.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        EmployeeNode cur = this.first;

        while (cur != null) {
            System.out.println(cur);
            cur = cur.getNext();
        }
    }

    public void addLast(EmployeeNode obj) {
//        EmployeeNode temp = new EmployeeNode(obj.getObjEmp(), obj.getDate());
//
//        if (this.isEmpty()) {
//            this.first = temp;
//            return;
//        }
//
//        EmployeeNode cur = this.first;
//
//        while (cur.getNext() != null) {
//            cur = cur.getNext();
//        }
//
//        cur.setNext(temp);
        if (this.isEmpty()) {
            this.first = new EmployeeNode(obj.getObjEmp(), obj.getDate());
            return;
        }
        EmployeeNode temp = new EmployeeNode(obj.getObjEmp(), obj.getDate());
        EmployeeNode cur = this.first;
        while (cur.getNext() != null) {
            cur = cur.getNext();
        }
        cur.setNext(temp);

    }
//    public void addBetween (EmployeeNode obj)
//    {
//        if (this.isEmpty() || first.getNext() == null) {
//
//            addLast(obj);
//            return;
//        }
//
//        EmployeeNode temp = new EmployeeNode(obj.getObjEmp(), obj.getDate());
//        EmployeeNode cur = this.first;
//
//        int mid = getSize() / 2;
//        for (int i = 0; i < mid - 1; i++) {
//            cur = cur.getNext();
//        }
//
//        temp.setNext(cur.getNext());
//        cur.setNext(temp);
//    }

    public void addAfterIndex(EmployeeNode obj, int index) {
        if (this.isEmpty())
            return;
        if (index <= 0)
            return;
        EmployeeNode cur = this.first;
        for (int i = 1; i < index; i++) {
            if (cur == null)
                return;
            cur = cur.getNext();
        }
        obj.setNext(cur.getNext());
        cur.setNext(obj);

    }

    public void print3Nodes() {
//if (this.isEmpty()) {
//        System.out.println("Empty list - no nodes to print");
//        return;
//    }
//
//    EmployeeNode cur = this.first;
//    int c = 0;
//
//    while (cur != null && c < 3) {
//        System.out.println("Node " + (c + 1) + ": " + cur);
//        cur = cur.getNext();
//        c++;
//    }
//
//    if (c < 3) {
//        System.out.println("Note: List contains only " + c + " node(s)");
//    }


        // without loop
        System.out.println(this.first);
        System.out.println(this.first.getNext());
        System.out.println(this.first.getNext().getNext());

    }

    public void RemoveLast() {
        if (this.isEmpty()) {
            return;
        }

        if (this.first.getNext() == null) {
            this.first = null;
            return;
        }

        EmployeeNode cur = this.first;
        while (cur.getNext().getNext() != null) {
            cur = cur.getNext();
        }

        cur.setNext(null);
    }

    public void RemoveFirst() {
        if (this.isEmpty()) {
            return;
        }
        if (this.first.getNext() == null) {
            this.first = null;
            return;
        }
        this.first = this.first.getNext();
    }

    public void removeNode(String name) {
        if (this.isEmpty()) {
            return;

        }
        if (this.first.getObjEmp().name.equalsIgnoreCase(name)) {
            RemoveFirst();
            return;
        } else if (first.getNext() == null) {
            return;

        }
        EmployeeNode cur = this.first;
        while (cur != null && !cur.getNext().getObjEmp().name.equalsIgnoreCase(name)) {
            cur = cur.getNext();
        }
        if (cur == null) {
            return;
        }
        if (cur.getNext() == null) {
            this.RemoveLast();
            return;
        }

        cur.setNext(cur.getNext().getNext());
    }



    public EmployeeNode getNode(int index) {
        if (index < 0 && index > this.getSize()) {
            return null;
        }
        EmployeeNode cur = this.first;
        for (int i = 0; i < index; i++) {
            cur = cur.getNext();

        }
        return cur;
    }


// remove first
    // remove last
// remove employee




// reverseList
//    public static void reverseList(LinkedList list) {
//        if (list == null) return;
//
//        EmployeeNode newHead = reverseRec(list.getNode(0));
//
//        // Set new head
//        try {
//            java.lang.reflect.Field field = LinkedList.class.getDeclaredField("first");
//            field.setAccessible(true);
//            field.set(list, newHead);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


}
// write none member method that copy two linkedList

// public static void copy(first,second) //copy first LinkedList to the second one
// print none member method
// countRec don't use getSize it must be none member
// reverse Rec none member
