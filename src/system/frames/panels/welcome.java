/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.frames.panels;

import javax.swing.JOptionPane;

/**
 *
 * @author SILAS OGAR
 */
public class welcome extends javax.swing.JPanel {

    /**
     * Creates new form welcome
     */
    public welcome() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("QUICK SEARCH FOR STUDENTS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 30, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("LAST NAME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 130, 80, 15);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(240, 180, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("CLASS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 180, 60, 20);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(240, 80, 210, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(240, 130, 210, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("FIRST NAME");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 90, 80, 15);

        jButton2.setBackground(new java.awt.Color(134, 186, 210));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(360, 180, 83, 30);

        add(jPanel1);
        jPanel1.setBounds(80, 140, 490, 270);

        jButton1.setText("WHATS NEW FROM THE DEVELOPERS ?");
        add(jButton1);
        jButton1.setBounds(700, 90, 230, 23);

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 1, new java.awt.Color(0, 0, 0)));
        add(jSeparator1);
        jSeparator1.setBounds(80, 410, 910, 10);

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 1, new java.awt.Color(0, 0, 0)));
        add(jSeparator3);
        jSeparator3.setBounds(80, 130, 910, 10);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4);
        jSeparator4.setBounds(70, 140, 0, 280);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2);
        jSeparator2.setBounds(580, 140, 10, 280);

        jButton6.setText("HELP");
        add(jButton6);
        jButton6.setBounds(610, 90, 73, 23);

        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("QUIK LINKS");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 40, 90, 14);

        jButton3.setText("Register  New");
        jPanel2.add(jButton3);
        jButton3.setBounds(120, 70, 150, 23);

        jButton4.setText("Reports");
        jPanel2.add(jButton4);
        jButton4.setBounds(120, 110, 150, 23);

        jButton5.setText("Passports");
        jPanel2.add(jButton5);
        jButton5.setBounds(120, 150, 150, 23);

        jButton7.setText("CONTACT DEVELOPER OF THIS APP");
        jPanel2.add(jButton7);
        jButton7.setBounds(90, 230, 220, 23);

        add(jPanel2);
        jPanel2.setBounds(590, 140, 400, 270);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(jButton1, "WOW");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
