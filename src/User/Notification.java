package User;

public class Notification {
    private User receiver;
    private User sender;
    private String content;

    public Notification(User receiver, User sender){
        this.receiver=receiver;
        this.sender=sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
