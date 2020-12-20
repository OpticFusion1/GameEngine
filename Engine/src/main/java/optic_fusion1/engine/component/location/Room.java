package optic_fusion1.engine.component.location;

import java.util.Collection;
import java.util.HashMap;

public abstract class Room {

  private String name;
  private String shortDescription;
  private String longDescription;
  private HashMap<Direction, Room> EXITS = new HashMap<>();

  public Room(String name, String shortDescription, String longDescription) {
    this.name = name;
    this.shortDescription = shortDescription;
    this.longDescription = longDescription;
  }
  
  public abstract void enter();

  public String getName() {
    return name;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public String getLongDescription() {
    return longDescription;
  }

  public void setRoom(Direction direction, Room room) {
    EXITS.put(direction, room);
  }

  public Collection<Room> getExits() {
    return EXITS.values();
  }
  
  public Room getRoom(Direction direction){
    return EXITS.get(direction);
  }

}
