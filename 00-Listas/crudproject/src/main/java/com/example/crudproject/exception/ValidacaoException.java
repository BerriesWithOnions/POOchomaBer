package com.example.crudproject.exception;

// Exercício 14: exceção específica para quando uma REGRA DE NEGÓCIO é violada.
// Ex: preço <= 0, nome vazio, email vazio.
// RuntimeException porque não queremos obrigar todo método a declarar "throws".
public class ValidacaoException extends RuntimeException {

    public ValidacaoException(String mensagem) {
        super(mensagem);
    }
}
