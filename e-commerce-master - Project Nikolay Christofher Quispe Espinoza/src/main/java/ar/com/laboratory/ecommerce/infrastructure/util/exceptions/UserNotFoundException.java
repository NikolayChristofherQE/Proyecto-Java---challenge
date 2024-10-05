package ar.com.laboratory.ecommerce.infrastructure.util.exceptions;

public class UserNotFoundException extends RuntimeException{
    private final static String ERROR_MESSAGE = "This user not exist";
    public UserNotFoundException(String tableName){
        super(String.format(ERROR_MESSAGE,tableName));
    }
}