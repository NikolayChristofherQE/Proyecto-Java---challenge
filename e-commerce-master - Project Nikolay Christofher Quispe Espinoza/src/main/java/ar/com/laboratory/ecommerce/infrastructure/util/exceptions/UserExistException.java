package ar.com.laboratory.ecommerce.infrastructure.util.exceptions;

public class UserExistException extends RuntimeException{
    private final static String ERROR_MESSAGE = "This user exist";
    public UserExistException(String tableName){
        super(String.format(ERROR_MESSAGE,tableName));
    }
}