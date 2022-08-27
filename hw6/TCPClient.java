import java.io.*;
import java.net.*;
import java.util.*;

public class TCPClient {
    public static void main(String args[]) {

        Scanner scc = new Scanner(System.in);
        String countyname = scc.nextLine();
        scc.close();
        try {
            Socket sc = new Socket(InetAddress.getByName("localhost"), 450);

            // InputStream is = sc.getInputStream();
            // BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            // String message = reader.readLine();

            // System.out.println("msgge recerver: " + message);
            OutputStream o = sc.getOutputStream();
            PrintWriter pw = new PrintWriter(o, true);
            pw.println(countyname);

            InputStream is = sc.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}