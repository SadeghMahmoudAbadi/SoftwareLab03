package edu.sharif.selab.services;

import edu.sharif.selab.models.Message;

import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        if(validateTelegramID(message.getSource()) && validateTelegramID(message.getTarget())){
            System.out.println("Sending a Telegram Message from " + message.getSource() + " to " + message.getTarget() + " with content : " + message.getContent());
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
