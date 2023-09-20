
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Doctor extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Doctor() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ID_ = new javax.swing.JTextField();
        Name_ = new javax.swing.JTextField();
        Father_Name_ = new javax.swing.JTextField();
        Address_ = new javax.swing.JTextField();
        Contact_No_ = new javax.swing.JTextField();
        Email_ID_ = new javax.swing.JTextField();
        Qualifications_ = new javax.swing.JTextField();
        Specialisation_ = new javax.swing.JTextField();
        Date_Of_Joining_ = new javax.swing.JFormattedTextField();
        Blood_Group_ = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        Gender_ = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Visite_ = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Off_Day_ = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Office_Hour_ = new javax.swing.JComboBox<>();
        New_ = new javax.swing.JButton();
        Save_ = new javax.swing.JButton();
        Delete_ = new javax.swing.JButton();
        Update_ = new javax.swing.JButton();
        Get_Data_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Doctor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Father's Name");

        jLabel4.setText("Address");

        jLabel5.setText("Contact No.");

        jLabel6.setText("Email ID");

        jLabel7.setText("Qualifications");

        jLabel8.setText("Specialization");

        jLabel9.setText("Blood Group");

        jLabel10.setText("Date Of Joining");

        Date_Of_Joining_.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        Blood_Group_.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        Blood_Group_.setSelectedIndex(-1);

        jLabel11.setText("Gender");

        Gender_.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        Gender_.setSelectedIndex(-1);

        jLabel22.setText("(DD/MM/YYYY)");

        jLabel12.setText("Visite");

        jLabel13.setText("Off Day");

        Off_Day_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI" }));
        Off_Day_.setSelectedIndex(-1);

        jLabel14.setText("Office Hour");

        Office_Hour_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00 AM - 01:00 PM", "02:00 PM - 07:00 PM", "07:00 PM - 12:00 AM " }));
        Office_Hour_.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Office_Hour_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ID_, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Name_)
                        .addComponent(Father_Name_, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addComponent(Contact_No_, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Address_, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Qualifications_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addComponent(Specialisation_, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Email_ID_, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(Blood_Group_, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender_, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Visite_, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date_Of_Joining_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22))
                    .addComponent(Off_Day_, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ID_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Name_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Father_Name_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Address_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Contact_No_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Email_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Qualifications_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Specialisation_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Gender_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Blood_Group_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Date_Of_Joining_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Visite_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Off_Day_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Office_Hour_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        New_.setText("New");
        New_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_ActionPerformed(evt);
            }
        });

        Save_.setText("Save");
        Save_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_ActionPerformed(evt);
            }
        });

        Delete_.setText("Delete");
        Delete_.setEnabled(false);
        Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ActionPerformed(evt);
            }
        });

        Update_.setText("Update");
        Update_.setEnabled(false);
        Update_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ActionPerformed(evt);
            }
        });

        Get_Data_.setText("Get Data");
        Get_Data_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Get_Data_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(New_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Update_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Get_Data_)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(New_)
                    .addComponent(Save_)
                    .addComponent(Delete_)
                    .addComponent(Update_)
                    .addComponent(Get_Data_))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Reset() {
        ID_.setText("");
        Name_.setText("");
        Father_Name_.setText("");
        Contact_No_.setText("");
        Address_.setText("");
        Qualifications_.setText("");
        Email_ID_.setText("");
        Specialisation_.setText("");
        Date_Of_Joining_.setText("");
        Blood_Group_.setSelectedIndex(-1);
        Gender_.setSelectedIndex(-1);
        Visite_.setText("");
        Off_Day_.setSelectedIndex(-1);
        Office_Hour_.setSelectedIndex(-1);
        Save_.setEnabled(true);
        Update_.setEnabled(false);
        Delete_.setEnabled(false);
        ID_.requestDefaultFocus();

    }
    private void New_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_ActionPerformed
        Reset();
    }//GEN-LAST:event_New_ActionPerformed

    private void Save_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_ActionPerformed
        try {
            con = Connect.ConnectDB();
            if (ID_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter doctor id", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (Name_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter doctor name", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (Father_Name_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Father's name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (Address_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter address", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (Contact_No_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter contact no.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (Qualifications_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter qualifications", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (Specialisation_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter specialization", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (Gender_.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Please select gender", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (Blood_Group_.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Please select blood group", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (Date_Of_Joining_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter joining date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (Visite_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Visite", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (Off_Day_.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Please select Off Day", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (Office_Hour_.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Please select Office Hour", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Statement stmt;
            stmt = con.createStatement();
            String sql1 = "Select DoctorID from Doctor where DoctorID= '" + ID_.getText() + "'";
            rs = stmt.executeQuery(sql1);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Doctor ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                ID_.setText("");
                ID_.requestDefaultFocus();
                return;
            }
            String sql = "insert into Doctor(DoctorID,DoctorName,FatherName,Email,ContactNo,Qualifications,Specialization,Gender,Bloodgroup,DateOfJoining,Address,visit,off_day,office_hour) values('" + ID_.getText() + "','" + Name_.getText() + "','" + Father_Name_.getText() + "','" + Email_ID_.getText() + "','" + Contact_No_.getText() + "','" + Qualifications_.getText() + "','" + Specialisation_.getText() + "','" + Gender_.getSelectedItem() + "','" + Blood_Group_.getSelectedItem() + "','" + Date_Of_Joining_.getText() + "','" + Address_.getText()+"','" + Visite_.getText() +"','"+Off_Day_.getSelectedItem()+"','"+Office_Hour_.getSelectedItem()+ "')";
            pst = con.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(this, "Successfully saved", "Doctor Record", JOptionPane.INFORMATION_MESSAGE);
            Save_.setEnabled(false);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_Save_ActionPerformed

    private void Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ActionPerformed
        try {
            int P = JOptionPane.showConfirmDialog(null, " Are you sure want to delete ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (P == 0) {
                con = Connect.ConnectDB();
                String sql = "delete from Doctor where DoctorID = '" + ID_.getText() + "'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully deleted", "Record", JOptionPane.INFORMATION_MESSAGE);

                Reset();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_Delete_ActionPerformed

    private void Update_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ActionPerformed
        try {
            con = Connect.ConnectDB();
            String sql = "update Doctor set Doctorname='" + Name_.getText() + "',FatherName='" + Father_Name_.getText() + "',Email='" + Email_ID_.getText() + "',ContactNo='" + Contact_No_.getText() + "',Qualifications='" + Qualifications_.getText() + "',Specialization='" + Specialisation_.getText() + "',Gender='" + Gender_.getSelectedItem() + "',BloodGroup='" + Blood_Group_.getSelectedItem() + "',DateOfJoining='" + Date_Of_Joining_.getText() + "',Address='" + Address_.getText() +"',visit='"+Visite_.getText()+"',off_day='"+Off_Day_.getSelectedItem()+"',office_hour='"+Office_Hour_.getSelectedItem()+ "' where DoctorID='" + ID_.getText() + "'";

            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Successfully updated", "Doctor Record", JOptionPane.INFORMATION_MESSAGE);
            Update_.setEnabled(false);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_Update_ActionPerformed

    private void Get_Data_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Get_Data_ActionPerformed
        this.hide();
        Doctor_Record frm = new Doctor_Record();
        frm.setVisible(true);
    }//GEN-LAST:event_Get_Data_ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.dispose();
        Admin_Panel Adm_P = new Admin_Panel();
        Adm_P.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Address_;
    public javax.swing.JComboBox Blood_Group_;
    public javax.swing.JTextField Contact_No_;
    public javax.swing.JFormattedTextField Date_Of_Joining_;
    public javax.swing.JButton Delete_;
    public javax.swing.JTextField Email_ID_;
    public javax.swing.JTextField Father_Name_;
    public javax.swing.JComboBox Gender_;
    private javax.swing.JButton Get_Data_;
    public javax.swing.JTextField ID_;
    public javax.swing.JTextField Name_;
    private javax.swing.JButton New_;
    public javax.swing.JComboBox<String> Off_Day_;
    public javax.swing.JComboBox<String> Office_Hour_;
    public javax.swing.JTextField Qualifications_;
    public javax.swing.JButton Save_;
    public javax.swing.JTextField Specialisation_;
    public javax.swing.JButton Update_;
    public javax.swing.JTextField Visite_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
