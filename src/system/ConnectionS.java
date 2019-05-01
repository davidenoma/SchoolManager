/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.sql.*;
import javax.swing.*;

public class ConnectionS {

    Connection con = null;

    public static Connection connectdb() {
        try {
            Class.forName("org.sqlite.JDBC");
            String host = "jdbc:sqlite:\\IT.sqlite";
            StringBuilder host_ = new StringBuilder(host);
            String append = InstallationDirectory.readInstallPath_;
            host_.insert(12, append);
            host = host_.toString();

            String uname = "";
            String pass = "";
            Connection con = DriverManager.getConnection(host, uname, pass);
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
}
