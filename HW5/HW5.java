import java.sql.*;

// **************************** HAVE TO USE -CLASSATH  TO RUN THE CODE*******************************

public class HW5 {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement p = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            conn = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "ijnbhu77");

            // insert a tuple in table

            p = conn.prepareStatement(
                    "create table if not exists countryLanguageUsage (Country varchar(255), Official_Usage float, Non_official_Usage float)");
            p.executeUpdate();

            String q = "select name, sum(if  (isOfficial = 'T', percentage, 0) ), sum(if (isOfficial = 'F', percentage, 0)) from countryLanguage, country where countryLanguage.countryCode = country.code group by countryCode ;";
            p = conn.prepareStatement(q);
            rs = p.executeQuery(q);

            while (rs.next()) {
                String s = String.format(
                        "Insert ignore into countryLanguageUsage (country, official_usage, non_official_usage) values ('%s', %s, %s)",
                        rs.getString(1), rs.getString(2), rs.getString(3));
                p = conn.prepareStatement(s);
                p.executeUpdate();
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