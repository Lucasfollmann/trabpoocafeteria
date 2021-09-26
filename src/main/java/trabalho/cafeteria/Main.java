package trabalho.cafeteria;


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
        PreparaBebidas preparabebidas = new PreparaBebidas();

        System.out.println("QUAL BEBIDA DESEJA?: ");
        System.out.println("[1] - Cafe");
        System.out.println("[2] - Cafe com Leite");
        System.out.println("[3] - Leite com Chocolate");
        System.out.println("[4] - Mocha");
        System.out.println("[5] - Espresso Panna");
        System.out.println("Insira codigo correspondente: ");
        preparabebidas.selectBebidas(sc.nextInt());

        System.out.println("SELECIONE TAMANHO DO COPO: ");
        System.out.println("[1] - Pequeno");
        System.out.println("[2] - Medio");
        System.out.println("[3] - Grande");
        System.out.println("Digite aqui o codigo correspondente: ");
       preparabebidas.selectSize(sc.nextInt());

        preparabebidas.maisCondimentosADC();

        System.out.println("O valor do pedido foi: " + preparabebidas.getTotalValue());
        System.out.println("A bebida pedida foi: " + preparabebidas.getBebidas());
        System.out.println("O(s) adicional(is) pedidos foram: " + preparabebidas.getCondimentosADC());

        sc.close();
        
    }
    
}
