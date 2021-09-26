
package trabalho.cafeteria;

import Aicionais.Cookie;
import Aicionais.LeiteNinho;
import Aicionais.GeloCremeDeLeite;
import Aicionais.Canela;
import Aicionais.Chocolate;
import Aicionais.RaspasLimao;
import Aicionais.LeiteCondensado;
import Bebidas.Cafe;
import Bebidas.CafecomLeite;
import Bebidas.EapressoPanna;
import Bebidas.LeitecomChocolate;
import Bebidas.Mocha;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Lucas
 */

public class PreparaBebidas {
    
    private int op;
    private double totalValue;
    private double valueBebidas;
    private int validator = 1;
    private ArrayList<String> CondimentosADC = new ArrayList();
    private ArrayList<String> Bebidas = new ArrayList();

    public void selectBebidas(int op) {
        switch (op) {
            case 0:
                break;
            case 1:
                Cafe cafe = new Cafe();
                cafe.prepareCafe();
                valueBebidas = cafe.getValue();
                Bebidas.add("Cafe");
                break;
            case 2:
                CafecomLeite cafecomleite = new CafecomLeite();
                cafecomleite.prepareCafecomLeite();
                valueBebidas = cafecomleite.getValue();
                Bebidas.add("Café com Leite");
                break;
            case 3:
                LeitecomChocolate leitecomchocolate = new LeitecomChocolate();
                leitecomchocolate.prepareLeiteChocolate();
                valueBebidas = leitecomchocolate.getValue();
                Bebidas.add("Leite com Chocolate");
                break;
            case 4:
                Mocha mocha = new Mocha();
                mocha.prepareMocha();
                valueBebidas = mocha.getValue();
                Bebidas.add("Mocha");
                break;
            case 5:
                EapressoPanna espressoPanna = new EapressoPanna();
                espressoPanna.prepareEspressoPanna();
                valueBebidas = espressoPanna.getValue();
                Bebidas.add("Espresso Panna");
                break;
        }
    }

    public void selectSize(int op) {
        switch (op) {
            case 1:
                totalValue = valueBebidas;
                break;
            case 2:
                totalValue = (valueBebidas * 0.2) + valueBebidas;
                break;
            case 3:
                totalValue = (valueBebidas * 0.35) + valueBebidas;
                break;
        }
    }

    public void selectCondimentosADC() {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELECIONE UM ADICIONAL");
        System.out.println("[0] - Apertei errado, nao quero adicional");
        System.out.println("[1] - Raspas de Limao");
        System.out.println("[2] - Canela em Po");
        System.out.println("[3] - Leite Ninho - Colher");
        System.out.println("[4] - Gelo de Creme de Leite - Cubo)");
        System.out.println("[5] - Leite Condensado - Colher");
        System.out.println("[6] - Chocolate em Po - Colher");
        System.out.println("[7] - Cookie - Unidade");
        System.out.println("Seleciona uma opção do adicional: ");
        op = sc.nextInt();
        switch (op) {
            case 1:
                RaspasLimao raspasdelimao = new RaspasLimao();
                raspasdelimao.prepareRaspasLimao();
                totalValue += raspasdelimao.getValue();
                CondimentosADC.add("Raspas de Limao");
                break;
            case 2:
                Canela canela = new Canela();
                canela.prepareCanela();
                totalValue += canela.getValue();
                CondimentosADC.add("Canela em Po");
                break;
            case 3:
                LeiteNinho leiteninho = new LeiteNinho();
                leiteninho.prepareLeiteNinho();
                totalValue += leiteninho.getValue();
                CondimentosADC.add("Leite Ninho - Colher");
                break;
            case 4:
                GeloCremeDeLeite gelodecremedeleite = new GeloCremeDeLeite();
                gelodecremedeleite.prepareGeloCremeDeLeite();
                totalValue += gelodecremedeleite.getValue();
                CondimentosADC.add("Gelo de creme de Leite - Cubo");
                break;
            case 5:
                LeiteCondensado leitecondensado = new LeiteCondensado();
                leitecondensado.prepareLeiteCondensado();
                totalValue += leitecondensado.getValue();
                CondimentosADC.add("Leite Condensado - Colher");
                break;
            case 6:
                Chocolate chocolatepo = new Chocolate();
                chocolatepo.prepareChocolate();
                totalValue += chocolatepo.getValue();
                CondimentosADC.add("Chocolate em Po - Colher");
                break;
            case 7:
                Cookie cookie = new Cookie();
                cookie.prepareCookie();
                totalValue += cookie.getValue();
              CondimentosADC.add("Cookie - Unidade");
                break;
        }
    }

    public void maisCondimentosADC() {
        Scanner sc = new Scanner(System.in);
        while (validator == 1) {
            System.out.println("Adquirir adicional?");
            System.out.println("[1] - Sim");
            System.out.println("[2] - Nao");
            validator(sc.nextInt());
        }

    }

    private void validator(int op) {
        switch (op) {
            case 1:
                selectCondimentosADC();
                break;
            case 2:
                validator -= 1;
                break;
        }

    }

    public double getTotalValue() {
        return totalValue;
    }

    public ArrayList<String> getCondimentosADC() {
        return CondimentosADC;
    }

    public ArrayList<String> getBebidas() {
        return Bebidas;
    } 
}

