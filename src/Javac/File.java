package Javac;

import java.util.Date;

public abstract class File {
    private double size;
    private int pages;
    private   String name,path,language;
    private Date date  = new Date();

    public File(){

    }
    public File(double size, int pages, String name, String path, String language, Date date) {
        this.size = size;
        this.pages = pages;
        this.name = name;
        this.path = path;
        this.language = language;
        this.date = date;
    }

    public abstract void printFileType();
    public void maisMethod(){
        for (int i = 0 ; i < 5; i++)
        {
            System.out.print(i + "\t");
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Javac.File{" +
                "size=" + getSize() +
                ", pages=" + getPages() +
                ", name='" + getName() + '\'' +
                ", path='" + getPath() + '\'' +
                ", language='" + getLanguage() + '\'' +
                ", date=" + getDate() +
                '}';
    }
}
