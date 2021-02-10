package optic_fusion1.engine.component.inventory;

import optic_fusion1.engine.component.Component;
import optic_fusion1.engine.component.item.Item;
import optic_fusion1.engine.game.Game;

public abstract class Inventory extends Component {

  public Inventory(String name, Game game) {
    super(name, game);
  }

  public abstract boolean hasItem(Item item);
  
  public abstract int getSize();

  public abstract void setSize(int size);

  public abstract Item getItem(int slot);

  public abstract void addItem(Item Item);

  public abstract void removeItem(int slot);

  public abstract void setItem(int slot, Item item);

  public abstract boolean isValidSlot(int slot);

}
