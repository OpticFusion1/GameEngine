package optic_fusion1.engine.component.inventory;

import optic_fusion1.engine.component.Component;
import optic_fusion1.engine.component.item.ItemStack;

public abstract class Inventory extends Component {

  public Inventory(String name) {
    super(name);
  }

  public abstract int getSize();

  public abstract void setSize(int size);

  public abstract ItemStack getItemStack(int slot);

  public abstract void addItemStack(ItemStack itemStack);

  public abstract void removeItemStack(int slot);

  public abstract void setItemStack(int slot, ItemStack itemStack);

  public abstract boolean isValidSlot(int slot);

}
