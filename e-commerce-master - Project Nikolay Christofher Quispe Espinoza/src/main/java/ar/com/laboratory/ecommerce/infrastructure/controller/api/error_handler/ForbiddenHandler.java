package ar.com.laboratory.ecommerce.infrastructure.controller.api.error_handler;

import ar.com.laboratory.ecommerce.infrastructure.controller.api.response.BaseErrorResponse;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.response.ErrorResponse;
import ar.com.laboratory.ecommerce.infrastructure.util.exceptions.ForbiddenCustomerException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseStatus(HttpStatus.FORBIDDEN)
public class ForbiddenHandler {
    @ExceptionHandler(ForbiddenCustomerException.class)
    public BaseErrorResponse customerBlocked(ForbiddenCustomerException exception){
        return  ErrorResponse.builder()
                .message(exception.getMessage())
                .code(HttpStatus.FORBIDDEN.value())
                .status(HttpStatus.FORBIDDEN.name())
                .build();
    }
}
