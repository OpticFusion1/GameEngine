package optic_fusion1.engine.component.item;

import optic_fusion1.engine.component.Component;
import optic_fusion1.engine.game.Game;

public abstract class ItemStack extends Component {

  public ItemStack(String displayName, Game game) {
    super(displayName, game);
  }
  
  public abstract Item getItem();

  public abstract int getAmount();

  public abstract void setAmount(int amount);

}
