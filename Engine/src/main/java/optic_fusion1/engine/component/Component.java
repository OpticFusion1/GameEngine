package optic_fusion1.engine.component;

import java.util.UUID;
import optic_fusion1.engine.game.Game;

public abstract class Component {

  private static UUID uniqueId;
  private String name;
  private Game game;

  public Component(String name, Game game) {
    this.name = name;
    this.game = game;
    uniqueId = UUID.randomUUID();
  }

  public abstract void tick();

  public abstract void render();

  public Game getGame() {
    return game;
  }

  public String getName() {
    return name;
  }

  public UUID getUniqueId() {
    return uniqueId;
  }

}
