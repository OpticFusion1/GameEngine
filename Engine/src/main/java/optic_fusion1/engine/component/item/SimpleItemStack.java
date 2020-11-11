package optic_fusion1.engine.component.item;

public class SimpleItemStack extends ItemStack {

  private Item item;
  private int amount;

  public SimpleItemStack(String displayName, Item item) {
    this(displayName, item, 1);
  }

  public SimpleItemStack(String displayName, Item item, int amount) {
    super(displayName);
    this.item = item;
    this.amount = amount;
  }
  
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
