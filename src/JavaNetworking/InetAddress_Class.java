package JavaNetworking;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

public class InetAddress_Class {


    public static void main(String[] args) {

        try {

            InetAddress internetAddress = InetAddress.getByName("www.javatpoint.com");

            System.out.println("To String " + internetAddress.toString());
            System.out.println("Host Name: " + internetAddress.getHostName());
            System.out.println("Host Address: " + internetAddress.getHostAddress());
            System.out.println("Address: " + internetAddress.getHostAddress());


            InetAddress ip4 = Inet4Address.getByName("www.javatpoint.com");
            InetAddress ip6 = Inet6Address.getByName("www.javatpoint.com");

            System.out.println("The IP version 4 ********************");
            System.out.println("To String " + ip4.toString());
            System.out.println("Host Name: " + ip4.getHostName());
            System.out.println("Host Address: " + ip4.getHostAddress());
            System.out.println("Address: " + ip4.getHostAddress());

            System.out.println("The IP version 6 ********************");
            System.out.println("To String " + ip6.toString());
            System.out.println("Host Name: " + ip6.getHostName());
            System.out.println("Host Address: " + ip6.getHostAddress());
            System.out.println("Address: " + ip6.getHostAddress());


        }
        catch (Exception e){
            System.out.println(e);
        }

    }


}
