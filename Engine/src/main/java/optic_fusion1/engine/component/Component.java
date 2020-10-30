package optic_fusion1.engine.component;

import java.util.UUID;

public abstract class Component {

  private static UUID uniqueId = UUID.randomUUID();
  private String name;
  
  public Component(String name){
    this.name = name;
  }
  
  public String getName(){
    return name;
  }
  
  public UUID getUniqueId(){
    return uniqueId;
  }
  
}
