package com.pratice.demo.response;

import java.util.HashMap;
import java.util.Map; // Import the Map interface

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

    public static ResponseEntity<Object> responseBuilder (
        String message, HttpStatus httpStatus, Object responseObject
    ) 
    
    {
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("message", message);
        responseBody.put("HttpStatus", httpStatus);
        responseBody.put("data", responseObject);

        return new ResponseEntity<>(responseBody, httpStatus);
    }
}
