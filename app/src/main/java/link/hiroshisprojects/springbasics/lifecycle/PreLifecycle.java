package link.hiroshisprojects.springbasics.lifecycle;

public class PreLifecycle {
    private String message;
    private String setterMessage;
    public PreLifecycle(String message) {
        this.message = message;
    }

    public void setSetterMessage(String setterMessage) {
        this.setterMessage = setterMessage;
    }

    public void init() {
        System.out.println("Init called after properties set. Message: " + message);
        System.out.println("setterMessage: " + setterMessage);

    }
}
