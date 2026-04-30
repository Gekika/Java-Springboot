package ke.gekika.backend.service;

public interface EmailService {

    void sendCredentialsEmail(String toEmail, String username, String password);

    void sendWelcomeEmail(String toEmail, String username, String password);

}
