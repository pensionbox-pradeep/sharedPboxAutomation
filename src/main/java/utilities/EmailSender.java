package utilities;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.*;
import java.io.*;
import jakarta.activation.*;


public class EmailSender {

	public static void main(String[] args) throws IOException {
		
		File projectDir = new File(".").getCanonicalFile();
		File allureSinglesDir = new File(projectDir, "allure-singles");
		
		 // Gmail SMTP server settings
        String host = "smtp.gmail.com";
        String fromEmail = "npradeeppai2@gmail.com"; // Your Gmail address
        String toEmail = "npradeeppai@gmail.com"; // Recipient's email address
        String subject = "Subject: Current Date and Time File";
        String bodyText = "Please find the attached file with the current date and time.";

        // Path to the file you want to send
        String filePath = allureSinglesDir.getAbsolutePath()+"/report.html"; // Change this to your generated file's path
        System.out.println(filePath);

        // Set up email session properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587"); // Use port 587 for TLS
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // Enable TLS

        // Create a session with Gmail credentials
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("npradeeppai2@gmail.com", "dase thfs tytk amgb"); // Use your Gmail credentials
            }
        });

        try {
            // Create a new email message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);

            // Create a multipart message to hold both the body and the attachment
            Multipart multipart = new MimeMultipart();

            // Set the body text
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText(bodyText);
            multipart.addBodyPart(textPart);

            // Attach the file
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(filePath);
            multipart.addBodyPart(attachmentPart);

            // Set the content of the email message
            message.setContent(multipart);

            // Send the email
            Transport.send(message);
            System.out.println("Email sent successfully with the attachment.");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
	}

}
