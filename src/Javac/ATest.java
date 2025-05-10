package Javac;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class ATest {
    public static void print (File obj) {
        obj.printFileType();
    }
    public static void main(String[] args) {
        File myFile = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String choice= scanner.next();
            if(choice.equalsIgnoreCase("pdf"))
                myFile = new PdfFile();
            else if (choice.equalsIgnoreCase("word"))
                myFile = new wordFile();
            else if (choice.equalsIgnoreCase("End"))
            break;
            print(myFile);
            {

            }
            File obj = new PdfFile();
//            obj.maisMethod();
//            obj= new wordFile();
//            obj.maisMethod();

//           Printer obj = new Printer("F4printer");
//           obj.addFileLast(new PdfFile());
           Printer.getPrinterObj().addFileLast(new PdfFile());
//           Printer obj = Printer.getPrinterObj();


        }


//        Calendar cal = Calendar.getInstance();
//        cal.set(2025, Calendar.MAY, 8);
//        Date specificDate = cal.getTime();
//    PdfFile myFile = new PdfFile();
//        PdfFile myFile2 = myFile;
//
//        System.out.println(myFile2);
//
////        myFile.date.setYear(2025);
//        myFile = new PdfFile(5.5,70,"miso","acrobat","English", specificDate);
//        System.out.println(myFile);
//
//        }

    }
}
