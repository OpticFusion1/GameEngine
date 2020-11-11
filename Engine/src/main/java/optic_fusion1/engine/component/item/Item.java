package optic_fusion1.engine.component.item;

import optic_fusion1.engine.component.Component;
import optic_fusion1.engine.component.item.material.Material;

public abstract class Item extends Component {

  public Item(String displayName) {
    super(displayName);
  }
  
  public abstract void use();

  public abstract Material getMaterial();

  public abstract void setMaterial(Material material);

}
