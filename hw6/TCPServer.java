import java.io.*;
import java.net.*;
import java.sql.*;

public class TCPServer {
    public static void main(String args[]) {

        Connection conn = null;
        PreparedStatement p = null;
        ResultSet rs = null;

        try {
            ServerSocket ss = new ServerSocket(450);
            // Socket soc = ss.accept();
            // OutputStream os = soc.getOutputStream();
            // PrintWriter writer = new PrintWriter(os, true);

            // writer.println("hello workd");

            // System.out.println("connection is made");

            // ServerSocket ss = new ServerSocket(450);

            Class.forName("com.mysql.cj.jdbc.Driver");

            // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            conn = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "ijnbhu77");
            String outp = "";
            // insert a tuple in table

            int s = 0;
            while (true) {
                Socket soc = ss.accept();

                InputStream i = soc.getInputStream();
                BufferedReader r = new BufferedReader(new InputStreamReader(i));
                String countryname = r.readLine();

                String q = "select * from countryLanguageUsage where country = '" + countryname + "'";
                // String mess = "";
                p = conn.prepareStatement(q);
                rs = p.executeQuery(q);
                
                outp += ("Country "+ rs.getString(1)+"Official Usage(%) "+rs.getString(1)+"Non-Official Usage(%) "+rs.getByte(3));

                OutputStream os = soc.getOutputStream();
                PrintWriter writer = new PrintWriter(os, true);
                writer.println(outp);
            }
            // System.out.println("Connection is established...");
        } catch (IOException e) {
            System.out.println(e);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            System.out.println("exception occorued: " + e);
        }
    }
}