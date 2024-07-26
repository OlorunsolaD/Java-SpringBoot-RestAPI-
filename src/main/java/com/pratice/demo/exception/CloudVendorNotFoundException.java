package com.pratice.demo.exception;

public class CloudVendorNotFoundException extends RuntimeException {

    public CloudVendorNotFoundException(String message) {
        super(message);
    }

    // Constructor that accepts a message and a cause
    public CloudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }



}
