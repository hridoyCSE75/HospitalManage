
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Change_Password extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Change_Password() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        User_Name_ = new javax.swing.JTextField();
        Change_Password_ = new javax.swing.JButton();
        Old_Password_ = new javax.swing.JPasswordField();
        New_Password_ = new javax.swing.JPasswordField();
        Confirm_Password_ = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 105, -1, -1));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 149, -1, -1));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 192, 115, 19));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 237, 124, -1));
        getContentPane().add(User_Name_, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 97, 121, -1));

        Change_Password_.setBackground(new java.awt.Color(255, 255, 255));
        Change_Password_.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        Change_Password_.setForeground(new java.awt.Color(51, 204, 255));
        Change_Password_.setText("Change Password");
        Change_Password_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_Password_ActionPerformed(evt);
            }
        });
        getContentPane().add(Change_Password_, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 294, -1, 38));
        getContentPane().add(Old_Password_, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 141, 121, -1));
        getContentPane().add(New_Password_, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 185, 121, -1));
        getContentPane().add(Confirm_Password_, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 229, 121, -1));

        jLabel5.setBackground(new java.awt.Color(51, 204, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("          Change Your Password");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 29, 281, 33));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/blur4.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Change_Password_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_Password_ActionPerformed
        try {
            String Newpass = String.valueOf(New_Password_.getPassword());
            String ConfPass = String.valueOf(Confirm_Password_.getPassword());
            String OldPass = String.valueOf(Old_Password_.getPassword());
            String uName = User_Name_.getText();
            if (uName.equals("")) {

                JOptionPane.showMessageDialog(this, "Please enter a username",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;

            } else if (OldPass.equals("")) {

                JOptionPane.showMessageDialog(this, "Please enter a old password",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;

            } else if (Newpass.equals("")) {

                JOptionPane.showMessageDialog(this, "Please enter a new password",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;

            } else if (ConfPass.equals("")) {

                JOptionPane.showMessageDialog(this, "Please enter a confirmed password",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (Newpass.length() < 5) {

                JOptionPane.showMessageDialog(this,
                        "The New Password Should be of Atleast 5 Characters",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if ((Newpass).equals(OldPass)) {

                JOptionPane.showMessageDialog(this,
                        "Password is same..Re-enter new password", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (!(Newpass).equals(ConfPass)) {

                JOptionPane.showMessageDialog(this,
                        "New Password doesn't match with Confirmed Password",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            con = Connect.ConnectDB();
            String sql = "select User_name,User_Password from patient_login where User_name='" + User_Name_.getText() + "' and User_Password= '" + Old_Password_.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String usrname = rs.getString("user_name").trim();
                String passwd = rs.getString("user_password").trim();
                if (uName.equals(usrname) && OldPass.equals(passwd)) {
                    con = Connect.ConnectDB();
                    String sql1 = "update patient_login set User_password= '" + Newpass + "' where User_name= '" + uName + "' and User_password = '" + OldPass + "'";
                    Statement stmt = con.createStatement();
                    stmt.execute(sql1.toString());
                    stmt.close();
                    JOptionPane.showMessageDialog(this, "Password Successfully Changed");
                    this.dispose();
                    return;
                } else {
                    JOptionPane.showMessageDialog(this, "invalid user name or password", "Error", JOptionPane.ERROR_MESSAGE);
                    User_Name_.setText("");
                    Old_Password_.setText("");
                    New_Password_.setText("");
                    Confirm_Password_.setText("");
                    return;
                }
            }
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_Change_Password_ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Change_Password().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change_Password_;
    private javax.swing.JPasswordField Confirm_Password_;
    private javax.swing.JPasswordField New_Password_;
    private javax.swing.JPasswordField Old_Password_;
    private javax.swing.JTextField User_Name_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
