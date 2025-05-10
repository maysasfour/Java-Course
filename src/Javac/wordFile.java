package Javac;

import java.util.Date;

public class wordFile extends File {
    @Override
    public  void printFileType(){
        System.out.println("Word File");
    }
    public wordFile()
    {

    }
    public wordFile(double size, int pages, String name, String path, String language, Date date) {
        super(size, pages, name, path, language, date);
    }
}
