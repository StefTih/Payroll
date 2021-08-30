package com.example.payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ResponseBody // Signals that this advice is rendered straight into the response body
    @ExceptionHandler(EmployeeNotFoundException.class) // Configures the advice to only respond is an
                                                       // if an exception is thrown.
    @ResponseStatus(HttpStatus.NOT_FOUND) // Issues a HTTP 404
    String employeeNotFoundHandler(EmployeeNotFoundException exception) {
        return exception.getMessage();
    }
}
