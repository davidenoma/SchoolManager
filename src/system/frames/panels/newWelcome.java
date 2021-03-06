/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.frames.panels;

import static java.awt.SystemColor.desktop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import system.ConnectionS;
import system.frames.registerNewStudent;

/**
 *
 * @author SILAS OGAR
 */
public class newWelcome extends javax.swing.JPanel {
Connection con;// handles the connection
    Statement st;//handles sql querries into the database
    ResultSet rs;//handles output from queries
    int currentRow = 0; //this will hold the current row that will be selected
    PreparedStatement pst = null;
    String ss1;
    /**
     * Creates new form newWelcome
     */
    void clearFields(){
    imgLabel.setIcon(null);
    firstName.setText("");
    middlename.setText("");
    lastname.setText("");
    classtext.setText("");
    
    
    }
    public newWelcome() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchFname = new javax.swing.JTextField();
        searchLname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        imgLabel = new javax.swing.JLabel();
        classtext = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 1, new java.awt.Color(0, 0, 0)));
        add(jSeparator3);
        jSeparator3.setBounds(70, 80, 910, 10);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2);
        jSeparator2.setBounds(570, 90, 10, 320);

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 1, new java.awt.Color(0, 0, 0)));
        add(jSeparator1);
        jSeparator1.setBounds(70, 410, 910, 10);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("QUICK SEARCH FOR STUDENTS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 30, 310, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("LAST NAME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 130, 120, 26);
        jPanel1.add(searchFname);
        searchFname.setBounds(240, 80, 210, 30);
        jPanel1.add(searchLname);
        searchLname.setBounds(240, 130, 210, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("FIRST NAME");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 90, 130, 17);

        jButton2.setBackground(new java.awt.Color(134, 186, 210));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(360, 180, 90, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/frames/panels/shade2.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-2, 0, 490, 320);

        add(jPanel1);
        jPanel1.setBounds(70, 90, 490, 320);

        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("STUDENT DETAILS");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 24, 180, 30);
        jPanel2.add(lastname);
        lastname.setBounds(180, 200, 210, 30);
        jPanel2.add(firstName);
        firstName.setBounds(180, 80, 210, 30);
        jPanel2.add(middlename);
        middlename.setBounds(180, 140, 210, 30);

        imgLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jPanel2.add(imgLabel);
        imgLabel.setBounds(10, 70, 160, 160);

        classtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classtextActionPerformed(evt);
            }
        });
        jPanel2.add(classtext);
        classtext.setBounds(10, 260, 70, 30);

        jLabel4.setBackground(new java.awt.Color(240, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("LAST NAME");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(180, 180, 210, 17);

        jLabel9.setBackground(new java.awt.Color(240, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("MIDDLE NAME");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(180, 120, 120, 17);

        jLabel10.setBackground(new java.awt.Color(240, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("FIRST NAME");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(180, 60, 100, 17);

        jLabel11.setBackground(new java.awt.Color(231, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("CLASS");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 237, 70, 20);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Clear Fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(210, 261, 150, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/frames/panels/shade.png"))); // NOI18N
        jLabel8.setText("FIRST NAME");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 400, 320);

        jButton1.setText("jButton1");
        jPanel2.add(jButton1);
        jButton1.setBounds(160, 260, 73, 23);

        add(jPanel2);
        jPanel2.setBounds(580, 90, 400, 320);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/frames/panels/bg2.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(10, 11, 1000, 463);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int class_id = 0;
        con = ConnectionS.connectdb();
        String f = searchFname.getText();
        String l = searchLname.getText();
        if(f.isEmpty() && l.isEmpty()) {
            JOptionPane.showMessageDialog(jButton2, "First Name and/or last Name cannot be blank");
        } else if(f.isEmpty()){
            JOptionPane.showMessageDialog(jButton2, "First Name field cannot be blank");
        }else if(l.isEmpty()){
            JOptionPane.showMessageDialog(jButton2, "Last name field Cannot be blank");
        }else{
            try{
            
            String query = "SELECT FIRST_NAME,MIDDLE_NAME,LAST_NAME,PASSPORT,CLASS_ID from STUDENTS_DETAILS WHERE FIRST_NAME =? and LAST_NAME = ?";
            pst = con.prepareStatement(query);//prepares the sql statement
            pst.setString(1, searchFname.getText());
           pst.setString(2, searchLname.getText());
            rs = pst.executeQuery();//executes the sql statement
            if(rs.next()){
                String add1 = rs.getString("FIRST_NAME");
                firstName.setText(add1);
                String add2 = rs.getString("MIDDLE_NAME");
                middlename.setText(add2);
                String add3 = rs.getString("LAST_NAME");
                lastname.setText(add3);
                byte[]imagecontent = rs.getBytes("PASSPORT");
                pictures = new ImageIcon(imagecontent);
                imgLabel.setIcon(pictures);
                int add4 = rs.getInt("CLASS_ID");
                if(add4 ==1){
                   classtext.setText("JSS1");
                }else if(add4 ==2){
                   classtext.setText("JSS2");
                } else if(add4 ==3){
                   classtext.setText("JSS3"); 
                }else if(add4 ==4){
                   classtext.setText("SS1"); 
                }else if(add4 ==5){
                   classtext.setText("SS2"); 
                }
                else if(add4 ==6){
                   classtext.setText("SS3"); 
                }
            }else{
                 JOptionPane.showMessageDialog(jButton2, "No such Record Found");      
            }      
        }catch(Exception ex){
            JOptionPane.showMessageDialog(newWelcome.this, ex);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception ec){
                ec.getMessage();
            }
        }
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void classtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classtextActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField classtext;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField middlename;
    private javax.swing.JTextField searchFname;
    private javax.swing.JTextField searchLname;
    // End of variables declaration//GEN-END:variables
private ImageIcon pictures = null;
}
