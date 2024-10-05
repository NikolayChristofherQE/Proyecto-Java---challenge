package ar.com.laboratory.ecommerce.infrastructure.controller.api.error_handler;


import ar.com.laboratory.ecommerce.infrastructure.controller.api.response.BaseErrorResponse;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.response.ErrorsResponse;
import ar.com.laboratory.ecommerce.infrastructure.util.exceptions.IdNotFoundException;
import ar.com.laboratory.ecommerce.infrastructure.util.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.response.ErrorResponse;
import java.util.ArrayList;

@RestControllerAdvice
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestHandler {

    @ExceptionHandler({IdNotFoundException.class, UserNotFoundException.class})
    public BaseErrorResponse idNotFound(RuntimeException exception){
        return  ErrorResponse.builder()
                .message(exception.getMessage())
                .code(HttpStatus.BAD_REQUEST.value())
                .status(HttpStatus.BAD_REQUEST.name())
                .build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseErrorResponse handleIdNotFound(MethodArgumentNotValidException exception) {
        var errors = new ArrayList<String>();
        exception.getAllErrors()
                .forEach(error -> errors.add(error.getDefaultMessage()));

        return ErrorsResponse.builder()
                .errors(errors)
                .status(HttpStatus.BAD_REQUEST.name())
                .code(HttpStatus.BAD_REQUEST.value())
                .build();
    }
}