package Entities;

public class Picape extends Automotor{
    private String tipoDeCabine;

    public Picape(int anoDeFabricacao, String modelo, String marca, double valorMercado, String placa, String tipoDeCabine) {
        super(anoDeFabricacao, modelo, marca, valorMercado, placa);
        this.tipoDeCabine = tipoDeCabine;
    }

    @Override
    public double calcularImposto() {
        if(2021 - this.getAnoDeFabricacao() > 20){
            return 0;
        }else if(this.tipoDeCabine.toLowerCase().equals("simples")){
            return this.getValorMercado() * 0.02;
        }else{
            return this.getValorMercado() * 0.04;
        }
    }

    @Override
    public String imprimir() {
        return "Automotor{" +
                "Ano de Fabricação=" + getAnoDeFabricacao() +
                ", Modelo='" + getModelo() + '\'' +
                ", Marca='" + getMarca() + '\'' +
                ", ValorMercado=" + getValorMercado() +
                ", Placa='" + getPlaca() + '\'' +
                ", Tipo de cabine='"+ this.tipoDeCabine + '\'' +
                '}';
    }
}
