
/**
 * Jogo 21 desenvolvido na aula de Fundamendos da Programação.
 * 
 * @author Felipe Rodrigues / felipe.rodrigues@edu.pucrs.br
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Random;

public class Blackjack {
    
    public static void main(String [] args) {
        Scanner sc;
        Random r;
        int c1, c2;
        int h1, h2;
        
        r = new Random();
        
        c1 = 1 + r.nextInt(13);
        c2 = 1 + r.nextInt(13);
        
        h1 = 1 + r.nextInt(13);
        h2 = 1 + r.nextInt(13);
        
        System.out.printf("COMPUTADOR%n");
        System.out.printf("Carta 1: %d%n",c1);
        System.out.printf("carta 2: %d%n",c2);
        System.out.printf("Total: %d%n",c1 + c2);
        
        System.out.printf("HUMANO%n");
        System.out.printf("Carta 1: %d%n",h1);
        System.out.printf("carta 2: %d%n",h2);
        System.out.printf("Total: %d%n",h1 + h2);
    }
}
