package JavaNetworking;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class HttpUrlConnection {

    public static void main(String[] args) {


        String urlString = "https://myprofilesaqib.web.app/";
        String urlString2 = "https://jsoup.org/";
        String urlString3 = "https://www.youtube.com/watch?v=uwMhkpgbXYQ";

        try {
            URL url = new URL(urlString3);
            HttpURLConnection huc=(HttpURLConnection)url.openConnection();
            int len = huc.getContentLength();

            //while(huc.getHeaderField())

            for(int i=1;huc.getHeaderField(i)!=null;i++){
                System.out.println(i+". "+huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
            }
            huc.disconnect();
        }catch(Exception e){System.out.println(e);}

    }

    public static void httpUrlConnExample(){
        try {
            URL url = new URL("http://www.example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            System.out.println("Response Content:");
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
