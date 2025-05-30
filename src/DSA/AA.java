package DSA;

import java.util.LinkedList;
public class AA {
    public static boolean search(LinkedList <Object>list,Object obj)
    {
//        return list.contains(obj);
        return list.indexOf(obj) !=-1;
    }
    // swap
    public static void swap(LinkedList<Object> list, int index1, int index2) {
        if (list == null || index1 < 0 || index2 < 0 ||
                index1 >= list.size() || index2 >= list.size() ||
                index1 == index2) {
            return;
        }

        Object temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    //reverse
    public static void reverse(LinkedList<Object> list) {
//        if (list == null || list.isEmpty())
//            return;
//        LinkedList<Object> t = new LinkedList<>(list);
//        list.clear();
//        for (int i = t.size() - 1; i >= 0; i--) {
//            list.add(t.get(i));
//        }
        int size = list.size();
        for(int i = 0; i<size;i++)
        {
//            swap(list.get(i),list.get(size-i-1));
            Object test= list.get(i);
            list.remove(i);
            list.addFirst(test);

        }
    }

    //print
    public static void print(LinkedList <Object>list) {

        for (int i = 0; i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }

    // copyStack

    public static void Copy(FolderStack myStack,FolderStack myStack1)
    {
//        FolderStack temp = new FolderStack();
//
//        FileNode cur = myStack.getTop();
//        while (cur != null) {
//            temp.push(new FileNode(cur.getName(), cur.getSize()));
//            cur = cur.getNext();
//        }
//
//        while (!myStack1.isEmpty()) {
//            myStack1.pop();
//        }
//
//        cur = temp.getTop();
//        while (cur != null) {
//            myStack1.push(new FileNode(cur.getName(), cur.getSize()));
//            cur = cur.getNext();
//        }

        if (myStack.isEmpty())
        {
            return;
        }
        FileNode temp =myStack.getTop();
        myStack.pop();
        Copy(myStack,myStack1);
        myStack.push(temp);
        myStack1.push(temp);

    }
    public static void printStack(FolderStack myStack) {
//        System.out.println(myStack.getTop());

        if (myStack.isEmpty()) {
            return;
        }


        FileNode cur = myStack.getTop();
        System.out.println(cur);
        myStack.pop();
        printStack(myStack);
        myStack.push(cur);

//        while (cur != null) {
//            System.out.println(cur);
//            cur = cur.getNext();
//        }

    }

//    public static boolean remove(FolderStack stack, String fileName) {
//        if (stack == null || fileName == null || stack.isEmpty()) {
//            return false;
//        }
//
//        FolderStack temp = new FolderStack();
//        boolean found = false;
//
//        while (!stack.isEmpty()) {
//            FileNode cur = stack.getTop();
//            stack.pop();
//
//            if (!cur.getName().equals(fileName)) {
//                temp.push(cur);
//            } else {
//                found = true;
//            }
//        }
//
//        while (!temp.isEmpty()) {
//            FileNode node = temp.getTop();
//            temp.pop();
//            stack.push(node);
//        }
//
//        return found;
//    }
//
//

    public static void removeRec(FolderStack myStack,String name) {

        if (myStack.isEmpty())
            return;
        if (myStack.getTop().getName().equalsIgnoreCase(name))
        {
            myStack.pop();
            return;
        }
        FileNode temp =myStack.getTop();
        myStack.pop();
        remove(myStack,name);
        myStack.push(temp);
    }
public static void remove(FolderStack myStack,String name)
{
        if (myStack.isEmpty())
            return;
        FolderStack temp = new FolderStack();
        while (!myStack.isEmpty())
        {
            if (myStack.getTop().getName().equalsIgnoreCase(name)) {
                myStack.pop();
                break;
            }
            temp.push(myStack.getTop());
            myStack.pop();

        }
while (!temp.isEmpty())
{
    myStack.push(temp.getTop());
    temp.pop();

}
    }

    public static void main(String[] args) {

//
//        LinkedList<Object> list = new LinkedList<Object>();
//
//            list.add(new Patient1("mays", 23, "xx"));
//            list.add(new Patient1("reem", 23, "xx"));
//            list.add(new Patient1("kareem", 23, "xx"));
//        System.out.println(list);
//        swap(list, 0, 1);
//
//        //   reverse(list);
//        System.out.println(list);

        FolderStack myStack = new FolderStack();
        myStack.push(new FileNode("c",0));
        myStack.push(new FileNode("users",0));
        myStack.push(new FileNode("meu",0));
        myStack.push(new FileNode("doc",0));
       printStack(myStack);
//        System.out.println("*********");
        FolderStack myStackCopy = new FolderStack();
        Copy(myStack, myStackCopy);
        System.out.println("********");
        printStack(myStackCopy);

    }
}