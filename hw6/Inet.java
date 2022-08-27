import java.net.*;

public class Inet {

    public static void main(String args[]){
        try{
        InetAddress address = InetAddress.getByName("www.googles.com");
        System.out.println(address);
            // 127.0.0.1
        address = InetAddress.getLocalHost();

        System.out.println(address);
        }catch(UnknownHostException e){
            System.out.println(e);
        }
    }
}
