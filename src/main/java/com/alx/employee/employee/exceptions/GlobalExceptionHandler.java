package com.alx.employee.employee.exceptions;

import com.alx.employee.employee.entity.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<?> customExceptionHandler(final CustomException customException) {
        return new ResponseEntity<>(
                new CustomResponse<>(
                        "02",
                        "fail",
                        customException.getMassage()),
                HttpStatus.ALREADY_REPORTED);
    }

//    public ResponseEntity<?> customExceptionHandler(final CustomException customException) {
//        return new ResponseEntity<>(
//                new CustomResponse<>(
//                        "02",
//                        "fail",
//                        customException.getMassage()),
//                HttpStatus.ALREADY_REPORTED);
//    }
}
