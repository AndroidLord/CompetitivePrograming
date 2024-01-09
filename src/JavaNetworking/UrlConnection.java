package JavaNetworking;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection {

    static String urlString = "https://myprofilesaqib.web.app/";
    static String urlString2 = "https://jsoup.org/";
    static String urlString3 = "https://www.youtube.com/watch?v=uwMhkpgbXYQ";

    public static void main(String[] args) {

        try {
            URL url = new URL(urlString3);
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();

            File file = new File("NFile.txt");
            if (file.exists()){
                System.out.println("File Already Exists...");
                System.out.println("Deleting and Creating new file.");
                file.delete();
            }

            FileWriter writer = new FileWriter("NFile.txt");

            System.out.println("Successful Run!");
            int i = stream.read();

            while (i != -1) {
                writer.write((char)i);
                i = stream.read();
            }
            stream.close();
            writer.close();

            System.out.println("File Created Successful");

        } catch (Exception e) {
            System.out.println(e);
        }


    }



}
