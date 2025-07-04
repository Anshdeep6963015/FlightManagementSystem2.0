package email;

import java.util.Properties;

public class EmailConfig {
    public static final String SENDER_EMAIL = "**************@gmail.com"; // Enter your email
    public static final String SENDER_PASSWORD = "****************"; // Enter your 16 character App password from google

    public static Properties getEmailProperties() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        return props;
    }
}
