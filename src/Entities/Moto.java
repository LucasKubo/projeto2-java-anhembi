package Entities;

public class Moto extends Automotor{
    public Moto(int anoDeFabricacao, String modelo, String marca, double valorMercado, String placa) {
        super(anoDeFabricacao, modelo, marca, valorMercado, placa);
    }

    @Override
    public double calcularImposto() {
        if(2021 - this.getAnoDeFabricacao() > 20){
            return 0;
        }else{
            return this.getValorMercado() * 0.02;
        }
    }
}
