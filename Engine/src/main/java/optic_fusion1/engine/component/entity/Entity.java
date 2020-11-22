package optic_fusion1.engine.component.entity;

import optic_fusion1.engine.component.Component;
import optic_fusion1.engine.game.Game;

public abstract class Entity extends Component {

  public Entity(String name, Game game) {
    super(name, game);
  }

}
