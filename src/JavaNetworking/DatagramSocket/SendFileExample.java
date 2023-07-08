package JavaNetworking.DatagramSocket;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.*;

public class SendFileExample {


//    public static void main(String[] args) {
//
//        try {
//
//            DatagramSocket socket = new DatagramSocket();
//            InetAddress ip = InetAddress.getByName("localhost");
//
//            File file = new File("NFile.txt");
//            System.out.println("NFile Exists: " +file.exists());
//            byte[] bytes = convertFileToBytes(file);
//
//            assert bytes != null;
//            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,5500);
//            socket.send(dp);
//            socket.close();
//            System.out.println("File Send Successfully.");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static byte[] convertFileToBytes(File file) {
//
//        try (FileInputStream fileInputStream = new FileInputStream(file);
//             ByteArrayOutputStream byteStream = new ByteArrayOutputStream()) {
//            byte[] buffer = new byte[4096]; //4kb
//            int bytesRead;
//            while ( (bytesRead = fileInputStream.read(buffer) ) != -1) {
//                byteStream.write(buffer, 0, bytesRead);
//            }
//            return byteStream.toByteArray();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress ip = InetAddress.getByName("localhost");

            File file = new File("NFile.txt");
            byte[] fileBytes = convertFileToBytes(file);

            DatagramPacket packet = new DatagramPacket(fileBytes, fileBytes.length, ip, 5500);
            socket.send(packet);

            System.out.println("File sent successfully.");

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] convertFileToBytes(File file) throws IOException {
        FileInputStream inputStream = new FileInputStream(file);
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        inputStream.close();
        outputStream.close();

        return outputStream.toByteArray();
    }

}
