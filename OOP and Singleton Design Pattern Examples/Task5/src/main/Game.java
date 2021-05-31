package main;

import java.io.*;

public class Game {
  // The BufferedReader used throughout
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    // Ask whether to play a card game or a die game

    System.out.print("Card (c) or Die (d) game? ");
    String ans=br.readLine();

    if (ans.equals("c")) {
      CardGame game = new CardGame();
      game.playCardGame();
    }

    else if (ans.equals("d")) {
      DieGame game = new DieGame();
      game.playDieGame();
    }

    else System.out.println("Input not understood");
  }
}

