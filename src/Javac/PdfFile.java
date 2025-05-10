package Javac;

import java.util.Date;

public class PdfFile extends File {
    public PdfFile()
    {
super();

    }

    public PdfFile(double size, int pages, String name, String path, String language, Date date) {

        super(size, pages, name, path, language, date);
        System.out.println("hi");


    }
    public void testMethod(){

    }
    public void  maisMethod(){
        System.out.println("HI");
    }
    @Override
    public  void printFileType(){
        System.out.println("PdfFile");
    }
    //size
    //name
    // path
    // lang
    // pages
    // date
}
