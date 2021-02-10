package optic_fusion1.engine.component.item;

import optic_fusion1.engine.component.item.material.Material;
import optic_fusion1.engine.game.Game;
import static optic_fusion1.engine.game.Game.LOGGER;

public class SimpleItem extends Item {

  private Material material;
  private int amount;

  public SimpleItem(String displayName, Material material, Game game) {
    this(displayName, material, 1, game);
  }

  public SimpleItem(String displayName, Material material, int amount, Game game) {
    super(displayName, game);
    this.material = material;
    this.amount = amount;
  }

  @Override
  public void tick() {
  }

  @Override
  public void render() {
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

  @Override
  public int getAmount() {
    return this.amount;
  }

  @Override
  public void setAmount(int amount) {
    this.amount = amount;
  }

}
