import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // File file=new File("temp.txt");
        //try(FileInputStream fileInputStream=new FileInputStream(file)) {
        //   Scanner sc=new Scanner((fileInputStream));
        //    System.out.println(sc.nextLine());
        //}

        System.out.println("Name?");
        Scanner consoleInput = new Scanner(System.in);
        String name = consoleInput.nextLine();

        System.out.println("Age?");
        //Scanner consoleInput2=new Scanner(System.in);
        int age = consoleInput.nextInt();

        File file = new File("temp.txt");
        //try(FileInputStream fileInputStream=new FileInputStream(file)) {
        //  Scanner sc=new Scanner((fileInputStream));
        // System.out.println(sc.nextLine());

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            PrintStream printstream = new PrintStream(fileOutputStream);
            printstream.println("name" + name);
            printstream.println("Age:" + age);
        }
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            Scanner sc = new Scanner((fileInputStream));
            String file1txt=sc.nextLine();
           // System.out.println(sc.nextLine());


        File file2 = new File("file2.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file2)) {
            PrintStream printstream = new PrintStream(fileOutputStream);
            printstream.println(file1txt);

        }
        }
    }

}