package DSA;

import java.util.LinkedList;
public class FolderStack {
    // Using ArrayList
    // Using LinkedList
    // top
    private FileNode top;
    // isEmpty

    public boolean isEmpty() {
        return
                this.top == null;
    }

    // push
    public void push(FileNode file) {
        FileNode myFile = new FileNode(file.getName(), file.getSize());
        if (this.isEmpty()) {
            this.top = myFile;
            return;
        }
        myFile.setNext(top);
        top = myFile;
    }

    // pop
    public void pop() {
        if (this.isEmpty()) {
            return ;
        }

        top = top.getNext();

    }

        // getTop onTop peak


    public FileNode getTop() {
        return top;
    }
}
