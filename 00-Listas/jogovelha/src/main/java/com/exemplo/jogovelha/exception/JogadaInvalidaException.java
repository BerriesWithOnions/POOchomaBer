package com.exemplo.jogovelha.exception;

import org.springframework.http.HttpStatus;

public class JogadaInvalidaException extends RuntimeException {

    private final HttpStatus status;

    public JogadaInvalidaException(String mensagem, HttpStatus status) {
        super(mensagem);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
