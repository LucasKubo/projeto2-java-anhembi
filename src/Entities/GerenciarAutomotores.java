package Entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciarAutomotores {
    private List<Automotor> automotores;

    public GerenciarAutomotores() {
        this.automotores = new ArrayList<>();
    }

    public void adicionar(Automotor a) {
        automotores.add(a);
    }

    public boolean remover(String placa) {
        for (Automotor automotor : automotores) {
            if (automotor.getPlaca().equals(placa)) {
                automotores.remove(automotor);
                return true;
            }
        }
        return false;
    }

    public Automotor buscarPorPlaca(String placa) {
        for (Automotor automotor : automotores) {
            if (automotor.getPlaca().equals(placa)) {
                return automotor;
            }
        }
        return null;
    }

    public String listarCarros() {
        StringBuilder carros = new StringBuilder();
        for (Automotor automotor : automotores) {
            if (automotor instanceof Carro) {
                carros.append(automotor.imprimir()).append("\n");
            }
        }
        return carros.toString();
    }

    public String listarMotocicletas() {
        StringBuilder motocicletas = new StringBuilder();
        for (Automotor automotor : automotores) {
            if (automotor instanceof Moto) {
                motocicletas.append(automotor.imprimir()).append("\n");
            }
        }
        return motocicletas.toString();
    }

    public String listarPicapes() {
        StringBuilder picapes = new StringBuilder();
        for (Automotor automotor : automotores) {
            if (automotor instanceof Picape) {
                picapes.append(automotor.imprimir()).append("\n");
            }
        }
        return picapes.toString();
    }

    public double obterValorImposto(String placa) {
        Automotor automotor = buscarPorPlaca(placa);
        if (automotor != null) {
            return automotor.calcularImposto();
        }
        return -1;
    }

    public String listarCarroPorCombustivel(String combustivel) {
        StringBuilder carrosSelecionados = new StringBuilder();
        List<Carro> carros = new ArrayList<>();
        for (Automotor automotor : automotores) {
            if (automotor instanceof Carro) {
                carros.add((Carro) automotor);
            }
        }
        for (Carro carro : carros) {
            if (carro.getCombustivel().toLowerCase().equals(combustivel.toLowerCase())) {
                carrosSelecionados.append(carro.imprimir()).append("\n");
            }
        }
        return carrosSelecionados.toString();
    }
}