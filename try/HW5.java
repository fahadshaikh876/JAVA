import java.sql.*;


public class HW5 {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement p = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            conn = DriverManager.getConnection("jdbc:mysql://localhost/javaproj", "root", "ijnbhu");

            String q = "select * from onlinecustomer;";
            p = conn.prepareStatement(q);
            rs = p.executeQuery(q);

            while (rs.next()) {
                System.out.print(rs.getString(5));
                System.out.print(rs.getString(6));
            }
    
            System.out.println("Connection is opened sucessfully");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        catch (Exception e) {
            System.out.println("exception occorued: " + e);
        }
    }
}

// java -classpath 'C:\Program Files (x86)\MySQL\Connector J
// 8.0\mysql-connector-java-8.0.26.jar;.' HW5