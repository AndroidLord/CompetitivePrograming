package JavaNetworking.DatagramSocket;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveFileExample {


    public static void main(String[] args) {

        try {

            DatagramSocket socket = new DatagramSocket(3000);
            byte[] bytes = new byte[4096];
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
            socket.receive(dp);

            byte[] receivedData = dp.getData();
            File file = new File("E:\\");
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(receivedData);
            outputStream.close();
            System.out.println("File Created: " + file.exists());

            if(file.exists()){

                System.out.println("File Path: " + file.getAbsolutePath());
                System.out.println();

                showContentOfTheFile(file);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void showContentOfTheFile(File file) {

        try {

            FileInputStream fis = new FileInputStream(file);
            int data = fis.read();
            while (data!=-1){
                System.out.println((char)data);
                data = fis.read();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
