package student.disciplinary.system.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class AdminLogIn extends javax.swing.JFrame {

    //Creates new form TestFrame   
    Connection conn7 = null;
    MainMenu mainMenu = new MainMenu();
    public AdminLogIn() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtAdminUserName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        adminPasswordField = new javax.swing.JPasswordField();
        btnAdminLogIn = new javax.swing.JButton();
        btnCancelLogIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel6.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 102));
        jLabel6.setText("Username");

        txtAdminUserName.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 102));
        jLabel7.setText("Password");

        adminPasswordField.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N

        btnAdminLogIn.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        btnAdminLogIn.setForeground(new java.awt.Color(204, 0, 102));
        btnAdminLogIn.setText("Log In");
        btnAdminLogIn.setToolTipText("Submit details and continue to main menu.");
        btnAdminLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLogInActionPerformed(evt);
            }
        });

        btnCancelLogIn.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        btnCancelLogIn.setForeground(new java.awt.Color(204, 0, 102));
        btnCancelLogIn.setText("Cancel");
        btnCancelLogIn.setToolTipText("Cancel Log-in and exit system.");
        btnCancelLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelLogInActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("Student Disciplinary Management System");

        jRadioButton1.setFont(new java.awt.Font("Papyrus", 0, 11)); // NOI18N
        jRadioButton1.setText("Admin");
        jRadioButton1.setOpaque(false);

        jRadioButton2.setFont(new java.awt.Font("Papyrus", 0, 11)); // NOI18N
        jRadioButton2.setText("User");
        jRadioButton2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel2.setText("Forgot Password?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnAdminLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdminUserName)
                            .addComponent(adminPasswordField)
                            .addComponent(btnCancelLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminPasswordField))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminLogIn)
                    .addComponent(btnCancelLogIn))
                .addGap(113, 113, 113))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLogInActionPerformed

//     if(txtAdminUserName.getText().equals(Admin) && adminPasswordField.getPassword().equals(admin)){
          
        mainMenu.setVisible(true);
        this.dispose();
//       }
//     else{
//         JOptionPane.showMessageDialog(null, "Wrong Password. Please try again");
//         this.setVisible(true);
//     }
    }//GEN-LAST:event_btnAdminLogInActionPerformed

    private void btnCancelLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelLogInActionPerformed
        // TODO add your handling code here:

        int result = JOptionPane.showConfirmDialog(null,
            "Are you sure you wish to cancel log-in and Exit Application?",null, JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        else{
            AdminLogIn adminLogIn = new AdminLogIn();
            adminLogIn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelLogInActionPerformed
public static void main(String args[]) {

    /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogIn().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField adminPasswordField;
    private javax.swing.JButton btnAdminLogIn;
    private javax.swing.JButton btnCancelLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txtAdminUserName;
    // End of variables declaration//GEN-END:variables

public void userLogIn(){

    try{
        String userlogin = "SELECT username, password FROM users WHERE username = ? AND password = ?";
        PreparedStatement pst2 = conn7.prepareStatement(userlogin);
        pst2.setString(1, txtAdminUserName.getText());
        pst2.setString(2, adminPasswordField.getText());
        ResultSet rs = pst2.executeQuery();
                        
        /*if(rs.next()){
           txtSearchRegNo.setText(rs.getString("registrationnumber"));
           }
           else{
           JOptionPane.showMessageDialog(null, "Record not found!");
           }
           tblDisciplinaryCases.setModel(DbUtils.resultSetToTableModel(rs));*/
        }
        catch(Exception exception){
        JOptionPane.showMessageDialog(null, exception);
        }
}
}