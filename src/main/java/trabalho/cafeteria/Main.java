/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.cafeteria;

package Projeto.Cafeteria.aplicacao;

import Bebidas.Bebidas;
import Bebidas.Cafe;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bebidas bebidas = new Bebidas();
        Cafe cafe = new Cafe();
        Bebidas preparativodabebida = new Bebidas();

        System.out.println("QUAL BEBIDA DESEJA?: ");
        System.out.println("[1] - Cafe");
        System.out.println("[2] - Cafe com Leite");
        System.out.println("[3] - Leite com Chocolate");
        System.out.println("[4] - Mocha");
        System.out.println("[5] - Espresso Panna");
        System.out.println("Insira codigo correspondente: ");
        preparativodabebida.selectBebidas(sc.nextInt());

        System.out.println("SELECIONE TAMANHO DO COPO: ");
        System.out.println("[1] - Pequeno");
        System.out.println("[2] - Medio");
        System.out.println("[3] - Grande");
        System.out.println("Digite aqui o codigo correspondente: ");
        Bebidas.selectSize(sc.nextInt());

        preparativodabebida.maisAdicionais();

        System.out.println("O valor do pedido foi: " + preparativodabebida.getTotalValue());
        System.out.println("A bebida pedida foi: " + preparativodabebida.getBebidas());
        System.out.println("O(s) adicional(is) pedidos foram: " + preparativodabebida.getAdicionais());

        sc.close();
        
    }
    
}
