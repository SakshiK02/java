import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
public class dbConnect {
    //Connection conn=null;
    public static Connection ConnectDB(){

        String url = "jdbc:mysql://localhost:3306/db";
        String username = "root";
        String password = "anudip123";

        System.out.println("Connecting database...");

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
      //connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }        
    }



    public static void insert(String s, String t, String u, String v, String w){
        String fname, lname, tel, email, password;
        fname=s;
        lname=t;
        tel=u;
        email=v;
        password=w;

        Connection conn=ConnectDB();
        try{
            String query = "insert into customer values (null, "+fname+", "+lname+", "+tel+", "+email+", "+password+")";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);


      // execute the preparedstatement
      preparedStmt.execute();
      JOptionPane.showMessageDialog(null, "Data added");

        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public static void main(String args[]) {
        //ConnectDB();
         insert("isuru", "Sandamal", "0714521589", "isurusandamalisgmail.com", "1234");
    }
}