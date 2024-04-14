package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService{
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        //Empty Body
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        //Empty Body!
    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        if(validateTelegramID(telegramMessage.getSourceID()) && validateTelegramID(telegramMessage.getTargetID())){
            System.out.println("Sending a Telegram Message from " + telegramMessage.getSourceID() + " to " + telegramMessage.getTargetID() + " with content : " + telegramMessage.getContent());
        }else{
            throw new IllegalArgumentException("Telegram ID is Not Correct!");
        }
    }

    private boolean validateTelegramID(String telegramID) {
        // Regular expression pattern for validating telegram IDs
        String telegramRegex = "^@[a-zA-z]+[a-zA-Z0-9-]+[a-zA-Z0-9-]+$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(telegramRegex);

        // Check if the telegram string matches the regex pattern
        return pattern.matcher(telegramID).matches();
    }

}
