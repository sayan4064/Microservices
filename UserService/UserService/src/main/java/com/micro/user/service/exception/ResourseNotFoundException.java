package com.micro.user.service.exception;

public class ResourseNotFoundException extends RuntimeException {

    public ResourseNotFoundException(){
        super("Resourse not found on server !!");
    }
    
    public ResourseNotFoundException(String message) {
        super(message);
    }
}
