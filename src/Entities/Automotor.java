package Entities;

public abstract class Automotor {
    private int anoDeFabricacao;
    private String modelo;
    private String marca;
    private double valorMercado;
    private String placa;

    public Automotor(int anoDeFabricacao, String modelo, String marca, double valorMercado, String placa) {
        this.anoDeFabricacao = anoDeFabricacao;
        this.modelo = modelo;
        this.marca = marca;
        this.valorMercado = valorMercado;
        this.placa = placa;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public abstract double calcularImposto();

    public String imprimir() {
        return "Automotor{" +
                "anoDeFabricacao=" + anoDeFabricacao +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", valorMercado=" + valorMercado +
                ", placa='" + placa + '\'' +
                '}';
    }

}
