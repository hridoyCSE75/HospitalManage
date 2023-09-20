import java.awt.Color;

public class Admin_Panel extends javax.swing.JFrame {


    public Admin_Panel() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Doctore_ = new javax.swing.JButton();
        Employee_ = new javax.swing.JButton();
        Room_ = new javax.swing.JButton();
        Patient_ = new javax.swing.JButton();
        Admin_Registration_Details_ = new javax.swing.JButton();
        Patient_Registration_Details_ = new javax.swing.JButton();
        Employee_Registration_Details_ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("admin panel");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                   Admin Panel");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 30, 275, 53));

        Doctore_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/doctor.jpg"))); // NOI18N
        Doctore_.setPreferredSize(new java.awt.Dimension(100, 100));
        Doctore_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Doctore_ActionPerformed(evt);
            }
        });
        getContentPane().add(Doctore_, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 140, 108, 109));

        Employee_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/employee.jpg"))); // NOI18N
        Employee_.setPreferredSize(new java.awt.Dimension(100, 100));
        Employee_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_ActionPerformed(evt);
            }
        });
        getContentPane().add(Employee_, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 141, 110, 108));

        Room_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/room.jpg"))); // NOI18N
        Room_.setPreferredSize(new java.awt.Dimension(100, 100));
        Room_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Room_ActionPerformed(evt);
            }
        });
        getContentPane().add(Room_, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 140, 108, 109));

        Patient_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/patient.jpg"))); // NOI18N
        Patient_.setPreferredSize(new java.awt.Dimension(100, 100));
        Patient_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Patient_ActionPerformed(evt);
            }
        });
        getContentPane().add(Patient_, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 140, -1, 109));

        Admin_Registration_Details_.setBackground(new java.awt.Color(255, 255, 255));
        Admin_Registration_Details_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Admin_Registration_Details_.setForeground(new java.awt.Color(51, 204, 255));
        Admin_Registration_Details_.setText("Admin Registration Details");
        Admin_Registration_Details_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_Registration_Details_ActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_Registration_Details_, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 338, 301, 47));

        Patient_Registration_Details_.setBackground(new java.awt.Color(255, 255, 255));
        Patient_Registration_Details_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Patient_Registration_Details_.setForeground(new java.awt.Color(51, 204, 255));
        Patient_Registration_Details_.setText("Patient Registration Details");
        Patient_Registration_Details_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Patient_Registration_Details_ActionPerformed(evt);
            }
        });
        getContentPane().add(Patient_Registration_Details_, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 403, 301, 45));

        Employee_Registration_Details_.setBackground(new java.awt.Color(255, 255, 255));
        Employee_Registration_Details_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Employee_Registration_Details_.setForeground(new java.awt.Color(51, 204, 255));
        Employee_Registration_Details_.setText("Employee Registration Details");
        Employee_Registration_Details_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_Registration_Details_ActionPerformed(evt);
            }
        });
        getContentPane().add(Employee_Registration_Details_, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 466, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Untitled-1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 4, 103, -1));

        jLabel3.setBackground(new java.awt.Color(51, 204, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  Doctor");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 267, 65, -1));

        jLabel4.setBackground(new java.awt.Color(51, 204, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Patient");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 267, 65, -1));

        jLabel5.setBackground(new java.awt.Color(51, 204, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Employee");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 267, 83, -1));

        jLabel6.setBackground(new java.awt.Color(51, 204, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Room");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 267, 56, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/blur9.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Doctore_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Doctore_ActionPerformed
        this.dispose();
        Doctor Doc = new Doctor();
        Doc.setVisible(true);
    }//GEN-LAST:event_Doctore_ActionPerformed

    private void Employee_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_ActionPerformed
        this.dispose();
        Employee frm = new Employee();
        frm.setVisible(true);
    }//GEN-LAST:event_Employee_ActionPerformed

    private void Room_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Room_ActionPerformed
        this.dispose();
        Room frm = new Room();
        frm.setVisible(true);
    }//GEN-LAST:event_Room_ActionPerformed

    private void Patient_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Patient_ActionPerformed
        this.dispose();
        Patient_Admin_Panel frm = new Patient_Admin_Panel();
        frm.setVisible(true);
    }//GEN-LAST:event_Patient_ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        Home Hom = new Home();
        Hom.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void Admin_Registration_Details_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_Registration_Details_ActionPerformed
        this.dispose();
        Admin_Registration Adm_R = new Admin_Registration();
        Adm_R.setVisible(true);
    }//GEN-LAST:event_Admin_Registration_Details_ActionPerformed

    private void Patient_Registration_Details_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Patient_Registration_Details_ActionPerformed
        this.dispose();
        Admin_Patient_Registration Adm_P_R = new Admin_Patient_Registration();
        Adm_P_R.setVisible(true);
    }//GEN-LAST:event_Patient_Registration_Details_ActionPerformed

    private void Employee_Registration_Details_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_Registration_Details_ActionPerformed
        this.dispose();
        Admin_Employee_Registration Adm_E_R = new Admin_Employee_Registration();
        Adm_E_R.setVisible(true);
    }//GEN-LAST:event_Employee_Registration_Details_ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin_Registration_Details_;
    private javax.swing.JButton Doctore_;
    private javax.swing.JButton Employee_;
    private javax.swing.JButton Employee_Registration_Details_;
    private javax.swing.JButton Patient_;
    private javax.swing.JButton Patient_Registration_Details_;
    private javax.swing.JButton Room_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
