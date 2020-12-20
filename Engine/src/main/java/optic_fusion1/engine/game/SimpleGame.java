package optic_fusion1.engine.game;

import optic_fusion1.engine.input.SimpleInputHandler;

public abstract class SimpleGame extends Game {

  private boolean useDefaultInputHandler = false;

  @Override
  public void run() {
    if (useDefaultInputHandler) {
      SimpleInputHandler simpleInputHandler = new SimpleInputHandler(this);
      setInputHandler(simpleInputHandler);
      simpleInputHandler.start();
    }
    while (isRunning()) {
      tick();
    }
  }

  @Override
  public void endGame() {
    setRunning(false);
    if (getInputHandler() != null) {
      ((SimpleInputHandler) getInputHandler()).interrupt();
    }
  }

  public void useDefaultInputHandler() {
    useDefaultInputHandler = true;
  }

}
