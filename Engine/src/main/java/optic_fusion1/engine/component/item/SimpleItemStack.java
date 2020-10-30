package optic_fusion1.engine.component.item;

public class SimpleItemStack extends ItemStack {

  private int amount;
  private int maxAmount;

  public SimpleItemStack(String name, int amount, int maxAmount) {
    super(name);
    this.amount = amount;
    this.maxAmount = maxAmount;
  }

  @Override
  public int getAmount() {
    return this.amount;
  }

  @Override
  public void setAmount(int amount) {
    this.amount = amount;
  }

  @Override
  public int getMaxAmount() {
    return this.maxAmount;
  }

  @Override
  public void setMaxAmount(int amount) {
    this.maxAmount = amount;
  }
}
