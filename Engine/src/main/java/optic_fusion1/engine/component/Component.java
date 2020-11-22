package optic_fusion1.engine.component;

import java.util.UUID;
import optic_fusion1.engine.game.Game;

public abstract class Component {

  private static UUID uniqueId = UUID.randomUUID();
  private String name;
  private Game game;
  
  public Component(String name, Game game){
    this.name = name;
  }
  
  public Game getGame(){
    return game;
  }
  
  public String getName(){
    return name;
  }
  
  public UUID getUniqueId(){
    return uniqueId;
  }
  
}
