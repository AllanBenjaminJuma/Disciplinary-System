/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.disciplinary.system.view;

import model.SendEmail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author allen
 */
public class DisciplinaryCases extends javax.swing.JFrame {

   public Connection conn5 = null;
    Statement stmt = null;
    
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
    
        conn5 = DriverManager.getConnection(url, username, password);
        // JOptionPane.showMessageDialog(null, "Connected");
    }catch(SQLException exception){
        
            exception.printStackTrace();
        }
    return conn5;
    }
    /*public void fetch_Data(){
        try{
        getConn();
        String extractfromdatabase = "SELECT * FROM disciplinarycase";
        ResultSet rs = stmt.executeQuery(extractfromdatabase);
        tblDisciplinaryCases.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null, e);
        }
    }*/
    MainMenu mainMenu = new MainMenu();
    SendEmail sender = new SendEmail();
    
    public DisciplinaryCases() {
        initComponents();
        show_cases();
        setLocationRelativeTo(null);
        }

   public ArrayList<Discipline>disciplineList(){//we declare an arraylist. we use this cause it's expandable
       ArrayList<Discipline> disciplineryCases = new ArrayList<>();//an array isn't expandable and we can't use it cause
       getConn();// we'll definately add more data to the database i.e more cases
       try{
       String selectdisciplinarycases = "SELECT * FROM disciplinarycase";//this query retrieves all the data
       Statement stmt = conn5.createStatement();
       ResultSet rs = stmt.executeQuery(selectdisciplinarycases);
       Discipline discipline;
       
       while(rs.next()){
       
       discipline = new Discipline(rs.getString("casename"), rs.getString("punishment"), rs.getString("date"), rs.getString("registrationnumber"));    
       disciplineryCases.add(discipline);
       }
       }
       catch(SQLException ex){
       JOptionPane.showMessageDialog(null, ex);
       }
       return disciplineryCases;
       }
   public void show_cases(){//this method displays the data from the disciplinary cases table in the database
       // to the disciplinary cases table.
       
       ArrayList<Discipline> list = disciplineList(); //calling the arraylist we created in the previous method
       DefaultTableModel model =  (DefaultTableModel) tblDisciplinaryCases.getModel();//tells comppiler to use the default table model
       Object [] row = new Object [4]; //show that we want display our data in rows
       for(int i=0;i<list.size();i++){//this is used to loop from each row to another
       row[0]=list.get(i).getCaseName();//this is the first row. note is starts from zero
       row[1]=list.get(i).getPunishment();//second row reads as one and so on as it's normally for arrays
       row[2]=list.get(i).getDate();//arrays start counting from zero.
       row[3]=list.get(i).getRegistrationNumber();
       model.addRow(row);//we tell the model to add the rows to the default table model
       }
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisciplinaryCases = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnCloseDisciplanaryCases = new javax.swing.JButton();
        btnSendEmail = new javax.swing.JButton();
        btnAddCase = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaCaseName2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaPunishment2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDate2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRegNumber2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSearchRegNo = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDeleteCase = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel1.setText("Disciplinary Cases");

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDisciplinaryCases.setBackground(new java.awt.Color(0, 204, 255));
        tblDisciplinaryCases.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblDisciplinaryCases.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        tblDisciplinaryCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case Name", "Punishment", "Date", "Registration Number"
            }
        ));
        tblDisciplinaryCases.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tblDisciplinaryCases);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 28, 660, 444));

        jButton1.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jButton1.setText("Print Selected");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, 37));

        btnCloseDisciplanaryCases.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        btnCloseDisciplanaryCases.setText("Close");
        btnCloseDisciplanaryCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseDisciplanaryCasesActionPerformed(evt);
            }
        });
        jPanel2.add(btnCloseDisciplanaryCases, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 116, 37));

        btnSendEmail.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        btnSendEmail.setText("Send Email");
        btnSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmailActionPerformed(evt);
            }
        });
        jPanel2.add(btnSendEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 113, 37));

        btnAddCase.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        btnAddCase.setText("Add Case");
        btnAddCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCaseActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 119, 37));
        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 399, -1, -1));

        jButton2.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 162, 37));

        jLabel4.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel4.setText("Case Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 89, 33));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        jTextAreaCaseName2.setColumns(20);
        jTextAreaCaseName2.setRows(5);
        jScrollPane3.setViewportView(jTextAreaCaseName2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 28, -1, 88));

        jTextAreaPunishment2.setColumns(20);
        jTextAreaPunishment2.setRows(5);
        jScrollPane4.setViewportView(jTextAreaPunishment2);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 152, -1, 86));

        jLabel5.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel5.setText("Punishment");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 152, 89, 35));

        jLabel3.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel3.setText("Date");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 89, 27));
        jPanel2.add(txtDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 274, 166, 27));

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel2.setText("Registration Number");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 329, 129, 30));
        jPanel2.add(txtRegNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 328, 166, 30));

        jLabel6.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jLabel6.setText("Reg No");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 365, 89, 29));
        jPanel2.add(txtSearchRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 90, 27));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 69, 27));

        btnDeleteCase.setText("Delete");
        btnDeleteCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCaseActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeleteCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 174, 35));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseDisciplanaryCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseDisciplanaryCasesActionPerformed
        // TODO add your handling code here:
        this.dispose();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_btnCloseDisciplanaryCasesActionPerformed

    private void btnAddCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCaseActionPerformed
        try {
            
            String insertnewparent = "INSERT INTO disciplinarycase(casename, punishment, registrationnumber)VALUES (?, ?, ?);";
            PreparedStatement pst2 = conn5.prepareStatement(insertnewparent);
            pst2.setString(2, jTextAreaCaseName2.getText());
            pst2.setString(3, jTextAreaPunishment2.getText());
            pst2.setString(1, txtRegNumber2.getText());
            //pst2.setDate(4,new java.sql.(txtDate.getDate())); 
            pst2.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Saved Succesfully");
            
            txtRegNumber2.setText("");
            jTextAreaCaseName2.setText("");
            jTextAreaPunishment2.setText("");
            
            int result =  JOptionPane.showConfirmDialog(null,
                      "Record Saved successfully. Do you want to add another user?",null, JOptionPane.YES_NO_OPTION);
              if(result == JOptionPane.YES_OPTION) {
                  this.setVisible(true);
              }
              else{
                  this.setVisible(false);
                  mainMenu.setVisible(true);
              }
            
        } catch(SQLException sQLException) {
            
            JOptionPane.showMessageDialog(null, sQLException);
            
        }
    }//GEN-LAST:event_btnAddCaseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmailActionPerformed
        
        this.dispose();
        //sender.setVisible(true);
        
    }//GEN-LAST:event_btnSendEmailActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    try{
            String searchRegNo = "SELECT * FROM disciplinarycase WHERE registrationnumber = ?";
            PreparedStatement pst2 = conn5.prepareStatement(searchRegNo);
            pst2.setString(1, txtSearchRegNo.getText());
            ResultSet rs = pst2.executeQuery();
                        
            if(rs.next()){
            txtSearchRegNo.setText(rs.getString("registrationnumber"));
            }
            else{
            JOptionPane.showMessageDialog(null, "Record not found!");
            }
            tblDisciplinaryCases.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception exception){
        JOptionPane.showMessageDialog(null, exception);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCaseActionPerformed

        int result = JOptionPane.showConfirmDialog(null,
            "Are you sure you wish to cancel log-in and Exit Application?",null, JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION) {
            try{
            String deleteCase = "DELETE FROM public.disciplinarycase WHERE registrationnumber = ?";
            PreparedStatement pst2 = conn5.prepareStatement(deleteCase);
            pst2.executeQuery();
        
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        }
        else{
            AdminLogIn adminLogIn = new AdminLogIn();
            adminLogIn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnDeleteCaseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //show_cases();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DisciplinaryCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisciplinaryCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisciplinaryCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisciplinaryCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisciplinaryCases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCase;
    private javax.swing.JButton btnCloseDisciplanaryCases;
    private javax.swing.JButton btnDeleteCase;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSendEmail;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaCaseName2;
    private javax.swing.JTextArea jTextAreaPunishment2;
    public javax.swing.JTable tblDisciplinaryCases;
    private javax.swing.JTextField txtDate2;
    private javax.swing.JTextField txtRegNumber2;
    private javax.swing.JTextField txtSearchRegNo;
    // End of variables declaration//GEN-END:variables
}
