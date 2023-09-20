
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Admin_Registration extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Admin_Registration() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    private void Reset() {
        Name_.setText("");
        User_Name_.setText("");
        Password_.setText("");
        Email_ID_.setText("");
        Phone_.setText("");
        Save_.setEnabled(true);
        Delete_.setEnabled(false);
        Update_.setEnabled(false);
        User_Name_.requestDefaultFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Name_ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        User_Name_ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Password_ = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        Email_ID_ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Phone_ = new javax.swing.JTextField();
        New_ = new javax.swing.JButton();
        Save_ = new javax.swing.JButton();
        Delete_ = new javax.swing.JButton();
        Update_ = new javax.swing.JButton();
        Data_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_ = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Registration");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Name");

        jLabel2.setText("User Name");

        jLabel3.setText("Password");

        jLabel4.setText("Email ID");

        jLabel5.setText("Contact No.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Email_ID_)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Password_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(Name_, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Phone_)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(User_Name_, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Name_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_Name_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Password_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Email_ID_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Phone_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        Data_.setText("Get Data");
        Data_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data_ActionPerformed(evt);
            }
        });

        Table_.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(New_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Update_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Data_)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(New_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Save_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Delete_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Update_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Data_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void New_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_ActionPerformed
        Reset();
    }//GEN-LAST:event_New_ActionPerformed

    private void Save_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_ActionPerformed
        try {
            con = Connect.ConnectDB();
            if (Name_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (User_Name_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter user name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String Password = String.valueOf(Password_.getPassword());
            if (Password.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter password", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (Phone_.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter contact no.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Statement stmt;
            stmt = con.createStatement();
            String sql1 = "Select user_name from admin_login where user_name= '" + User_Name_.getText() + "'";
            rs = stmt.executeQuery(sql1);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "User name already exists", "Error", JOptionPane.ERROR_MESSAGE);
                User_Name_.setText("");
                User_Name_.requestDefaultFocus();
                return;
            }
            String Password1 = String.valueOf(Password_.getPassword());
            String sql = "insert into admin_login(user_name,user_password,name,Email,phone)values('" + User_Name_.getText() + "','" + Password1 + "','" + Name_.getText() + "','" + Email_ID_.getText() + "','" + Phone_.getText() + "')";
            pst = con.prepareStatement(sql);
            pst.execute();

            //String sql2 = "insert into Users(username,user_password)values('" + User_Name_.getText() + "','" + Password1 + "')";
            //pst = con.prepareStatement(sql2);
            //pst.execute();
            JOptionPane.showMessageDialog(this, "Successfully Registered", "User", JOptionPane.INFORMATION_MESSAGE);
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

                String sql = "delete from admin_login where User_name = '" + User_Name_.getText() + "'";
                pst = con.prepareStatement(sql);
                pst.execute();

                //String sql1 = "delete from Users where Username = '" + User_Name_.getText() + "'";
                //pst = con.prepareStatement(sql1);
                //pst.execute();
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
            String Password1 = String.valueOf(Password_.getPassword());
            String sql = "update admin_login set user_password='" + Password1 + "',name='" + Name_.getText() + "',Email='" + Email_ID_.getText() + "',phone='" + Phone_.getText() + "' where User_name='" + User_Name_.getText() + "'";
            pst = con.prepareStatement(sql);
            pst.execute();

            //String sql2 = "update Users set user_password='" + Password1 + "' where username='" + User_Name_.getText() + "'";
            //pst = con.prepareStatement(sql2);
            //pst.execute();
            JOptionPane.showMessageDialog(this, "Successfully updated", "User info", JOptionPane.INFORMATION_MESSAGE);
            Update_.setEnabled(false);
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_Update_ActionPerformed

    private void Data_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data_ActionPerformed
        con = Connect.ConnectDB();
        String sql = "select name as 'Name', user_name as 'User Name',user_Password as 'Password',phone as 'Phone',email as 'Email' from admin_login";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            Table_.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_Data_ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        Admin_Panel Adm_P = new Admin_Panel();
        Adm_P.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void Table_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_MouseClicked
        try {
            con = Connect.ConnectDB();
            int row = Table_.getSelectedRow();
            String table_click = Table_.getModel().getValueAt(row, 1).toString();
            String sql = "select * from admin_login where user_name= '" + table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {

                String add1 = rs.getString("user_name");
                User_Name_.setText(add1);
                String add2 = rs.getString("user_password");
                Password_.setText(add2);
                String add3 = rs.getString("name");
                Name_.setText(add3);
                String add4 = rs.getString("phone");
                Phone_.setText(add4);
                String add5 = rs.getString("email");
                Email_ID_.setText(add5);
                Save_.setEnabled(false);
                Delete_.setEnabled(true);
                Update_.setEnabled(true);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_Table_MouseClicked

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
            java.util.logging.Logger.getLogger(Admin_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Admin_Registration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Data_;
    public javax.swing.JButton Delete_;
    public javax.swing.JTextField Email_ID_;
    public javax.swing.JTextField Name_;
    private javax.swing.JButton New_;
    public javax.swing.JPasswordField Password_;
    public javax.swing.JTextField Phone_;
    public javax.swing.JButton Save_;
    private javax.swing.JTable Table_;
    public javax.swing.JButton Update_;
    public javax.swing.JTextField User_Name_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
