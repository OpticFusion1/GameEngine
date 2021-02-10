package optic_fusion1.engine.component.item;

import optic_fusion1.engine.component.Component;
import optic_fusion1.engine.component.item.material.Material;
import optic_fusion1.engine.game.Game;

public abstract class Item extends Component {

  public Item(String displayName, Game game) {
    super(displayName, game);
  }

  public abstract void use();

  public abstract Material getMaterial();

  public abstract void setMaterial(Material material);
  
  public abstract int getAmount();
  
  public abstract void setAmount(int amount);

}
