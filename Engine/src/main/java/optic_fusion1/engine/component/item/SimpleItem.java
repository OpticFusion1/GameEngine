package optic_fusion1.engine.component.item;

import optic_fusion1.engine.component.item.material.Material;

public class SimpleItem extends Item {

  private Material material;

  public SimpleItem(String displayName) {
    super(displayName);
  }

  @Override
  public Material getMaterial() {
    return material;
  }

  @Override
  public void setMaterial(Material material) {
    this.material = material;
  }

}
