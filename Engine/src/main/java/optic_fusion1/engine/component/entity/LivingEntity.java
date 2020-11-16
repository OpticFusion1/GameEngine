package optic_fusion1.engine.component.entity;

public abstract class LivingEntity extends Entity {

  public LivingEntity(String name) {
    super(name);
  }
  
  public abstract int getHealth();
  
  public abstract int getMaxHealth();
  
  public abstract void heal(int amount);
  
  public abstract void damage(int amount);
  
  public abstract boolean isHurt();
  
  public abstract boolean isDead();

}
