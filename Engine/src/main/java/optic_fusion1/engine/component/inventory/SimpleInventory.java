package optic_fusion1.engine.component.inventory;

import java.util.ArrayList;
import java.util.List;
import optic_fusion1.engine.component.item.Item;
import optic_fusion1.engine.game.Game;

public class SimpleInventory extends Inventory {

  private static final List<Item> ITEMS = new ArrayList<>();
  private int size;

  public SimpleInventory(String name, int size, Game game) {
    super(name, game);
    this.size = size;
  }

  @Override
  public void tick() {
  }

  @Override
  public void render() {
  }

  public int getItemAmount() {
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
  public Item getItem(int slot) {
    return ITEMS.get(slot);
  }

  @Override
  public void setItem(int slot, Item item) {
    if (!isValidSlot(slot)) {
      return;
    }
    ITEMS.set(size, item);
  }

  @Override
  public void addItem(Item item) {
    if (ITEMS.size() >= size) {
      return;
    }
    for (Item itemStack : ITEMS) {
      if (itemStack.getMaterial() == item.getMaterial()) {
        int maxAmount = item.getMaterial().getMaxAmount();
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
  public void removeItem(int slot) {
    ITEMS.remove(slot);
  }

  @Override
  public boolean isValidSlot(int slot) {
    return slot < 0 ? false : slot < size;
  }

  @Override
  public boolean hasItem(Item item) {
    return ITEMS.stream().filter(itemStack -> (itemStack.getName().equals(item.getName()))).anyMatch(itemStack -> (itemStack.getMaterial() == item.getMaterial()));
  }
}
