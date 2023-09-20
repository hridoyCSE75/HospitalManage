
import java.sql.*;
import javax.swing.*;

public class Connect {

    Connection con = null;

    public static Connection ConnectDB() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalManage?zeroDateTimeBehavior=convertToNull", "root","");
            //for sqlServer("jdbc:sqlserver://localhost:1433;databaseName=hospitalManage;user=myuser;password=mypassword");
            //for sqlServer("jdbc:sqlserver://localhost:1433;databaseName=hospitalManage;integratedSecurity=true");   //where WindowsAuth
            return con;

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
