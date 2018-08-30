package util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailToPeople {
	
	public static boolean sendMail(){
		try{
			
		/*	EmailAttachment attachment = new EmailAttachment();
			  attachment.setPath(System.getProperty("user.dir")+"\\src\\xls\\SanitySuite2018.xlsx");
			  attachment.setDisposition(EmailAttachment.ATTACHMENT);
			  attachment.setDescription("SanitySuite2018");
			  attachment.setName("Dilli");

			  // Create the email message
			  MultiPartEmail email = new MultiPartEmail();
			  email.setHostName("smtp.mail.accenture.com");
			  email.setSmtpPort(465);
			  email.setAuthenticator(new DefaultAuthenticator("dilli.r.kumaran.e.l@accenture.com", "Kohli!23"));
			  email.addTo("dilli.r.kumaran.e.l@accenture.com");
			  email.setFrom("dilli.r.kumaran.e.l@accenture.com");
			  email.setSubject("My Results");
			  email.setMsg("Here u asked");

			  // add the attachment
			  email.attach(attachment);

			  // send the email
			  email.send();*/
			Email email = new SimpleEmail();
			email.setHostName("smtp-mail.outlook.com");
			/*String HostName=email.getHostName();
			String PortNumber = email.getSmtpPort();
			System.out.println(HostName);
			System.out.println(PortNumber);*/
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("dilli.r.kumaran.e.l@accenture.com", "Kohli!23"));
			email.setSSLOnConnect(true);
			email.setFrom("dilli.r.kumaran.e.l@accenture.com");
			email.setSubject("TestMail");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("dilli.r.kumaran.e.l@accenture.com");
			email.send();
			
			
			
		}
		catch(Exception e){
			
			System.out.println("Exception in sendMail"+e);
			
		}
		return true;
	}

}
