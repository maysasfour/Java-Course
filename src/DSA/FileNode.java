package DSA;

public class FileNode {
    private int size;
    private String name;
private FileNode next;
    public FileNode(String name, int size) {
        this.name = name;
        this.size = size;
        this.next=null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileNode getNext() {
        return next;
    }

    public void setNext(FileNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DSA.File{" +
                "size=" + getSize() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
