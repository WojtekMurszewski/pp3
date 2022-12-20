public class Email extends Message {

    String subject;
    String rAddress;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getrAddress() {
        return rAddress;
    }

    public void setrAddress(String rAddress) {
        this.rAddress = rAddress;
    }

    public Email(String subject, String rAddress, String text){
        this.subject=subject;
        this.rAddress=rAddress;
        super(text);
    }

}
