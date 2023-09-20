
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class Patient_Login extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Patient_Login() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        User_Name_ = new javax.swing.JTextField();
        Password_ = new javax.swing.JPasswordField();
        Login_ = new javax.swing.JButton();
        Cancel_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Registration_ = new javax.swing.JButton();
        Change_Password_ = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 640, 260));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(User_Name_, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 141, 166, -1));
        getContentPane().add(Password_, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 193, 166, -1));

        Login_.setBackground(new java.awt.Color(51, 102, 255));
        Login_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Login_.setForeground(new java.awt.Color(255, 255, 255));
        Login_.setText("Login");
        Login_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ActionPerformed(evt);
            }
        });
        getContentPane().add(Login_, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 270, -1, -1));

        Cancel_.setBackground(new java.awt.Color(51, 102, 255));
        Cancel_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cancel_.setForeground(new java.awt.Color(255, 255, 255));
        Cancel_.setText("Cancel");
        Cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel_, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 270, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 144, -1, -1));

        jLabel2.setBackground(new java.awt.Color(51, 102, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 196, -1, -1));

        Registration_.setBackground(new java.awt.Color(51, 102, 255));
        Registration_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Registration_.setForeground(new java.awt.Color(255, 255, 255));
        Registration_.setText("Registration");
        Registration_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registration_ActionPerformed(evt);
            }
        });
        getContentPane().add(Registration_, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 270, -1, -1));

        Change_Password_.setBackground(new java.awt.Color(51, 102, 255));
        Change_Password_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Change_Password_.setForeground(new java.awt.Color(255, 255, 255));
        Change_Password_.setText("Change Password");
        Change_Password_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_Password_ActionPerformed(evt);
            }
        });
        getContentPane().add(Change_Password_, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 342, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/patient portal.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 16, 539, 93));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/blur5.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ActionPerformed
        if (User_Name_.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter user name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String Password = String.valueOf(Password_.getPassword());
        if (Password.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter password", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        con = Connect.ConnectDB();
        String sql = "select * from patient_login where user_name= '" + User_Name_.getText() + "' and user_Password ='" + Password_.getText() + "'";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                Patient_Panel frm = new Patient_Panel();
                frm.setVisible(true);
            } else {

                JOptionPane.showMessageDialog(null, "Login Failed..Try again !", "Access denied", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_Login_ActionPerformed

    private void Cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ActionPerformed

        this.dispose();
        Home Hom = new Home();
        Hom.setVisible(true);
    }//GEN-LAST:event_Cancel_ActionPerformed

    private void Registration_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registration_ActionPerformed
        this.dispose();
        Registration Reg = new Registration();
        Reg.setVisible(true);
    }//GEN-LAST:event_Registration_ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        this.dispose();
        Home Hom = new Home();
        Hom.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void Change_Password_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_Password_ActionPerformed
        //this.dispose();
        Change_Password Hom = new Change_Password();
        Hom.setVisible(true);
    }//GEN-LAST:event_Change_Password_ActionPerformed

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
            java.util.logging.Logger.getLogger(Patient_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_;
    private javax.swing.JButton Change_Password_;
    private javax.swing.JButton Login_;
    public javax.swing.JPasswordField Password_;
    private javax.swing.JButton Registration_;
    public javax.swing.JTextField User_Name_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
