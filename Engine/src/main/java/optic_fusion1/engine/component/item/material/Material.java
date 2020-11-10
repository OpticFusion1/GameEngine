package optic_fusion1.engine.component.item.material;

public class Material {

  private String name;
  private int maxAmount;

  public Material(String type) {
    this(type, 64);
  }

  public Material(String type, int maxAmount) {
    this.name = type;
    this.maxAmount = maxAmount;
  }

  public String getName() {
    return name;
  }

  public int getMaxAmount() {
    return maxAmount;
  }

}
