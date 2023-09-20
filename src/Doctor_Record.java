
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Doctor_Record extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Doctor_Record() {
        initComponents();
        con = Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    private void Get_Data() {
        String sql = "select DoctorID as 'Doctor ID', DoctorName as 'Doctor Name',FatherName as 'Father Name',Address,ContactNo as 'Contact No',Email as 'Email ID',Qualifications,Specialization,Gender,BloodGroup as 'Blood Group',DateOfJoining as 'Joining Date',visit,off_day,office_hour from Doctor order by DoctorName";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            Data_.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Data_ = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Doctors Record");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Data_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Data_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Data_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Data_);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Data_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Data_MouseClicked
        try {
            con = Connect.ConnectDB();
            int row = Data_.getSelectedRow();
            String table_click = Data_.getModel().getValueAt(row, 0).toString();
            String sql = "select * from Doctor where DoctorID = '" + table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                Doctor frm = new Doctor();
                frm.setVisible(true);
                String add1 = rs.getString("DoctorID");
                frm.ID_.setText(add1);
                String add2 = rs.getString("Doctorname");
                frm.Name_.setText(add2);
                String add3 = rs.getString("Fathername");
                frm.Father_Name_.setText(add3);
                String add5 = rs.getString("Email");
                frm.Email_ID_.setText(add5);
                String add6 = rs.getString("Qualifications");
                frm.Qualifications_.setText(add6);
                String add7 = rs.getString("Specialization");
                frm.Specialisation_.setText(add7);
                String add9 = rs.getString("BloodGroup");
                frm.Blood_Group_.setSelectedItem(add9);
                String add11 = rs.getString("Gender");
                frm.Gender_.setSelectedItem(add11);
                String add14 = rs.getString("DateOfJoining");
                frm.Date_Of_Joining_.setText(add14);
                String add15 = rs.getString("Address");
                frm.Address_.setText(add15);
                String add16 = rs.getString("ContactNo");
                frm.Contact_No_.setText(add16);
                String add17 = rs.getString("visit");
                frm.Visite_.setText(add17);
                String add18 = rs.getString("off_day");
                frm.Off_Day_.setSelectedItem(add18);
                String add19 = rs.getString("office_hour");
                frm.Office_Hour_.setSelectedItem(add19);
                
                frm.Update_.setEnabled(true);
                frm.Delete_.setEnabled(true);
                frm.Save_.setEnabled(false);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_Data_MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.hide();
        Doctor frm = new Doctor();
        frm.setVisible(true);
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_Record().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Data_;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
