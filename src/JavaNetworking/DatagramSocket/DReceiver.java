package JavaNetworking.DatagramSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class DReceiver {

//    public static void main(String[] args) throws IOException {
//
//        DatagramSocket ds = new DatagramSocket(3000);
//        byte[] buf = new byte[1024];
//        DatagramPacket dp = new DatagramPacket(buf, 1024);
//        ds.receive(dp);
//        String str = new String(dp.getData(), 0, dp.getLength());
//        System.out.println(str);
//        ds.close();
//
//    }


    // Receiving Multiple Message from sender
//    public static void main(String[] args) {
//        try {
//            DatagramSocket socket = new DatagramSocket(12345);
//
//            byte[] receiveData = new byte[1024];
//            DatagramPacket packet = new DatagramPacket(receiveData, receiveData.length);
//
//            while (true) {
//                socket.receive(packet);
//
//                String message = new String(packet.getData(), 0, packet.getLength());
//                System.out.println("Received message: " + message);
//
//                if (message.equals("close")) {
//                    break;
//                }
//            }
//
//            System.out.println("Receiver program exited.");
//            socket.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    public static void main(String[] args) {
        System.out.println("Ears Are On...\n");
        try {
            DatagramSocket socket = new DatagramSocket(12345);

            while (true) {
                byte[] receiveData = new byte[1024];
                DatagramPacket packet = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(packet);

                String receivedMessage = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received message: " + receivedMessage);

                // Send response to the sender
                InetAddress senderAddress = packet.getAddress();
                int senderPort = packet.getPort();

                Scanner scan = new Scanner(System.in);
                System.out.println("Please Form a response...\n");
                String responseMessage = scan.nextLine();

                if (receivedMessage.equals("close")) {
                    break;
                }

                System.out.println("message Send");
                byte[] sendData = responseMessage.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(sendData, sendData.length, senderAddress, senderPort);
                socket.send(responsePacket);


            }

            System.out.println("Receiver program exited.");
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
