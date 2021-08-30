package com.example.payroll;

public class OrderNotFoundException extends RuntimeException{

    OrderNotFoundException(Long id) {
        super("Could not foind order "+id);
    }
}
