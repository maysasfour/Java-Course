package DSA;

public class ArrayLinkedList {
    public void print()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
    private int arr[];
    private int maxSize;
    private int size;
    public ArrayLinkedList(int maxSize)
    {
        arr = new int[maxSize];
        this.maxSize= maxSize;
        this.size=0;
    }

    // isEmpty
    // isFull

    public boolean isEmpty(){
        return
                this.size ==0;
    }
    public boolean isFull(){
        return size == this.maxSize;
    }

    public void add(int s) {
        if (isFull()) {
            return;
        }
        arr[size] = s;
        size++;
    }
    public  void addFirst(int s){
//    if (isFull()) {
//        return;
//    }
//        for (int i = size; i > 0; i--) {
//        arr[i] = arr[i - 1];
//    }
//    arr[0] = s;
//    size++;
        if(this.isFull())
            return;
        if (this.isEmpty())
            this.arr[0]=s;
        else
            for (int i = size -1; i > 0; i--)
                arr[i+1]= arr[i];
        this.arr[0]=s;
        size++;

    }
    public void addLast(int s) {
        if(this.isFull())
            return;
//        if(this.isEmpty())
//        {
//            this.arr[0] = s;
//            size++;
//        }
//        else
//        {
        this.arr[size++]=s;
//        }
        //add(s);
    }



    public void addIndex(int s,int index)
    {
        if (isFull())
        {
            return;
        }
        if (index < 0 || index > size)
        {
            return;
        }
//        for (int i = size; i > index;i--)
//        {
//            arr[i] = arr[i-1];
//        }
//        arr[index]=s;
//        size++;
        if (index==0) {
            this.addFirst(s);
            return;
        }
        if (index==size) {
            this.addLast(s);
            return;
        }
        for (int i= size-1; i >= index;i--)
        {
            arr[i+1]=  arr[i];
        }
        arr[index]=s;
        size++;

    }
    public void removeFirst()
    {
        if (this.isEmpty())
            return;
        if(size==1)
        {
            size--;
        }
        else
        {
            for (int i =0;i<size-1;i++)
                arr[i]=arr[i+1];
            size--;
        }
    }

    public void removeLast() {
        if (this.isEmpty())
            return;
        size--;
    }

    public static void main(String[] args) {
        ArrayLinkedList list = new ArrayLinkedList(10);

        // add
        // addFirst
        // addLast
        // addBetween
        // remove
        list.add(5);
        list.add(10);
        list.add(15);

        list.addFirst(1);
        list.addIndex(7, 2);

        System.out.println("List after additions:");
        list.print();

        list.removeFirst();
        list.removeLast();

        System.out.println("List after removals:");
        list.print();
    }
}

//    public void addBetween(int index, int s) {
//        if (isFull()) {
//            return;
//        }
//        if (index < 0 || index > size) {
//            return;
//        }
//        for (int i = size; i > index; i--) {
//            arr[i] = arr[i - 1];
//        }
//        arr[index] = s;
//        size++;
//    }
//    public void display() {
//        for (int i = 0; i < size; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//}


// add
// addFirst
// addLast
// addBetween
// remove



