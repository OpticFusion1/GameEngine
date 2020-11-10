package optic_fusion1.engine.component.item;

import optic_fusion1.engine.component.item.material.Material;

public class SimpleItemStack extends ItemStack {

  private Material material;
  private int amount;

  public SimpleItemStack(Material material) {
    this(material, 1);
  }

  public SimpleItemStack(Material material, int amount) {
    super(material.getName());
    this.material = material;
    this.amount = amount;
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
  public Material getMaterial(){
    return material;
  }
  
  @Override
  public void setMaterial(Material material){
    this.material = material;
  }

}
