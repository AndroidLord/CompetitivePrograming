package Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterStreamKlassExample {


    public static void main(String[] args) {

        //FileWriterMeth();


        //readFileMeth();

    }

    private static void readFileMeth() {
        try {
            FileReader fileReader = new FileReader("Peom.txt");
            int data = fileReader.read();

            while (data != -1){

                System.out.print((char)data);
                data = fileReader.read();

            }
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void FileWriterMeth() {
        try {
            FileWriter fileWriter = new FileWriter("Peom.txt");
            fileWriter.write("This is file Peom");
            fileWriter.close();
            System.out.println("File Created Successfully");

        } catch (IOException e) {
            System.out.println("Error Creating File");
            throw new RuntimeException(e);
        }
    }


}
