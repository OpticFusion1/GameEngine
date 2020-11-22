package optic_fusion1.engine.component.item;

import optic_fusion1.engine.game.Game;

public class SimpleItemStack extends ItemStack {

  private Item item;
  private int amount;

  public SimpleItemStack(String displayName, Item item, Game game) {
    this(displayName, item, 1, game);
  }

  public SimpleItemStack(String displayName, Item item, int amount, Game game) {
    super(displayName, game);
    this.item = item;
    this.amount = amount;
  }
  
  @Override
  public Item getItem(){
    return item;
  }

  @Override
  public int getAmount() {
    return this.amount;
  }

  @Override
  public void setAmount(int amount) {
    this.amount = amount;
  }

}
