package listas.lista2;

public class Computador {
    private String marca;
    private String processador;
    private PlacaMae placaMae;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }
    
    public Computador(String marca, String processador, PlacaMae placaMae) {
        this.marca = marca;
        this.processador = processador;
        this.placaMae = placaMae;
    }

    public void exibirConfiguracao() {
        System.out.println("PC Marca: " + marca + " | Proc: " + processador);
        System.out.println("Placa-Mãe: " + placaMae.getModelo() + " | Chipset: " + placaMae.getChipset());
    }

}
