/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class InstallationDirectory extends javax.swing.JDialog {

    /**
     * Creates new form InstallationDirectory
     */
    static String installPath = " ";
    static String readInstallPath_ = "";
    static FileReader writeLocation;
    static FileWriter writeContent;
    static File location = new File("C:\\Users\\Public\\Documents\\test.txt");
    static char[] cbuf = {' '};

    static File testLocation;

    static void testLocationWriter() {
            if(!location.exists()){
        try {
            writeContent = new FileWriter(location);
            writeContent.write(installPath);
            writeContent.flush();
            writeContent.close();

        } catch (IOException ex) {
            Logger.getLogger(InstallationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    }

    public InstallationDirectory(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
//         location = 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SELECT THE PROGRAM'S FOLDER AND PRESS OPEN");
        setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        setType(java.awt.Window.Type.POPUP);

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Users\\Desktop\\SchoolSystem_1"));
        jFileChooser1.setDialogTitle("SELECT SOFTWARE LOCATION FOLDER");
        jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        jFileChooser1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jFileChooser1.setOpaque(true);
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
        installPath = jFileChooser1.getCurrentDirectory().toString();

        try {

            writeContent = new FileWriter(location);
            writeContent.write(installPath);
            writeContent.flush();
            writeContent.close();

            writeLocation = new FileReader(location);
            cbuf = new char[(int) location.length()];
//            writeLocation.read();
            writeLocation.read(cbuf);
            readInstallPath_ = new String(cbuf);
            writeLocation.close();
        } catch (IOException ex) {
            Logger.getLogger(InstallationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();

    }//GEN-LAST:event_jFileChooser1ActionPerformed
    static boolean checkFilecontent() {
        boolean answer = false;
            try {
            writeLocation = new FileReader(location);
            cbuf = new char[(int) location.length()];
//            writeLocation.read();
            writeLocation.read(cbuf);
            readInstallPath_ = new String(cbuf);
            writeLocation.close();
        } catch (IOException ex) {
            Logger.getLogger(InstallationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(readInstallPath_.length() > 2){
            answer = true;
        }
    return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InstallationDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstallationDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstallationDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstallationDirectory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InstallationDirectory dialog = new InstallationDirectory(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
