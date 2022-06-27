package ro.fasttrackit.homework7.restaurantapp.exceptions;

public class ValidationException extends RuntimeException {
    public ValidationException(String msg) {
        super(msg);
    }
}
