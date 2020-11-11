package optic_fusion1.engine.component.item;

import optic_fusion1.engine.component.Component;
import optic_fusion1.engine.component.item.material.Material;

public abstract class ItemStack extends Component {

  public ItemStack(String displayName) {
    super(displayName);
  }

  public abstract Material getMaterial();

  public abstract void setMaterial(Material material);

  public abstract int getAmount();

  public abstract void setAmount(int amount);

}
