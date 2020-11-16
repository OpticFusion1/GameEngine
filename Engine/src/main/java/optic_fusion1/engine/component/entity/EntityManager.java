package optic_fusion1.engine.component.entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class EntityManager {

  private static final HashMap<UUID, Entity> ENTITIES = new HashMap<>();

  public Collection<Entity> getEntities() {
    return ENTITIES.values();
  }

  public Entity getEntityByName(String name) {
    for (Entity entity : ENTITIES.values()) {
      if (entity.getName().equals(name)) {
        return entity;
      }
    }
    return null;
  }

  public Entity getEntityByUUID(UUID uniqueId) {
    return ENTITIES.get(uniqueId);
  }

  public void addEntity(Entity entity) {
    ENTITIES.putIfAbsent(entity.getUniqueId(), entity);
  }
  
  public void removeEntity(UUID uuid){
    ENTITIES.remove(uuid);
  }

}
