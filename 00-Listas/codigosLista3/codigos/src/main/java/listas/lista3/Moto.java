package listas.lista3;

public class Moto extends Veiculo {
    
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public void exibirMoto() {
        exibir();
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }

}
