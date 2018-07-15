package br.edu.ifg.poo.exception;

public class SistemaException extends Exception {

    public SistemaException(String message) {
        super(message);
    }

    public SistemaException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
