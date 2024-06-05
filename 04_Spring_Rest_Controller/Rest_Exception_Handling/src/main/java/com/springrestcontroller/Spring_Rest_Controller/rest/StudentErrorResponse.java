package com.springrestcontroller.Spring_Rest_Controller.rest;

public class StudentErrorResponse {
    private int status;
    private String message;
    private long timmeStamp;

    public StudentErrorResponse() {
        this.status = status;
        this.message = message;
        this.timmeStamp = timmeStamp;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimmeStamp() {
        return timmeStamp;
    }

    public void setTimmeStamp(long timmeStamp) {
        this.timmeStamp = timmeStamp;
    }
}
