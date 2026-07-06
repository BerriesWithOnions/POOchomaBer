package com.exemplo.jogovelha.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(PartidaNaoEncontradaException.class)
    public ResponseEntity<Map<String, Object>> tratarNaoEncontrada(PartidaNaoEncontradaException ex) {
        return corpoErro(HttpStatus.NOT_FOUND, ex.getMessage());
    }

    @ExceptionHandler(PartidaEncerradaException.class)
    public ResponseEntity<Map<String, Object>> tratarEncerrada(PartidaEncerradaException ex) {
        return corpoErro(HttpStatus.CONFLICT, ex.getMessage());
    }

    @ExceptionHandler(JogadaInvalidaException.class)
    public ResponseEntity<Map<String, Object>> tratarJogadaInvalida(JogadaInvalidaException ex) {
        return corpoErro(ex.getStatus(), ex.getMessage());
    }

    @ExceptionHandler(DadosInvalidosException.class)
    public ResponseEntity<Map<String, Object>> tratarDadosInvalidos(DadosInvalidosException ex) {
        return corpoErro(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    private ResponseEntity<Map<String, Object>> corpoErro(HttpStatus status, String mensagem) {
        Map<String, Object> corpo = new LinkedHashMap<>();
        corpo.put("status", status.value());
        corpo.put("erro", nomeEmPortugues(status));
        corpo.put("mensagem", mensagem);
        return ResponseEntity.status(status).body(corpo);
    }

    private String nomeEmPortugues(HttpStatus status) {
        switch (status) {
            case BAD_REQUEST:
                return "Requisição Inválida";
            case NOT_FOUND:
                return "Não Encontrado";
            case CONFLICT:
                return "Conflito";
            default:
                return status.getReasonPhrase();
        }
    }
}
