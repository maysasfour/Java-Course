package Javac;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Date;
import java.util.Set;

public class Printer {
    private String address;
private static Printer printerObj = new Printer("F4printer");
public static Printer getPrinterObj()
{
    if (printerObj==null)
    return new Printer("F4printer");
    else
        return printerObj;
}


    private Printer(String address) {
        this.address = address;

    }
    private ArrayList<File> myFiles = new ArrayList<File>();
    public void addFileLast(File obj) {
        try {
            myFiles.add(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isEmpty() {
        return this.myFiles.isEmpty();
    }

    public void removeFileFirst(File obj) {
        if (this.isEmpty())
            return;
        this.myFiles.remove(0);

    }

    public int getNumberOfFiles() {
        return this.myFiles.size();
    }

    public String toString() {
        String line = "";
        for (int i = 0; i < this.myFiles.size(); i++)
            line += this.myFiles.get(i).toString();
        return line;
    }

//    public Printer(ArrayList<File> myFiles) {
//        this.myFiles = myFiles;
//    }
//
//    public ArrayList<File> getMyFiles() {
//        return myFiles;
//    }
//
//    public void setMyFiles(ArrayList<File> myFiles) {
//        this.myFiles = myFiles;
//    }
//
//    @Override
//    public String toString() {
//        return "Javac.Printer{" +
//                "myFiles=" + myFiles +
//                '}';
//    }
//
//    public void addFile(double size, int pages, String name, String path, String language, Date date) {
//        myFiles.add(new File(size, pages, name, path, language, date));
//    }
//
//    public void removeFile() {
//        if (myFiles.isEmpty()) return;
//        myFiles.remove(myFiles.size() - 1);
//    }
//
//    public void getNumOfFiles() {
//        System.out.println("Number of files: " + myFiles.size());
//    }
//
//    public void printAllFileTypes() {
//        Set<String> types = new HashSet<>();
//        for (File file : myFiles) {
//            types.add(file.getLanguage());
//        }
//        System.out.println("File Types:");
//        for (String type : types) {
//            System.out.println(type);
//        }
//    }
//
//    public void ErrorHandling(String file) {
//        try (FileWriter fw = new FileWriter(file, false)) {
//            for (File file1 : myFiles) {
//                fw.write(file1.toString() + "\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


}