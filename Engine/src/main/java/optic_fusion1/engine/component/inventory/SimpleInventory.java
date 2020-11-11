package optic_fusion1.engine.component.inventory;

import java.util.ArrayList;
import java.util.List;
import optic_fusion1.engine.component.item.ItemStack;

public class SimpleInventory extends Inventory {

  private static final List<ItemStack> ITEMS = new ArrayList<>();
  private int size;

  public SimpleInventory(String name, int size) {
    super(name);
    this.size = size;
  }

  public int getItemStackAmount() {
    return ITEMS.size();
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public ItemStack getItemStack(int slot) {
    return ITEMS.get(slot);
  }

  @Override
  public void setItemStack(int slot, ItemStack item) {
    if (!isValidSlot(slot)) {
      return;
    }
    ITEMS.set(size, item);
  }

  @Override
  public void addItemStack(ItemStack item) {
    if (ITEMS.size() >= size) {
      return;
    }
    for (ItemStack itemStack : ITEMS) {
      if (itemStack.getItem().getMaterial() == item.getItem().getMaterial()) {
        int maxAmount = item.getItem().getMaterial().getMaxAmount();
        if (item.getAmount() != maxAmount) {
          int j = Math.min(item.getAmount(), maxAmount - itemStack.getAmount());
          if (j > 0) {
            itemStack.setAmount(itemStack.getAmount() + j);
            item.setAmount(item.getAmount() - j);
          }
        }
      }
    }
    if (item.getAmount() != 0) {
      ITEMS.add(item);
    }
  }

  @Override
  public void removeItemStack(int slot) {
    ITEMS.remove(slot);
  }

  @Override
  public boolean isValidSlot(int slot) {
    return slot < 0 ? false : slot < size;
  }
}
