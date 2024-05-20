package carro;

public class Carro extends Veiculo{
    public void ligar() {
        conferirCambio();
        conferirCombustivel();
        System.out.println("Carro ligado");
    }

    public void conferirCombustivel() {
        System.out.println("Conferindo combustível");
    }

    public void conferirCambio() {
        System.out.println("Conferindo câmbio em P");
    }
}