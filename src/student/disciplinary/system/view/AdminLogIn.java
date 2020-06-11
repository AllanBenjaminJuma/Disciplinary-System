package student.disciplinary.system.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class AdminLogIn extends javax.swing.JFrame {

    //Creates new form TestFrame   
    Connection conn70 = null;
    PreparedStatement pstatement = null;
    ResultSet rset = null;
    AdminMainMenu mainMenu = new AdminMainMenu();
    public Connection getConn(){
    
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException classNotFoundException) {
            
            JOptionPane.showMessageDialog(null, classNotFoundException);
        }
               
        try{
        String url = "jdbc:postgresql://localhost:5432/schooldiscplinarysystem";
        String username = "postgres";
        String password = "tECH$AV!!!!";
    
        conn70 = DriverManager.getConnection(url, username, password);
        // JOptionPane.showMessageDialog(null, "Connected");
    }catch(SQLException exception){
        
            exception.printStackTrace();
        }
    return conn70;
    }
    
    public AdminLogIn() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAdminUserName = new javax.swing.JTextField();
        adminPasswordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxselectUserType = new javax.swing.JComboBox();
        btnAdminLogIn = new javax.swing.JButton();
        btnCancelLogIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel6.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 102));
        jLabel6.setText("Username");

        jLabel7.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 102));
        jLabel7.setText("Password");

        txtAdminUserName.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        txtAdminUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminUserNameActionPerformed(evt);
            }
        });

        adminPasswordField.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 102));
        jLabel3.setText("Select User Type");

        jComboBoxselectUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "admin", "user" }));

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

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel2.setText("Forgot Password?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdminLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxselectUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxselectUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminLogIn)
                    .addComponent(btnCancelLogIn))
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(50, 50, 50))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 530, 310));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Disciplinary Management System");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLogInActionPerformed
        if(txtAdminUserName.getText()== "Admin" && adminPasswordField.getText()=="Admin"){
        mainMenu.setVisible(true);
        
        }
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

    private void txtAdminUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminUserNameActionPerformed
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
    private javax.swing.JComboBox jComboBoxselectUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtAdminUserName;
    // End of variables declaration//GEN-END:variables

}