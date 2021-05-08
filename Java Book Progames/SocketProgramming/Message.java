public class Message implements java.io.Serializable{
    String subject,text;
    public Message(String s, String t){
        this.subject = s;
        this.text = t;
    }
    String getSubject(){
        return subject;
    }
    String getText(){
        return text;
    }
}
