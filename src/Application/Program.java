package Application;


import Entities.Carro;
import Entities.GerenciarAutomotores;
import Entities.Moto;
import Entities.Picape;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GerenciarAutomotores gca = new GerenciarAutomotores();

        int opcao;
        do {
            System.out.println("1 - Adicionar automotor");
            System.out.println("2 - Remover automotor");
            System.out.println("3 - Buscar pela placa");
            System.out.println("4 - Listar carros");
            System.out.println("5 - Listar motocicletas");
            System.out.println("6 - Listar picape");
            System.out.println("7 - Obter valor de imposto");
            System.out.println("8 - Listar carro por combustível");
            System.out.println("9 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("==========================");
                    System.out.println("1- Carro");
                    System.out.println("2- Motocicleta");
                    System.out.println("3- Picape ");
                    System.out.print("Escolha o tipo de produto: ");
                    int tipoAutomotor = scan.nextInt();

                    switch (tipoAutomotor) {
                        case 1:
                            System.out.println("==========================");
                            System.out.print("Ano de fabricação:");
                            int anoDeFabricacao = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Modelo: ");
                            String modelo = scan.nextLine();

                            System.out.print("Marca: ");
                            String marca = scan.next();

                            System.out.print("Valor de mercado: ");
                            double valorMercado = scan.nextDouble();

                            System.out.print("Placa: ");
                            String placa = scan.next();
                            scan.nextLine();

                            System.out.print("Combustível: ");
                            String combustivel = scan.nextLine();
                            System.out.println("==========================");

                            gca.adicionar(new Carro(anoDeFabricacao, modelo, marca, valorMercado, placa, combustivel));
                            break;
                        case 2:
                            System.out.println("==========================");
                            System.out.print("Ano de fabricação:");
                            anoDeFabricacao = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Modelo: ");
                            modelo = scan.nextLine();

                            System.out.print("Marca: ");
                            marca = scan.next();

                            System.out.print("Valor de mercado: ");
                            valorMercado = scan.nextDouble();

                            System.out.print("Placa: ");
                            placa = scan.next();
                            scan.nextLine();
                            System.out.println("==========================");

                            gca.adicionar(new Moto(anoDeFabricacao, modelo, marca, valorMercado, placa));
                            break;
                        case 3:
                            System.out.println("==========================");
                            System.out.print("Ano de fabricação:");
                            anoDeFabricacao = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Modelo: ");
                            modelo = scan.nextLine();

                            System.out.print("Marca: ");
                            marca = scan.next();

                            System.out.print("Valor de mercado: ");
                            valorMercado = scan.nextDouble();

                            System.out.print("Placa: ");
                            placa = scan.next();
                            scan.nextLine();

                            System.out.print("Tipo de cabine (simples ou duplas): ");
                            String tipoCabine = scan.nextLine();
                            System.out.println("==========================");

                            gca.adicionar(new Picape(anoDeFabricacao, modelo, marca, valorMercado, placa, tipoCabine));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("==========================");
                    System.out.print("Digite a placa do automotor: ");
                    String placa = scan.next();
                    if (gca.remover(placa)) {
                        System.out.println("Automotor removido");
                        System.out.println("==========================");
                        break;
                    }
                    ;
                    System.out.println("Automotor não encontrado");
                    System.out.println("==========================");
                    break;
                case 3:
                    System.out.println("==========================");
                    System.out.print("Digite a placa do automotor que deseja buscar: ");
                    placa = scan.next();
                    if (gca.buscarPorPlaca(placa) == null) {
                        System.out.println("Automotor não encontrado");
                        System.out.println("==========================");
                        break;
                    }
                    System.out.println(gca.buscarPorPlaca(placa).imprimir());
                    System.out.println("==========================");
                    break;
                case 4:
                    System.out.println("==========================");
                    System.out.println(gca.listarCarros());
                    System.out.println("==========================");
                    break;
                case 5:
                    System.out.println("==========================");
                    System.out.println(gca.listarMotocicletas());
                    System.out.println("==========================");
                    break;
                case 6:
                    System.out.println("==========================");
                    System.out.println(gca.listarPicapes());
                    System.out.println("==========================");
                    break;
                case 7:
                    System.out.println("==========================");
                    System.out.print("Digite a placa do automotor que deseja saber o valor do imposto: ");
                    placa = scan.next();
                    System.out.println(gca.obterValorImposto(placa));
                    System.out.println("==========================");
                    break;
                case 8:
                    System.out.println("==========================");
                    System.out.print("Combustível: ");
                    String combustivel = scan.next();
                    System.out.println(gca.listarCarroPorCombustivel(combustivel));
                    System.out.println("==========================");
                    break;
                case 9:
                    System.out.println("==========================");
                    System.out.println("Até mais!");
                    System.out.println("==========================");
                    break;
                default:
                    System.out.println("==========================");
                    System.out.println("Opção inválida !");
                    System.out.println("==========================");
            }
        } while (opcao != 9);
    }
}