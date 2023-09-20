
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author TAKI
 */
public class Appointment_View extends javax.swing.JFrame {

    /**
     * Creates new form Appointment_Find
     */
    public Appointment_View() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Patient_ID_ = new javax.swing.JTextField();
        View_ = new javax.swing.JButton();
        Back_ = new javax.swing.JButton();
        New_ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Doctor_Name_ = new javax.swing.JTextField();
        Appointment_Date_ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Appointment_Time_ = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 49, -1, -1));
        getContentPane().add(Patient_ID_, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 46, 116, -1));

        View_.setText("Appointment View");
        View_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_ActionPerformed(evt);
            }
        });
        getContentPane().add(View_, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        Back_.setText("Back");
        Back_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ActionPerformed(evt);
            }
        });
        getContentPane().add(Back_, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 173, -1, -1));

        New_.setText("New");
        New_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_ActionPerformed(evt);
            }
        });
        getContentPane().add(New_, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 173, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 46, -1, -1));

        jLabel3.setText("Doctor Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 84, -1, -1));

        jLabel4.setText("Appointment Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 128, -1, -1));

        Doctor_Name_.setEditable(false);
        getContentPane().add(Doctor_Name_, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 81, 125, -1));

        Appointment_Date_.setEditable(false);
        getContentPane().add(Appointment_Date_, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 125, 125, -1));

        jLabel5.setText("Appointment Time");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 172, -1, -1));

        Appointment_Time_.setEditable(false);
        getContentPane().add(Appointment_Time_, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 169, 125, -1));

        jLabel6.setBackground(new java.awt.Color(102, 153, 255));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void View_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_ActionPerformed

        if (Patient_ID_.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter Patient ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        }
        try {
            con = Connect.ConnectDB();
            String d_id = null;
            String sql = "select doctor_id,appointment_date from appointment where patient_id ='" + Patient_ID_.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("appointment_date");
                Appointment_Date_.setText(add1);
                d_id = rs.getString("doctor_id");

            } else {
                Patient_ID_.setText("");
                Doctor_Name_.setText("");
                Appointment_Date_.setText("");
                Appointment_Time_.setText("");
                JOptionPane.showMessageDialog(this, "You Have No Appointment", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String sql1 = "select doctorname,office_hour from doctor where doctorid ='" + d_id + "'";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("doctorname");
                Doctor_Name_.setText(add1);
                String add2 = rs.getString("office_hour");
                Appointment_Time_.setText(add2);

            } else {
                Patient_ID_.setText("");
                Doctor_Name_.setText("");
                Appointment_Date_.setText("");
                Appointment_Time_.setText("");
                JOptionPane.showMessageDialog(this, "You Have No Appointment", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_View_ActionPerformed

    private void Back_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ActionPerformed
        this.dispose();
        Patient_Panel Pat_P = new Patient_Panel();
        Pat_P.setVisible(true);
    }//GEN-LAST:event_Back_ActionPerformed

    private void New_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_ActionPerformed
        Patient_ID_.setText("");
        Doctor_Name_.setText("");
        Appointment_Date_.setText("");
        Appointment_Time_.setText("");
    }//GEN-LAST:event_New_ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        Patient_Panel Pat_P = new Patient_Panel();
        Pat_P.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Appointment_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Appointment_Date_;
    private javax.swing.JTextField Appointment_Time_;
    private javax.swing.JButton Back_;
    private javax.swing.JTextField Doctor_Name_;
    private javax.swing.JButton New_;
    private javax.swing.JTextField Patient_ID_;
    private javax.swing.JButton View_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
