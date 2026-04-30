package ke.gekika.backend.serviceImpl;

import ke.gekika.backend.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    private static  final Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender mailSender;

    @Value("${app.frontend.url:http://localhost:4200}")
    private String frontendUrl;

    @Value("${spring.mail.username}")
    private String fromEmail;


    @Override
    public void sendCredentialsEmail(String toEmail, String username, String password) {
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(fromEmail);
            message.setTo(toEmail);
            message.setSubject("Your Temporary password");
            String emailBody =
                    "Hi " + username + ", \n\n"
                      + "Temporary password: " +  password + "\n\n"
                    + "You can Login in at : " +frontendUrl + "/login\n\n";
            message.setText(emailBody);
            mailSender.send(message);

            logger.info("Temporary password email sent to " + toEmail);

        }catch(Exception ex){
            logger.error("Failed to send temporary password email to {}: {}", toEmail, ex.getMessage(),ex);
            throw new RuntimeException("Failed to send temporary password email to " + toEmail);
        }

    }

    @Override
    public void sendWelcomeEmail(String toEmail, String username, String password) {
        try{
            SimpleMailMessage message = new SimpleMailMessage();

            message.setFrom(fromEmail);
            message.setTo(toEmail);
            message.setSubject(" Welcome Email");

            String emailBody =
                    "Hi " + username + ", \n\n"
                    + "Welcome your Account has been successfully creaeted "+
                            "Email: " + toEmail+"\n\n" +
                    "Temporary password" + password + "\n\n"
                    + "You can Login in at : " +frontendUrl + "/login\n\n";

            message.setText(emailBody);
            mailSender.send(message);
            logger.info("Welcome email sent to " + toEmail);

        }catch(Exception ex){
            logger.error("Failed to send email to {}: {}", toEmail, ex.getMessage(),ex);
            throw new RuntimeException("Failed to send email to " + toEmail);
        }

    }
}
