package optic_fusion1.engine.component.item;

import optic_fusion1.engine.component.item.material.Material;
import static optic_fusion1.engine.game.Game.LOGGER;

public class SimpleItem extends Item {

  private Material material;

  public SimpleItem(String displayName, Material material) {
    super(displayName);
    this.material = material;
  }

  @Override
  public void use() {
    LOGGER.info(getName() + " has been used");
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
