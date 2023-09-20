
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Patient_Discharge_Record extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form PatientDischargeRecord_Room
     */
    public Patient_Discharge_Record() {
        initComponents();
        con = Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    private void Get_Data() {
        try {
            String sql = "Select ID as 'Discharge ID', patient_admit.AdmitID as 'Admit ID',Patient_Registration.PatientID as 'Patient ID',Patient_Registration.PatientName as 'Patient Name',Patient_Registration.Gen as 'Gender',Patient_Registration.BG as 'Blood Group',Disease,AdmitDate as 'Admit Date',Room.RoomNo as 'Room No',Doctor.DoctorID as 'Doctor ID',DoctorName as 'Doctor Name',DischargeDate as 'Discharge Date',DP_Remarks as 'Remarks' from Room,Doctor,Patient_Registration,patient_admit,patient_discharge where Room.RoomNo=patient_admit.RoomNo and Doctor.DoctorID=patient_admit.DoctorID and Patient_Registration.PatientID=patient_admit.PatientID  and patient_admit.admitID= patient_discharge.admitID order by Dischargedate";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Discharge Record");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            con = Connect.ConnectDB();
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            String sql = "Select * from Room,Doctor,Patient_Registration,patient_admit,patient_discharge where Room.RoomNo=patient_admit.RoomNo and Doctor.DoctorID=patient_admit.DoctorID and Patient_Registration.PatientID=patient_admit.PatientID and patient_admit.AdmitID=patient_discharge.admitID and ID=" + table_click + "";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                Patient_Discharge frm = new Patient_Discharge();
                frm.setVisible(true);
                String add1 = rs.getString("DoctorID");
                frm.txtDoctorID.setText(add1);
                String add2 = rs.getString("Doctorname");
                frm.txtDoctorName.setText(add2);
                String add3 = rs.getString("PatientID");
                frm.PatientID.setText(add3);
                String add5 = rs.getString("PatientName");
                frm.txtPatientName.setText(add5);
                String add6 = rs.getString("Gen");
                frm.txtGender.setText(add6);
                String add7 = rs.getString("BG");
                frm.txtBloodGroup.setText(add7);
                String add9 = rs.getString("Disease");
                frm.txtDisease.setText(add9);
                String add11 = rs.getString("AdmitDate");
                frm.txtAdmitDate.setText(add11);
                String add14 = rs.getString("RoomNo");
                frm.txtRoomNo.setText(add14);
                int add16 = rs.getInt("AdmitID");
                String add17 = Integer.toString(add16);
                frm.txtAdmitID.setText(add17);
                String add18 = rs.getString("DischargeDate");
                frm.txtDischargeDate.setText(add18);
                String add19 = rs.getString("DP_Remarks");
                frm.txtRemarks.setText(add19);
                int add20 = rs.getInt("ID");
                String add21 = Integer.toString(add20);
                frm.txtDischargeID.setText(add21);

                frm.btnDelete.setEnabled(true);
                frm.btnSave.setEnabled(false);
                frm.btnUpdate.setEnabled(true);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.hide();
        Patient_Discharge frm = new Patient_Discharge();
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Patient_Discharge_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Discharge_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Discharge_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Discharge_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Discharge_Record().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
