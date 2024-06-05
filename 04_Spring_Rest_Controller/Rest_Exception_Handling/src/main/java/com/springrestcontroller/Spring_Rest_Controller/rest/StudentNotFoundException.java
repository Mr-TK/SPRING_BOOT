package com.springrestcontroller.Spring_Rest_Controller.rest;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message){
        super(message);
    }
}
