abstract class  NotificationService{
    String recipient;
    NotificationService(String recipient){
        this.recipient = recipient;
    }
    void logAudit(String recipient){
        if(this.recipient != null && this.recipient.equals(recipient)){
            System.out.println("recipient audit log is start ");
        }
    }
    abstract String formatMessage(String rawMessage);
    abstract void send(String formattedMessage);
    public final void dispatch(String rawMessage){
        logAudit(recipient);
        String readyMsg = formatMessage(rawMessage);
        send(readyMsg);
        System.out.println("-------------------------------------------------------------");

    }

}

class EmailNotificationService extends NotificationService{
    EmailNotificationService(String email){
      super(email);
    }
    String formatMessage(String rawMessage){
       return rawMessage;
    }
    void send(String formattedMessage){
        System.out.println("sending email to " + recipient + "->" + formattedMessage);
    }

}

class SmsNotificationService extends NotificationService{
    SmsNotificationService(String phone){
        super(phone);
    }
    String formatMessage(String rawMessage){
        return rawMessage;
    }
    void send(String formattedMessage){
        System.out.println("sending sms to phone " + recipient + "->" + formattedMessage);
    }

}

class NotificationDispatcherDemo{
    public static void main(String args[]){
       NotificationService service;
       service = new EmailNotificationService("nikitakochalkar2005gamil.com");
       service.dispatch("your otp is 4654");
       System.out.println("----------------------------------------------------------");
       service = new SmsNotificationService("976469833");
       service.dispatch("your otp is ");

    }
}