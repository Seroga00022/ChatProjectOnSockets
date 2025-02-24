package org.example.serverchatonsocket;

import java.io.Serializable;
import java.util.Date;
//Message class.
public class Message implements Serializable {
    private static final long serialVersionUID = 1l;
    private String text;
    private Date departmentTime;
    private String sender;

    public Message(String text, Date departament, String sender) {
        super();
        this.text = text;
        this.departmentTime = departmentTime;
        this.sender = sender;

    }

    public Message() {
        super();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDepartmentTime() {
        return departmentTime;
    }

    public void setDepartmentTime(Date departmentTime) {
        this.departmentTime = departmentTime;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Message [text = " + text + ", departmentTime = " + departmentTime + ", sender = " + sender + "]";
    }
}
