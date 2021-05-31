package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DieGame {
    // The BufferedReader used throughout
    private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    // The random number generator used throughout
    private RandomInterface r=new LinearCongruentialGenerator();

    //Variable(s) used in the die game methods
    private HashSet<Integer> numbersRolled=new HashSet<Integer>();

    private void initialiseDieGame() throws Exception {
        // The initialisation phase:

        // Actually there isn't anything to do here
    }

    private void mainDieGame() throws Exception {
        // The main game:

        // Let the user roll the die twice
        for (int i=0; i<2; i++) {
            System.out.println("Hit <RETURN> to roll the die");
            br.readLine();
            int dieRoll=(int)(r.next() * 6) + 1;

            System.out.println("You rolled " + dieRoll);
            numbersRolled.add(new Integer(dieRoll));
        }

        // Display the numbers rolled
        System.out.println("Numbers rolled: " + numbersRolled);
    }

    private void declareDieGameWinner() throws Exception {
        // Declare the winner:

        // User wins if at least one of the die rolls is a 1
        if (numbersRolled.contains(new Integer(1))) {
            System.out.println("You won!");
        }
        else System.out.println("You lost!");
    }

    public void playDieGame() throws Exception {
        // Play die game:

        // Initialise the game
        initialiseDieGame();

        // Play the main game phase
        mainDieGame();

        // Now see if (s)he has won!
        declareDieGameWinner();
    }
}
