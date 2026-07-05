package com.example.crudproject.exception;

// Exceção específica para quando um registro não existe no banco.
// Separamos de ValidacaoException porque o significado é diferente:
// isso deveria virar HTTP 404, e não 400.
public class RecursoNaoEncontradoException extends RuntimeException {

    public RecursoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
