package model;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author allen
 */
public class SendEmail {
    
    public static void main(String [] args){
    final String username = "dumbestcodecs@gmail.com";//dumbestcodecs@gmail.com
    final String password = "AllanCodecs1995";//AllanCodecs1995
    String fromEmail = "dumbestcodecs@gmail.com";
    String toEmail = "alanben93@gmail.com";
    
    Properties properties = new Properties();
    properties.put("mail.smtp.auth","true");
    properties.put("mail.smtp.starttls.enable","true");
    properties.put("mail.smtp.host", "smtp.gmail.com");
    properties.put("mail.smtp.port", "587");
    
    Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
        
    protected PasswordAuthentication getPasswordAuthentication(){
    return new PasswordAuthentication(username,password);
    }
    });
    MimeMessage mime = new MimeMessage(session);
        try {
            mime.setFrom(new InternetAddress(fromEmail));
            mime.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            mime.setSubject("Subject of this email");
            mime.setText("Email Text");
            Transport.send(mime);
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
        }
}
