package br.com.possenti.emailSender;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	public void send(String userEmail, String subject, String message) {
		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("#########@gmail.com", "*******")); //Insert your email and password here!
			email.setSSLOnConnect(true);
			email.setFrom("#########@gmail.com"); //Insert your email again here! 
			email.setSubject(subject);
			email.setMsg(message);
			email.addTo(userEmail);
			email.send();
			

		} catch (EmailException e) {
			e.printStackTrace();
		}
	}

}
