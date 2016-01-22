/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.email;

/**
 *
 * @author pu
 */
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class SendEmail {

    public static boolean SendEmail(String rec, String sub, String newUserName, String newPassword) {
        String mailmessage;
        mailmessage = "Successfully Enrolled to Distribution \nYour username:" + newUserName + "\n Password:" + newPassword + "\n\n Please log in and reset your password.\n Thank you for joining. \n\n Best regards,\nPHS system ";
        String mailBody = mailmessage;
        String mailRecepient = rec;
        String mailSubject = sub;

        final String username = "pdp110789@gmail.com";
        //Change Password
        final String password = "@Gmail110789!!!";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("PHS"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(mailRecepient));
            message.setSubject(mailSubject);
            message.setText(mailBody);

            Transport.send(message);

            return true;

        } catch (MessagingException e) {
            return false;
        }
    }
}
