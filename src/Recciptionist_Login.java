
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class Recciptionist_Login extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Recciptionist_Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        User_Name_ = new javax.swing.JTextField();
        Password_ = new javax.swing.JPasswordField();
        Login_ = new javax.swing.JButton();
        Cancel_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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

        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 208, -1, -1));
        getContentPane().add(User_Name_, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 152, 166, -1));
        getContentPane().add(Password_, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 205, 166, -1));

        Login_.setBackground(new java.awt.Color(51, 153, 255));
        Login_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Login_.setForeground(new java.awt.Color(255, 255, 255));
        Login_.setText("Login");
        Login_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ActionPerformed(evt);
            }
        });
        getContentPane().add(Login_, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 272, 119, -1));

        Cancel_.setBackground(new java.awt.Color(51, 153, 255));
        Cancel_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cancel_.setForeground(new java.awt.Color(255, 0, 0));
        Cancel_.setText("Cancel");
        Cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel_, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 272, -1, -1));

        jLabel1.setText("User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 155, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/receiptionist portal login.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 16, 542, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/blur7.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 360));

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
        String sql = "select * from employee_login where User_Name= '" + User_Name_.getText() + "' and user_Password ='" + Password_.getText() + "'";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                Recciptionist_Panel frm = new Recciptionist_Panel();
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        Home Hom = new Home();
        Hom.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Recciptionist_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recciptionist_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recciptionist_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recciptionist_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recciptionist_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_;
    private javax.swing.JButton Login_;
    public javax.swing.JPasswordField Password_;
    public javax.swing.JTextField User_Name_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
