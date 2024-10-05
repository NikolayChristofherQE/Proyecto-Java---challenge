package ar.com.laboratory.ecommerce.infrastructure.util.exceptions;

public class ProductNotFoundException extends RuntimeException{
    private final static String ERROR_MESSAGE = "This product not exist";
    public ProductNotFoundException(String tableName){
        super(String.format(ERROR_MESSAGE,tableName));
    }
}