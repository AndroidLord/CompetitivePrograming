package JavaNetworking.DatagramSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class DSender {

    // Sending one time message
//    public static void main(String[] args) throws IOException {
//
//        DatagramSocket ds = new DatagramSocket();
//
//        System.out.println("You Can communicate");
//        Scanner scan = new Scanner(System.in);
//        String in = scan.nextLine();
//        System.out.println("message send...");
//        String str = "This is message no 2";
//        InetAddress ip = InetAddress.getByName("127.0.0.1");
//
//        DatagramPacket dp = new DatagramPacket(in.getBytes(), in.length(), ip, 3000);
//        ds.send(dp);
//        ds.close();
//
//
//    }


    // Sending Continous Message
//    public static void main(String[] args) {
//        try {
//            DatagramSocket socket = new DatagramSocket();
//            InetAddress receiverAddress = InetAddress.getByName("localhost");
//            int receiverPort = 12345;
//
//            Scanner scanner = new Scanner(System.in);
//            String message;
//            do {
//                System.out.print("Enter message (type 'close' to exit): ");
//                message = scanner.nextLine();
//                byte[] sendData = message.getBytes();
//                DatagramPacket packet = new DatagramPacket(sendData, sendData.length, receiverAddress, receiverPort);
//                socket.send(packet);
//            } while (!message.equals("close"));
//
//            System.out.println("Sender program exited.");
//            socket.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//


    public static void main(String[] args) {
        try {

            DatagramSocket socket = new DatagramSocket();
            InetAddress receiverAddress = InetAddress.getByName("localhost");
            int receiverPort = 12345;

            Scanner scanner = new Scanner(System.in);
            String message;
            do {
                System.out.print("Enter message (type 'close' to exit): ");
                message = scanner.nextLine();
                byte[] sendData = message.getBytes();
                DatagramPacket packet = new DatagramPacket(sendData, sendData.length, receiverAddress, receiverPort);
                socket.send(packet);

                // Receive response from the receiver
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received response: " + receivedMessage);
            } while (!message.equals("close"));

            System.out.println("Sender program exited.");
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    }




