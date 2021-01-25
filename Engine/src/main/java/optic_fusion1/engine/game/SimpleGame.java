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
    init();
    long lastTime = System.nanoTime();
    final double amountOfTicks = 60.0;
    double ns = 1000000000 / amountOfTicks;
    double delta = 0;
    int updates = 0;
    int frames = 0;
    long timer = System.currentTimeMillis();

    while (isRunning()) {
      long now = System.nanoTime();
      delta += (now - lastTime) / ns;
      lastTime = now;
      if (delta >= 1) {
        tick();
        updates++;
        delta--;
      }
      frames++;
      if (System.currentTimeMillis() - timer > 1000) {
        timer += 1000;
        if(isDebuggingEnabled()){
          LOGGER.info(updates + " Ticks, FPS " + frames);
        }
        updates = 0;
        frames = 0;
      }
    }
    endGame();
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
