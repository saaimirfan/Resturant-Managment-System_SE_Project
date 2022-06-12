package Application;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Connection {

        java.sql.Connection con=null;
        public java.sql.Connection EstablishConnection()
        {
            try{
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con= DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\saaim\\eclipse-workspace\\Resturant\\Res.accdb");
                System.out.println("Connection Established");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            return con;
        }

    public static void main(String[] args) {
        Connection co =new Connection();
        co.EstablishConnection();
    }
    }

