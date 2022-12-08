/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;


/**
 *
 * @author doshi
 */
public class AdvancedFeatures {
    private String emailAddressTo = new String();
    private String msgSubject = new String();
    private String msgText = new String();

    final String USER_NAME = "aedinfo5100hms@gmail.com";   //User name of the Goole(gmail) account
    final String PASSSWORD = "eutuyhekqxunikdr";  //Password of the Goole(gmail) account
    final String FROM_ADDRESS = "aedinfo5100hms@gmail.com";  //From addresss
    
    public AdvancedFeatures() {
    }

    //public static void main(String[] args) {
     // AdvancedFeatures email = new AdvancedFeatures();
     //Sending test email
     // email.createAndSendEmail("aedinfo5100hms@gmail.com", "Test email subject",
      //"Congratulations !!! \nThis is test email sent by java class.");
    //}

    public void createAndSendEmail(String emailAddressTo, String msgSubject, String msgText) {
        this.emailAddressTo = emailAddressTo;
        this.msgSubject = msgSubject;
        this.msgText = msgText;
        sendEmailMessage();
    }
 
    private void sendEmailMessage() {
     
     //Create email sending properties
     
     Properties props = new Properties();
     props.put("mail.smtp.auth", "true");
     
     props.put("mail.smtp.ssl.trust", "*");
     props.put("mail.smtp.starttls.enable", "true");
     props.put("mail.smtp.host", "smtp.gmail.com");
     props.put("mail.smtp.port", "587");
  
    Session session = Session.getInstance(props,
    new javax.mail.Authenticator() {
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication("aedinfo5100hms@gmail.com", "eutuyhekqxunikdr");
   }
    });

  try {

     Message message = new MimeMessage(session);
     message.setFrom(new InternetAddress("aedinfo5100hms@gmail.com")); //Set from address of the email
     message.setContent(msgText,"text/html"); //set content type of the email
     
    message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("aedinfo5100hms@gmail.com")); //Set email recipient
    
    message.setSubject("Shiv Sagar"); //Set email message subject
    Transport.send(message); //Send email message

   System.out.println("sent email successfully!");

  } catch (MessagingException e) {
       throw new RuntimeException(e);
  }
    }

    public void setEmailAddressTo(String emailAddressTo) {
        this.emailAddressTo = emailAddressTo;
    }

    public void setSubject(String subject) {
        this.msgSubject = subject;
    }

    public void setMessageText(String msgText) {
        this.msgText = msgText;
    }
    
    
    public void sms(String username,String password,String to,String message) throws MalformedURLException{
        try{

    // This URL is used for sending messages
    String myURI = "https://api.bulksms.com/v1/messages";

    // change these values to match your own account
    String myUsername = ""+username+"";
    String myPassword = ""+password+"";

    // the details of the message we want to send
    String myData = "{to: \""+to+"\", encoding: \"UNICODE\", body: \"Your booking has been confirmed\"}";

    // if your message does not contain unicode, the "encoding" is not required:
    // String myData = "{to: \"1111111\", body: \"Hello Mr. Smith!\"}";

    // build the request based on the supplied settings
    URL url = new URL(myURI);
    HttpURLConnection request = (HttpURLConnection) url.openConnection();
    request.setDoOutput(true);

    // supply the credentials
    String authStr = myUsername + ":" + myPassword;
    String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
    request.setRequestProperty("Authorization", "Basic " + authEncoded);

    // we want to use HTTP POST
    request.setRequestMethod("POST");
    request.setRequestProperty( "Content-Type", "application/json");

    // write the data to the request
    OutputStreamWriter out = new OutputStreamWriter(request.getOutputStream());
    out.write(myData);
    out.close();

    // try ... catch to handle errors nicely
    try {
      // make the call to the API
      InputStream response = request.getInputStream();
      BufferedReader in = new BufferedReader(new InputStreamReader(response));
      String replyText;
      while ((replyText = in.readLine()) != null) {
        System.out.println(replyText);
      }
      in.close();
      System.out.println("sent message successfully!");
    } catch (IOException ex) {
      System.out.println("An error occurred:" + ex.getMessage());
      BufferedReader in = new BufferedReader(new InputStreamReader(request.getErrorStream()));
      // print the detail that comes with the error
      String replyText;
      while ((replyText = in.readLine()) != null) {
        System.out.println(replyText);
      }
      in.close();
    }
    request.disconnect();
  }


        
        catch(Exception e){
            
        }
    }
    
}
