package optic_fusion1.engine.game;

import java.util.Scanner;
import optic_fusion1.engine.component.item.material.MaterialManager;
import optic_fusion1.engine.input.InputHandler;
import optic_fusion1.engine.logging.CustomLogger;
import optic_fusion1.engine.utils.Utils;

public abstract class Game {

  private static final Scanner SCANNER = new Scanner(System.in);
  private static final MaterialManager MATERIAL_MANAGER = new MaterialManager();
  public static final CustomLogger LOGGER = new CustomLogger();
  private boolean running;
  private InputHandler inputHandler;
  private GameInfo gameInfo;

  public abstract void startGame();

  public abstract void run();

  public abstract void tick();

  public abstract void endGame();

  public void setRunning(boolean isRunning) {
    this.running = isRunning;
  }

  public boolean isRunning() {
    return running;
  }

  public void setInputHandler(InputHandler inputHandler) {
    this.inputHandler = inputHandler;
  }

  public InputHandler getInputHandler() {
    return inputHandler;
  }

  public void init() {
    Utils.clearScreen();
    (gameInfo = new GameInfo()).load();
  }

  public GameInfo getGameInfo() {
    return gameInfo;
  }

  public Scanner getScanner() {
    return SCANNER;
  }
  
  public MaterialManager getMaterialManager(){
    return MATERIAL_MANAGER;
  }

}
