/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.disciplinary.system.view;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author allen
 */
public class SendCaseEmail extends javax.swing.JFrame {

    /**
     * Creates new form SendEmail
     */
    public SendCaseEmail() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnsendmsg = new javax.swing.JButton();
        txtmsgreceiver = new javax.swing.JTextField();
        txtmsgsender = new javax.swing.JTextField();
        txtmsgsubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtmsg = new javax.swing.JTextArea();
        btnbtncancelmsg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel1.setText("Send Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 80));

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel2.setText("To");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 190, 40));

        jLabel3.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel3.setText("From");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 190, 40));

        jLabel4.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel4.setText("Subject");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 190, 30));

        jLabel5.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel5.setText("Message");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 190, 40));

        btnsendmsg.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        btnsendmsg.setText("Send Message");
        btnsendmsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendmsgActionPerformed(evt);
            }
        });
        jPanel1.add(btnsendmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 130, 50));

        txtmsgreceiver.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jPanel1.add(txtmsgreceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 310, 40));

        txtmsgsender.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        txtmsgsender.setText("schooldisciplinarysystem@gmail.com");
        jPanel1.add(txtmsgsender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 310, 40));

        txtmsgsubject.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        jPanel1.add(txtmsgsubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 310, 40));

        jtxtmsg.setColumns(20);
        jtxtmsg.setRows(5);
        jScrollPane1.setViewportView(jtxtmsg);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 310, 130));

        btnbtncancelmsg.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        btnbtncancelmsg.setText("Close");
        btnbtncancelmsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbtncancelmsgActionPerformed(evt);
            }
        });
        jPanel1.add(btnbtncancelmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsendmsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendmsgActionPerformed
        
        String toEmail = txtmsgreceiver.getText();
        String fromEmail = txtmsgsender.getText();
        String fromEmailPassword = "qwerty123!@#";
        String subjectEmail = txtmsgsubject.getText();
                
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
        
        @Override
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(fromEmail,fromEmailPassword);
            }
        });
        try{
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(fromEmail));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
        message.setSubject(subjectEmail);
        message.setText(jtxtmsg.getText());
        Transport.send(message);
        
        JOptionPane.showMessageDialog(null, "Email sent");
        txtmsgreceiver.setText("");
        jtxtmsg.setText("");
        //txtmsgsender.setText("");
        txtmsgsubject.setText("");
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnsendmsgActionPerformed

    private void btnbtncancelmsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbtncancelmsgActionPerformed
        this.dispose();
        AdminMainMenu adminMM = new AdminMainMenu();
        adminMM.setVisible(true);
    }//GEN-LAST:event_btnbtncancelmsgActionPerformed

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
            java.util.logging.Logger.getLogger(SendCaseEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendCaseEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendCaseEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendCaseEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendCaseEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbtncancelmsg;
    private javax.swing.JButton btnsendmsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxtmsg;
    private javax.swing.JTextField txtmsgreceiver;
    private javax.swing.JTextField txtmsgsender;
    private javax.swing.JTextField txtmsgsubject;
    // End of variables declaration//GEN-END:variables
}
