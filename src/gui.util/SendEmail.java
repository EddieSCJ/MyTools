package model.tools;
import java.io.File;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static String selectingTheHostName(String choosedEmail) {

		String outlookHostName = "smtp-mail.outlook.com";
		String gmailHostName = "smtp.gmail.com";
		String hotmailHostName = "smtp.live.com";
		String yahooHostName = "smtp.mail.yahoo.com";
		String igHostName = "imap.ig.com.br";

		String brokedEmail[] = choosedEmail.split("@");
		String brokedAdress[] = brokedEmail[1].split(".com");

		if (brokedAdress[0].equalsIgnoreCase("Hotmail")) {
			return outlookHostName;
		} else if (brokedAdress[0].equalsIgnoreCase("Gmail")) {
			return gmailHostName;
		} else if (brokedAdress[0].equalsIgnoreCase("Outlook")) {
			return outlookHostName;
		} else if (brokedAdress[0].equalsIgnoreCase("Yahoo")) {
			return yahooHostName;
		} else if (brokedAdress[0].equalsIgnoreCase("Ig")) {
			return igHostName;
		}

		return null;
	}

	public static void sendingOnlyMessage(String Destiny, String Title, String Message) throws Exception {

		String rootEmail = "EddieProfessionalMail@gmail.com";
		SimpleEmail email = new SimpleEmail();

		email.setDebug(false);
		if (selectingTheHostName(rootEmail) != null) {
			email.setHostName(selectingTheHostName(rootEmail));

			if (selectingTheHostName(rootEmail).equalsIgnoreCase("smtp.gmail.com"))
				email.setSmtpPort(587);

		} else {
			throw new Exception("Invalid Mail");
		}

		email.setAuthentication(rootEmail, "44657235@@JRED");
		email.setSSL(true);

		email.addTo(Destiny); // pode ser qualquer email
		email.setFrom(rootEmail);// será passado o email que você fará a autenticação
		email.setSubject(Title);
		email.setMsg(Message);
		email.send();

	}

	public static void sendingMessageWithAttachment(String attachmentWay,
													String Destiny,
													String Title,
													String Message) throws Exception {
		// Create the attachment  
        
        // Caminho do arquivo a ser enviado  
		File f = new File(attachmentWay);   
			          
			EmailAttachment attachment = new EmailAttachment();  
			attachment.setPath(f.getPath()); // Obtem o caminho do arquivo  
			attachment.setDisposition(EmailAttachment.ATTACHMENT);  
			attachment.setDescription("Attachemnt");  
			attachment.setName(f.getName()); // Obtem o nome do arquivo  
			
			String rootEmail = "EddieProfessionalMail@gmail.com";

			// Create the email message  
			  MultiPartEmail email = new MultiPartEmail();  
			  email.setDebug(true);  
			  if(selectingTheHostName(rootEmail)!=null) {
			  email.setHostName(selectingTheHostName(rootEmail));  
			  
			  if(selectingTheHostName(rootEmail) != null) {
			      email.setHostName(selectingTheHostName(rootEmail));  
			      
			      if(selectingTheHostName(rootEmail).equalsIgnoreCase("smtp.gmail.com"))
			      email.setSmtpPort(587);
			      
			      }else {
			    	  throw new Exception("Invalid Mail");
			      }
			  
			  email.setAuthentication(rootEmail,"44657235@@JRED");  
			  email.setSSL(true);  
			  email.addTo(Destiny); //pode ser qualquer email  
			  email.setFrom(rootEmail); //será passado o email que você fará a autenticação
			  email.setSubject(Title);  
			  email.setMsg(Message);  
			
			  // add the attachment  
			  email.attach(attachment);  
			
			  // send the email  
			  email.send();  
			}

}
}
