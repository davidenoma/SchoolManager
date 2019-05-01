/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.frames.panels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import system.ConnectionS;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class TestClass {

    static Connection con;
    static PreparedStatement pStmnt;
    static Statement stmnt;
    static String []subjects ;
    

    public static void main(String[] args) {
        try {
            String sql = "select subjects from class where class_id = 1";
            String sql2 = "select last_name, middle_name, first_name, student_id from students_details where class_id =1";
            con = ConnectionS.connectdb();
            stmnt = con.createStatement();
            stmnt.execute(sql);

//         pStmnt = con.prepareStatement(sql);
//               pStmnt.setInt(1, 1);
//            boolean check = pStmnt.execute(sql);
//            if (check == true) {
                subjects = stmnt.getResultSet().getString(1).split(",");
//                for (String x : subjects) {
System.out.println(subjects.length);
for(int x = 0; x< subjects.length ; x++){
                    System.out.println(subjects[x]+" INTEGER,");
}
           
//        String sql3 = "select Subjects from class where "
//                + "class_id = (select class_id from students_details "
//                + "where first_name like and last_name like"+lastName+")";
//        con = ConnectionS.connectdb();
//        statement = con.createStatement();
//        result = statement.executeQuery(sql);
////        result.first();
//        String texts = result.getString("Subjects");
////        textArea1.setText(texts.replaceAll(",", "\n"));

//            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

}
