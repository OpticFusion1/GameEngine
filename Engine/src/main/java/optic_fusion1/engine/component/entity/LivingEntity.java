package optic_fusion1.engine.component.entity;

import optic_fusion1.engine.game.Game;

public abstract class LivingEntity extends Entity {

  public LivingEntity(String name, Game game) {
    super(name, game);
  }
  
  public abstract int getHealth();
  
  public abstract int getMaxHealth();
  
  public abstract void heal(int amount);
  
  public abstract void damage(int amount);
  
  public abstract boolean isHurt();
  
  public abstract boolean isDead();

}
