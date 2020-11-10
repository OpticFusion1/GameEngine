package optic_fusion1.engine.component.item.material;

import java.util.Collection;
import java.util.HashMap;

public class MaterialManager {

  private static final HashMap<String, Material> MATERIALS = new HashMap<>();

  public Collection<Material> getMaterials() {
    return MATERIALS.values();
  }

  public Material getMaterial(String name) {
    return MATERIALS.get(name);
  }

  public void addMaterial(Material material) {
    MATERIALS.putIfAbsent(material.getName(), material);
  }

}
