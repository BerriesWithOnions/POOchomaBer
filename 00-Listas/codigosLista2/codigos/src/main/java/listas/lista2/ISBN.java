package listas.lista2;

public class ISBN {
    private String codigo;
    private String editora;
    
    public String getCodigo() {
        return codigo;
    }
    public String getEditora() {
        return editora;
    }
    
    public ISBN(String codigo, String editora) {
        this.codigo = codigo;
        this.editora = editora;
    }

}
