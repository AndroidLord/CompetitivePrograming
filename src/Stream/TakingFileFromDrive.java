package Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TakingFileFromDrive {


    public static void main(String[] args) {

        File file = new File("D://docInD.txt");

        System.out.println("The absolute Path of the File is: "+file.getAbsolutePath());

        try {
            FileOutputStream write = new FileOutputStream(file);
            String s = "Roses are red\nViolets are Blue";
            write.write(s.getBytes());
            System.out.println("File Change Success");
            write.close();

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(file.exists());


    }

}
