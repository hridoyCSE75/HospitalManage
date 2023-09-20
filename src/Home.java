
import java.awt.Color;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admin_ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Patient_ = new javax.swing.JButton();
        Recciptionist_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        Help_ = new javax.swing.JMenu();
        About_ = new javax.swing.JMenuItem();
        Contact_ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setPreferredSize(new java.awt.Dimension(800, 625));
        setResizable(false);
        getContentPane().setLayout(null);

        Admin_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/admin2.jpg"))); // NOI18N
        Admin_.setPreferredSize(new java.awt.Dimension(150, 150));
        Admin_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_ActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_);
        Admin_.setBounds(80, 280, 159, 147);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("          Login As");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 180, 198, 62);

        jLabel3.setBackground(new java.awt.Color(0, 153, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("   Admin");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 470, 91, 30);

        Patient_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/patient.jpg"))); // NOI18N
        Patient_.setPreferredSize(new java.awt.Dimension(150, 150));
        Patient_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Patient_ActionPerformed(evt);
            }
        });
        getContentPane().add(Patient_);
        Patient_.setBounds(310, 280, 149, 147);

        Recciptionist_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/receiptionist.jpg"))); // NOI18N
        Recciptionist_.setPreferredSize(new java.awt.Dimension(150, 150));
        Recciptionist_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recciptionist_ActionPerformed(evt);
            }
        });
        getContentPane().add(Recciptionist_);
        Recciptionist_.setBounds(560, 280, 147, 147);

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("           Hospital Management System");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 60, 716, 77);

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Patient");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 470, 91, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(0, 153, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Receiptionist");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(570, 470, 126, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/stethoscope.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 820, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 610);

        Help_.setForeground(new java.awt.Color(0, 102, 255));
        Help_.setText("Help");
        Help_.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Help_.setOpaque(true);

        About_.setBackground(new java.awt.Color(0, 153, 255));
        About_.setForeground(new java.awt.Color(255, 255, 255));
        About_.setText("About");
        About_.setOpaque(true);
        About_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_ActionPerformed(evt);
            }
        });
        Help_.add(About_);

        Contact_.setBackground(new java.awt.Color(0, 153, 255));
        Contact_.setForeground(new java.awt.Color(255, 255, 255));
        Contact_.setText("Contact");
        Contact_.setOpaque(true);
        Contact_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contact_ActionPerformed(evt);
            }
        });
        Help_.add(Contact_);

        jMenuBar2.add(Help_);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Recciptionist_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recciptionist_ActionPerformed
        this.dispose();
        Recciptionist_Login frm = new Recciptionist_Login();
        frm.setVisible(true);
    }//GEN-LAST:event_Recciptionist_ActionPerformed

    private void Patient_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Patient_ActionPerformed
        this.dispose();
        Patient_Login frm = new Patient_Login();
        frm.setVisible(true);
    }//GEN-LAST:event_Patient_ActionPerformed

    private void Admin_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_ActionPerformed
        this.dispose();
        Admin_Login frm = new Admin_Login();
        frm.setVisible(true);
    }//GEN-LAST:event_Admin_ActionPerformed

    private void Contact_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contact_ActionPerformed
        
       Contact Con = new Contact();
       Con.setVisible(true);
    }//GEN-LAST:event_Contact_ActionPerformed

    private void About_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_ActionPerformed

       About Abo = new About();
       Abo.setVisible(true);
       
    }//GEN-LAST:event_About_ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About_;
    private javax.swing.JButton Admin_;
    private javax.swing.JMenuItem Contact_;
    private javax.swing.JMenu Help_;
    private javax.swing.JButton Patient_;
    private javax.swing.JButton Recciptionist_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
