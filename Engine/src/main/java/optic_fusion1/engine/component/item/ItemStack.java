package optic_fusion1.engine.component.item;

import optic_fusion1.engine.component.Component;

public abstract class ItemStack extends Component {

  public ItemStack(String displayName) {
    super(displayName);
  }
  
  public abstract Item getItem();

  public abstract int getAmount();

  public abstract void setAmount(int amount);

}
