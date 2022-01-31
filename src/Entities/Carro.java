package Entities;

public class Carro extends Automotor {
    private String combustivel;

    public Carro(int anoDeFabricacao, String modelo, String marca, double valorMercado, String placa, String combustivel) {
        super(anoDeFabricacao, modelo, marca, valorMercado, placa);
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    @Override
    public double calcularImposto() {
        if (2021 - this.getAnoDeFabricacao() > 20)
            return 0;

        if (this.combustivel.equals("gasolina") || this.combustivel.equals("disel") || this.combustivel.equals("flex")) {
            return 0.04 * getValorMercado();
        }

        return 0.03 * getValorMercado();
    }

    public String imprimir() {
        return "Carro{" +
                "anoDeFabricacao=" + getAnoDeFabricacao()+
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", valorMercado=" + getValorMercado() +
                ", placa='" + getPlaca() + '\'' +
                ", combustivel='" + combustivel + '\'' +
                '}';
    }
}
