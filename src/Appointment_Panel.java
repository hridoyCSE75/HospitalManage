
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Appointment_Panel extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Appointment_Panel() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Doctor_ID_ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Doctor_Name_ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Specialisation_ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Visite_ = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Off_Day_ = new javax.swing.JTextField();
        Office_Hour_ = new javax.swing.JTextField();
        Patient_ID_ = new javax.swing.JTextField();
        Get_Appointment_ = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Appointment_Date_ = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        New_ = new javax.swing.JButton();
        Back_ = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(690, 615));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Appointment");

        jLabel2.setText("Patient ID");

        jLabel3.setText("Doctor ID");

        Doctor_Name_.setEditable(false);

        jLabel4.setText("Doctor Name");

        Specialisation_.setEditable(false);

        jLabel8.setText("Specialization");

        Visite_.setEditable(false);

        jLabel12.setText("Visit");

        jLabel13.setText("Off Day");

        jLabel14.setText("Office Hour");

        Off_Day_.setEditable(false);

        Office_Hour_.setEditable(false);

        Get_Appointment_.setText("Get Appointment");
        Get_Appointment_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Get_Appointment_ActionPerformed(evt);
            }
        });

        jLabel10.setText("Appointment Date");

        Appointment_Date_.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel22.setText("(DD/MM/YYYY)");

        New_.setText("New");
        New_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_ActionPerformed(evt);
            }
        });

        Back_.setText("Back");
        Back_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Doctor Info");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/blur8.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(Specialisation_, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel13))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel10)
                .addGap(253, 253, 253)
                .addComponent(jLabel22))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel12))
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(Appointment_Date_, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(Doctor_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(Patient_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(514, 514, 514)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(New_))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(Office_Hour_, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(Get_Appointment_))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel14))
            .addGroup(layout.createSequentialGroup()
                .addGap(514, 514, 514)
                .addComponent(Doctor_Name_, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(Off_Day_, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(Back_))
            .addGroup(layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(Visite_, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addComponent(Specialisation_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel13)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel22)))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel12))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(Appointment_Date_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(Doctor_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(Patient_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(New_))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(Office_Hour_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(Get_Appointment_))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel14))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(Doctor_Name_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(Off_Day_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(Back_))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(Visite_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Get_Appointment_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Get_Appointment_ActionPerformed
        con = Connect.ConnectDB();
        String sql = "select DoctorID,Doctorname,Specialization,visit,off_day,office_hour from Doctor where DoctorID ='" + Doctor_ID_.getText() + "'";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("Doctorname");
                Doctor_Name_.setText(add1);
                String add2 = rs.getString("Specialization");
                Specialisation_.setText(add2);
                String add3 = rs.getString("visit");
                Visite_.setText(add3);
                String add4 = rs.getString("off_day");
                Off_Day_.setText(add4);
                String add5 = rs.getString("office_hour");
                Office_Hour_.setText(add5);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        //---------------------------------
        try {
            con = Connect.ConnectDB();
            if (Patient_ID_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Patient ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (Doctor_ID_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Doctor ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (Appointment_Date_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Appointment Date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Statement stmt;
            stmt = con.createStatement();

            /*String sql1 = "Select DoctorID from Doctor where DoctorID= '" + ID_.getText() + "'";
            rs = stmt.executeQuery(sql1);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Doctor ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                ID_.setText("");
                ID_.requestDefaultFocus();
                return;
            }*/
            String sql1 = "insert into appointment(Doctor_ID,patient_id,appointment_date)values('" + Doctor_ID_.getText() + "','" + Patient_ID_.getText() + "','" + Appointment_Date_.getText() + "')";
            pst = con.prepareStatement(sql1);
            pst.execute();

            JOptionPane.showMessageDialog(this, "Successfully saved", "Doctor Record", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_Get_Appointment_ActionPerformed

    private void New_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_ActionPerformed
        Patient_ID_.setText("");
        Doctor_ID_.setText("");
        Doctor_Name_.setText("");
        Appointment_Date_.setText("");
        Specialisation_.setText("");
        Visite_.setText("");
        Off_Day_.setText("");
        Office_Hour_.setText("");
    }//GEN-LAST:event_New_ActionPerformed

    private void Back_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ActionPerformed
        this.dispose();
        //Patient_Panel Pat_P = new Patient_Panel();
        //Pat_P.setVisible(true);
    }//GEN-LAST:event_Back_ActionPerformed

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
            java.util.logging.Logger.getLogger(Appointment_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFormattedTextField Appointment_Date_;
    private javax.swing.JButton Back_;
    public javax.swing.JTextField Doctor_ID_;
    public javax.swing.JTextField Doctor_Name_;
    private javax.swing.JButton Get_Appointment_;
    private javax.swing.JButton New_;
    public javax.swing.JTextField Off_Day_;
    public javax.swing.JTextField Office_Hour_;
    private javax.swing.JTextField Patient_ID_;
    public javax.swing.JTextField Specialisation_;
    public javax.swing.JTextField Visite_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
