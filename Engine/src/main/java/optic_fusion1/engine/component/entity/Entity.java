package optic_fusion1.engine.component.entity;

import java.util.UUID;
import optic_fusion1.engine.component.Component;

public abstract class Entity extends Component {

  private UUID uniqueId;
  
  public Entity(String name) {
    super(name);
    uniqueId = UUID.randomUUID();
  }
  
  public UUID getUniqueId(){
    return uniqueId;
  }

}
