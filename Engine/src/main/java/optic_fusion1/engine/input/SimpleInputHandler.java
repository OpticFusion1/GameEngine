package optic_fusion1.engine.input;

import java.util.Scanner;
import optic_fusion1.engine.game.Game;

public class SimpleInputHandler extends Thread implements InputHandler {

  private static final Scanner SCANNER = new Scanner(System.in);
  private Game game;

  public SimpleInputHandler(Game game) {
    this.game = game;
  }

  @Override
  public void run() {
    while (game.isRunning()) {
      String input = game.getScanner().nextLine();
      if (input == null || input.isEmpty()) {
        continue;
      }
      handleInput(input);
    }
  }

  @Override
  public void handleInput(String input) {
    if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("end")) {
      SCANNER.close();
      game.endGame();
    }
  }

}
