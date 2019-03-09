package dicegame;

import dicegame.players.Player;
import java.util.Random;

/**
 * Gra w odgadywanie wylosowanej liczby.
 * 
 * Zasady:
 * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracz (też komputer) stara się odgadnąć liczbę (też losuje)
 * - jeżeli odgadnie, gra się kończy
 * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        //bzzz

        Random dice = new Random();
       
        Player player = new Player();
          
        
        int number;
        int guess;
        
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane: " + number);
            
            guess = player.guess();
            
            System.out.println("Strzał: " + guess);

            if (guess == number) {
                System.out.println("DOBRZE!");
            } else {
                System.out.println("ŹLE!");
            }

        } while (guess != number);
    
    }
    
}
