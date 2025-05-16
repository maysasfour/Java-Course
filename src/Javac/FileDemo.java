package Javac;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class FileDemo {
    public static void main(String[] args) throws IOException {

//        001 John Doe 15 Male
//        002 Jane Smith 14 Female
//        003 Michael Johnson 18 Male
//        004 Sarah Lee 17 Female
//        005 William Brown 15 Male
//        006 Emily Davis 14 Female
//        007 David Wilson 18 Male
//        008 Lily Harris 13 Female
//        009 James Clark 17 Male
//        010 Olivia Scott 15 Female
//        011 Daniel Martinez 14 Male
//        012 Mia Lopez 15 Female
//        013 Ethan Moore 18 Male
//        014 Chloe Taylor 14 Female
//        015 Jacob Anderson 18 Male

        // write program that read data from file and store it in an student object >>>
        //you have to define a method that return student age with given name

        ArrayList<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\IdeaProjects\\Java Assesment\\students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.trim().split("\\s+");
                if (data.length >= 5) {
                    String stuId = data[0];
                    String fName = data[1];
                    String lName = data[2];
                    int age = Integer.parseInt(data[3]);
                    String gender = data[4];

                    students.add(new Student(stuId, fName, lName, age, gender));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's full name (Like : John Doe): ");
        String fName = scanner.nextLine();

        int age = getStudentAge(students, fName);
        if (age != -1) {
            System.out.println("Age of " + fName + ": " + age);
        } else {
            System.out.println("Student not found: " + fName);
        }
    }

    public static int getStudentAge(List<Student> students, String fullName) {
        for (Student student : students) {
            String studentFullName = student.getfName() + " " + student.getlName();
            if (studentFullName.equalsIgnoreCase(fullName)) {
                return student.getAge();
            }
        }
        return -1;
    }




    // Reader
//        try {
//            FileReader fr = new FileReader("data.txt") ;
//            Scanner scanner = new Scanner(fr);
//            String word = scanner.next();
//            System.out.println(word);
//        }
//        catch (FileNotFoundException ex ){
//            System.out.println("File Not Found");
//        }


    // Writer
//       try (FileWriter fw = new FileWriter("data.txt")){
//           fw.write("hi");
//           fw.close();
//       }
//       catch (IOException ex)
//       {
//           System.out.println("File not found");
//       }
//    }

//        FileReader in = null;
//        FileWriter out = null;
//
//        try {
//            in = new FileReader("input.txt");
//            out = new FileWriter("output.txt");
//            int c;
//
//            while ((c = in.read()) != -1) {
//                out.write(c);
//            }
//        }
//        catch(IOException e) {
//            System.out.println("There is IOException!");
//        }
//        finally {
//            if (in != null) {
//                in.close();
//            }
//            if (out != null) {
//                out.close();
//            }
//        }
// Write and read together
//        try {
//            FileReader inFile = new FileReader("data.txt");
//            FileWriter write = new FileWriter("Data2.txt");
//            Scanner scanner = new Scanner(inFile);
//            int x = scanner.nextInt();
//            String name = scanner.next();
//            System.out.println(++x);
//            System.out.println(name);
//
//            int counter = 0;
//            while (scanner.hasNext()) {
//                String Line = scanner.nextLine();
//                write.write(Line + "\n");
//                counter++;
//                for (int i=Line.length()-1;i>=0;i--)
//                    write.write(Line.charAt(i));
//                write.write("\n");
//
//            }
//            System.out.println(counter);
//            write.close();
//
//        } catch (FileNotFoundException ex) {
//            System.out.println("file not found");
//        } catch (Exception ex) {
//
//        }

    // My solution of read and write together
//        String filePath = "C:\\Users\\HP\\IdeaProjects\\Java Assesment\\MIso.txt";
//        int lineCount = 0;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            while (br.readLine() != null) {
//                lineCount++;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Total lines: " + lineCount);
//    }

// read data
//        try {
//            FileReader inFile=new FileReader("data3.txt");
//            Scanner input=new Scanner(inFile);
//            String id=input.next();
//            String fName=input.next();
//
//            String lName=input.next();
//            int age=input.nextInt();
//            String gender=input.next();
//            System.out.println(id+"\t"+fName+"\t"+lName+"\t"+age+"\t"+gender);
//
//
//    }
//        catch (FileNotFoundException ex)
//    {
//        System.out.println("file not found");
//    }catch(Exception ex)
//    {
//        System.out.println(ex.getMessage());
//    }
//
}