package listas.lista2;

public class Prontuario {
    private int numeroRegistro;
    private String tipoSanguineo;
    private String alergias;

    public int getNumeroRegistro() {
        return numeroRegistro;
    }
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }
    public String getAlergias() {
        return alergias;
    }
    
    public Prontuario(int numeroRegistro, String tipoSanguineo, String alergias) {
        this.numeroRegistro = numeroRegistro;
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
    }

}
