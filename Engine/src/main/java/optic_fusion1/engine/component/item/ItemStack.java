package optic_fusion1.engine.component.item;

import optic_fusion1.engine.component.Component;

public abstract class ItemStack extends Component{

  public ItemStack(String name) {
    super(name);
  }

  public abstract int getAmount();

  public abstract void setAmount(int amount);

  public abstract int getMaxAmount();

  public abstract void setMaxAmount(int maxAmount);

}
