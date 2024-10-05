package ar.com.laboratory.ecommerce.infrastructure.util.exceptions;

public class ForbiddenCustomerException extends RuntimeException{
    private final static String ERROR_MESSAGE = "This client is blocked.";
    public ForbiddenCustomerException(){
        super(String.format(ERROR_MESSAGE));
    }
}